class Solution {
    public int findDuplicate(int[] nums) {
       int ind,n=nums.length;
       for(int i=0;i<n;i++){
        ind=Math.abs(nums[i]);
        if(nums[ind]<0) return Math.abs(nums[i]);
        nums[ind]*=-1;
       }
       return 0;
    }
}