class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n-2;i++){
            int a=nums[i],l=i+1,r=n-1;
            if(i>0 && a==nums[i-1]) continue;
            while(l<r){
                if(nums[l]+nums[r]==-a){
                    res.add(Arrays.asList(a,nums[l++],nums[r--]));
                    while(l<n && nums[l]==nums[l-1]) l++;
                    while(r>=0 && nums[r]==nums[r+1]) r--;
                }
                else if(nums[l]+nums[r]>-a) r--;
                else  l++;
            }
        }
        return res;
    }
}