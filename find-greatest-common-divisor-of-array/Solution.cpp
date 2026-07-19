class Solution {
public:
    int findGCD(vector<int>& nums) {
        int lar=nums[0],sml=nums[0],n=nums.size();
        for(int i=1;i<n;i++){
            lar=max(lar,nums[i]);
            sml=min(sml,nums[i]);
        }
        return gcd(sml,lar);
    }
};