class Solution {
public:
    int threeSumClosest(vector<int>& nums, int target) {
        int res=-3000,d=10007,n=nums.size();
        sort(nums.begin(),nums.end());
        for(int i=0;i<n-2;i++){
            int a=nums[i],l=i+1,r=n-1;
            while(l<r){
                int s=a+nums[l]+nums[r];
                if(d>abs(target-s)){
                    d=abs(target-s);
                    res=s;
                }
                if(s>target) r--;
                else l++;
            }
        }
        return res;
    }
};