<!-- problem:start -->

# [Minimum Operations to Reduce X to Zero](https://leetcode.com/problems/minimum-operations-to-reduce-x-to-zero)

## Description

<!-- description:start -->

<p>You are given an integer array <code>nums</code> and an integer <code>x</code>. In one operation, you can either remove the leftmost or the rightmost element from the array <code>nums</code> and subtract its value from <code>x</code>. Note that this <strong>modifies</strong> the array for future operations.</p>

<p>Return <em>the <strong>minimum number</strong> of operations to reduce </em><code>x</code> <em>to <strong>exactly</strong></em> <code>0</code> <em>if it is possible</em><em>, otherwise, return </em><code>-1</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,1,4,2,3], x = 5
<strong>Output:</strong> 2
<strong>Explanation:</strong> The optimal solution is to remove the last two elements to reduce x to zero.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [5,6,7,8,9], x = 4
<strong>Output:</strong> -1
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> nums = [3,2,20,1,1,3], x = 10
<strong>Output:</strong> 5
<strong>Explanation:</strong> The optimal solution is to remove the last three elements and the first two elements (5 operations in total) to reduce x to zero.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
	<li><code>1 &lt;= nums[i] &lt;= 10<sup>4</sup></code></li>
	<li><code>1 &lt;= x &lt;= 10<sup>9</sup></code></li>
</ul>


<!-- description:end -->

## Solutions

<!-- solution:start -->

<!-- tabs:start -->

#### C++

```cpp
class Solution {
public:
    int minOperations(vector<int>& nums, int x) {
        int k=-x,n=nums.size();
        for(int i=0;i<n;i++) k+=nums[i];
        if(k==0) return n;
        if(k<0) return -1;
        int l=0,s=0,res=-1;
        for(int r=0;r<n;r++){
            s+=nums[r];
            while(s>k) s-=nums[l++];
            if(s==k) res=max(res,r-l+1);
        }
        return res==-1?-1:n-res;
    }
};
```


#### Java

```java
class Solution {
    public int minOperations(int[] nums, int x) {
        int k=-x,n=nums.length;
        for(int i=0;i<n;i++) k+=nums[i];
        if(k==0) return n;
        if(k<0) return -1;
        int l=0,s=0,res=-1;
        for(int r=0;r<n;r++){
            s+=nums[r];
            while(s>k) s-=nums[l++];
            if(s==k) res=Math.max(res,r-l+1);
        }
        return res==-1?-1:n-res;
    }
}
```
<!-- tabs:end -->

<!-- solution:end -->

<!-- problem:end -->
