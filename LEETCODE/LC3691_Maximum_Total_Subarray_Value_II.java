/*
3691. Maximum Total Subarray Value II
Solved
Hard
Topics
premium lock icon
Companies
Hint
You are given an integer array nums of length n and an integer k.

You must select exactly k distinct subarrays nums[l..r] of nums. Subarrays may overlap, but the exact same subarray (same l and r) cannot be chosen more than once.

The value of a subarray nums[l..r] is defined as: max(nums[l..r]) - min(nums[l..r]).

The total value is the sum of the values of all chosen subarrays.

Return the maximum possible total value you can achieve.

 

Example 1:

Input: nums = [1,3,2], k = 2

Output: 4

Explanation:

One optimal approach is:

Choose nums[0..1] = [1, 3]. The maximum is 3 and the minimum is 1, giving a value of 3 - 1 = 2.
Choose nums[0..2] = [1, 3, 2]. The maximum is still 3 and the minimum is still 1, so the value is also 3 - 1 = 2.
Adding these gives 2 + 2 = 4.

Example 2:

Input: nums = [4,2,5,1], k = 3

Output: 12

Explanation:

One optimal approach is:

Choose nums[0..3] = [4, 2, 5, 1]. The maximum is 5 and the minimum is 1, giving a value of 5 - 1 = 4.
Choose nums[1..3] = [2, 5, 1]. The maximum is 5 and the minimum is 1, so the value is also 4.
Choose nums[2..3] = [5, 1]. The maximum is 5 and the minimum is 1, so the value is again 4.
Adding these gives 4 + 4 + 4 = 12.

 

Constraints:

1 <= n == nums.length <= 5 * 10​​​​​​​4
0 <= nums[i] <= 109
1 <= k <= min(105, n * (n + 1) / 2)
*/

//Solution in java
class SegTree{
    int maxv[];
    int minv[];
    int n;
    SegTree(int num[]){
        n=num.length;
        maxv=new int[4*n];
        minv=new int[4*n];
        build(1,0,n-1,num);
    }
    void build(int node,int l,int r,int nums[]){
        if(l==r){
            maxv[node]=minv[node]=nums[l];
            return;
        }
        int m=(l+r)/2;
        build(node*2,l,m,nums);
        build(node*2+1,m+1,r,nums);
        maxv[node]=Math.max(maxv[node*2],maxv[node*2+1]);
        minv[node]=Math.min(minv[node*2],minv[node*2+1]);
    }
    int queryMax(int node,int l,int r,int ql,int qr){
        if(ql<=l && r<=qr) return maxv[node];
        int m=(l+r)/2;
        int res=Integer.MIN_VALUE;
        if(ql<=m) res=Math.max(res,queryMax(node*2,l,m,ql,qr));
        if(qr>m) res=Math.max(res,queryMax(node*2+1,m+1,r,ql,qr));
        return res;
    }
    int queryMin(int node,int l,int r,int ql,int qr){
        if(ql<=l && r<=qr) return minv[node];
        int m=(l+r)/2;
        int res=Integer.MAX_VALUE;
        if(ql<=m) res=Math.min(res,queryMin(node*2,l,m,ql,qr));
        if(qr>m) res=Math.min(res,queryMin(node*2+1,m+1,r,ql,qr));
        return res;
    }
}
class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int n=nums.length;
        SegTree seg=new SegTree(nums);
        PriorityQueue<int []> pq=new PriorityQueue<>((a,b)->{
            if(a[0]!=b[0]) return Integer.compare(b[0],a[0]);
            if(a[1]!=b[1]) return Integer.compare(b[1],a[1]);
            return Integer.compare(b[2],a[2]);
        });
        for(int l=0;l<n;l++){
            int val=seg.queryMax(1,0,n-1,l,n-1)-seg.queryMin(1,0,n-1,l,n-1);
            pq.offer(new int[]{val,l,n-1});
        }
        long ans=0;
        while(k-->0 && !pq.isEmpty()){
            int top[]=pq.poll();
            int val=top[0];
            int l=top[1];
            int r=top[2];
            ans+=val;
            if(r>l){
                int newVal=seg.queryMax(1,0,n-1,l,r-1)-seg.queryMin(1,0,n-1,l,r-1);
                pq.offer(new int[]{newVal,l,r-1});
            }
        }
        return ans;
    }
}
