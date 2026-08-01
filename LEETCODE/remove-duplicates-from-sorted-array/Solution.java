class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length,k=0;
        for(int i=1;i<n;i++)
            if(nums[k]!=nums[i]) nums[++k]=nums[i];
            return k+1;
    }
}