class Solution {
    public int removeDuplicates(int[] nums) {
         int n=nums.length,k=2;
        if(n<=2) return n;
        for(int i=2;i<n;i++)
            if(nums[k-2]!=nums[i]) nums[k++]=nums[i];
            return k;
    }
}