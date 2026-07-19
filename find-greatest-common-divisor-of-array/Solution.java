class Solution {
    public int findGCD(int[] nums) {
        int n=nums.length,max=nums[0],min=nums[0];
        for(int i=1;i<n;i++){
            max=Math.max(nums[i],max);
            min=Math.min(nums[i],min);
        }

        int res=1;
        for(int i=2;i<=min;i++)
        if(max%i==0 && min%i==0) res=i;
        return res;
    }
}