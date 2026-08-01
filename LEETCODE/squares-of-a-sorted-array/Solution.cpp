class Solution {
public:
    vector<int> sortedSquares(vector<int>& nums) {
        int n=nums.size(),pos=-1,ele=nums[n-1];
        for(int i=0;i<n-1;i++)
        if(nums[i]<0 && nums[i+1]>=0){
            pos=i;break;
        }
        for(int i=0;i<n;i++) nums[i]*=nums[i];
        if(pos==-1 && ele>0){
            return nums;
        }
        vector<int> res(n);
        if(ele<=0){
            for(int i=0;i<n;i++) res[n-1-i]=nums[i];
            return res;
        }
        int l=pos,r=pos+1,i=0;
        while(l>=0 && r<n)
        if(nums[l]<nums[r]) res[i++]=nums[l--];
        else res[i++]=nums[r++];
        while(l>=0) res[i++]=nums[l--];
        while(r<n) res[i++]=nums[r++];
        return res;
    }
};