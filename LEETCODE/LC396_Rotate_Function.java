/*You are given an integer array nums of length n.

Assume arrk to be an array obtained by rotating nums by k positions clock-wise. We define the rotation function F on nums as follow:

F(k) = 0 * arrk[0] + 1 * arrk[1] + ... + (n - 1) * arrk[n - 1].
Return the maximum value of F(0), F(1), ..., F(n-1).

The test cases are generated so that the answer fits in a 32-bit integer.

 */

//solution in java
class Solution {
    public int maxRotateFunction(int[] nums) {
      int n=nums.length,f=0,res,s=0;
      for(int i=0;i<n;i++){
        s+=nums[i];
        f+=i*nums[i];
      }
      res=f;
      for(int i=1;i<n;i++){
        f=f+s-n*nums[n-i];
        if(f>res)
        res=f;
      }
      return res;
    }
}