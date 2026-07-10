class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
      vector<int> nums(n+m);
        int n1=0,n2=0,i=0;
        while(n1<m && n2<n){
            if(nums1[n1]<nums2[n2]) nums[i++]=nums1[n1++];
            else nums[i++]=nums2[n2++];
        }
        while(n1<m) nums[i++]=nums1[n1++];
        while(n2<n) nums[i++]=nums2[n2++];
        for(i=0;i<m+n;i++) nums1[i]=nums[i];
    }
};