class Solution {
    public int threeSumClosest(int[] nums, int target) {
         int res=10000,d=100007,n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){
            int a=nums[i],l=i+1,r=n-1;
            while(l<r){
                int s=a+nums[l]+nums[r];
                if(d>Math.abs(target-s)){
                    d=Math.abs(target-s);
                    res=s;
                }
                if(s>target) r--;
                else l++;
            }
        }
        return res;
    }
}