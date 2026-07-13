class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>> res;
        sort(nums.begin(),nums.end());
        int n=nums.size();
        for(int i=0;i<n-2;i++){
            if(i>0 && nums[i-1]==nums[i]) continue;
            int a=nums[i],l=i+1,r=n-1;
            while(l<r){
                if(-a==nums[l]+nums[r]){
                    res.push_back({a,nums[l++],nums[r--]});
                    while(l<n && nums[l-1]==nums[l]) l++;
                    while(r>=0 && nums[r]==nums[r+1]) r--;
                }
                else if(-a<nums[l]+nums[r]) r--;
                else l++;
            }
        }
        return res;
    }
};