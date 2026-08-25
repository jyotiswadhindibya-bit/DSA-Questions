<!-- problem:start -->

# [Maximum Absolute Sum of Any Subarray](https://leetcode.com/problems/maximum-absolute-sum-of-any-subarray)

## Description

<!-- description:start -->

<p>You are given an integer array <code>nums</code>. The <strong>absolute sum</strong> of a subarray <code>[nums<sub>l</sub>, nums<sub>l+1</sub>, ..., nums<sub>r-1</sub>, nums<sub>r</sub>]</code> is <code>abs(nums<sub>l</sub> + nums<sub>l+1</sub> + ... + nums<sub>r-1</sub> + nums<sub>r</sub>)</code>.</p>

<p>Return <em>the <strong>maximum</strong> absolute sum of any <strong>(possibly empty)</strong> subarray of </em><code>nums</code>.</p>

<p>Note that <code>abs(x)</code> is defined as follows:</p>

<ul>
	<li>If <code>x</code> is a negative integer, then <code>abs(x) = -x</code>.</li>
	<li>If <code>x</code> is a non-negative integer, then <code>abs(x) = x</code>.</li>
</ul>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,-3,2,3,-4]
<strong>Output:</strong> 5
<strong>Explanation:</strong> The subarray [2,3] has absolute sum = abs(2+3) = abs(5) = 5.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [2,-5,1,-4,3,-2]
<strong>Output:</strong> 8
<strong>Explanation:</strong> The subarray [-5,1,-4] has absolute sum = abs(-5+1-4) = abs(-8) = 8.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
	<li><code>-10<sup>4</sup> &lt;= nums[i] &lt;= 10<sup>4</sup></code></li>
</ul>


<!-- description:end -->

## Solutions

<!-- solution:start -->

<!-- tabs:start -->

#### C++

```cpp
class Solution {
public:
    int maxAbsoluteSum(vector<int>& nums) {
        int n=nums.size();
        int maxbest=nums[0],maxres=nums[0],minbest=nums[0],minres=nums[0];
        for(int i=1;i<n;i++){
            maxbest=max(maxbest+nums[i],nums[i]);
            maxres=max(maxres,maxbest);
            minbest=min(minbest+nums[i],nums[i]);
            minres=min(minres,minbest);
        }
        return max(abs(maxres),abs(minres));
    }
};
```


#### Java

```java
class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n=nums.length;
        int maxbest=nums[0],maxres=nums[0],minbest=nums[0],minres=nums[0];
        for(int i=1;i<n;i++){
            maxbest=Math.max(maxbest+nums[i],nums[i]);
            maxres=Math.max(maxres,maxbest);
            minbest=Math.min(minbest+nums[i],nums[i]);
            minres=Math.min(minres,minbest);
        }
        return Math.max(Math.abs(maxres),Math.abs(minres));
    }
}
```
<!-- tabs:end -->

<!-- solution:end -->

<!-- problem:end -->
