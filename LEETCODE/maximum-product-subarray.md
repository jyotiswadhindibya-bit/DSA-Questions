<!-- problem:start -->

# [Maximum Product Subarray](https://leetcode.com/problems/maximum-product-subarray)

## Description

<!-- description:start -->

<p>Given an integer array <code>nums</code>, find a <span data-keyword="subarray-nonempty">subarray</span> that has the largest product, and return <em>the product</em>.</p>

<p>The test cases are generated so that the answer will fit in a <strong>32-bit</strong> integer.</p>

<p><strong>Note</strong> that the product of an array with a single element is the value of that element.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [2,3,-2,4]
<strong>Output:</strong> 6
<strong>Explanation:</strong> [2,3] has the largest product 6.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [-2,0,-1]
<strong>Output:</strong> 0
<strong>Explanation:</strong> The result cannot be 2, because [-2,-1] is not a subarray.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 2 * 10<sup>4</sup></code></li>
	<li><code>-10 &lt;= nums[i] &lt;= 10</code></li>
	<li>The product of any subarray of <code>nums</code> is <strong>guaranteed</strong> to fit in a <strong>32-bit</strong> integer.</li>
</ul>


<!-- description:end -->

## Solutions

<!-- solution:start -->

<!-- tabs:start -->

#### C++

```cpp
class Solution {
public:
    int maxProduct(vector<int>& nums) {
        int n=nums.size();
        int maxbest=nums[0],minbest=nums[0],res=nums[0];
        for(int i=1;i<n;i++){
            int mini=minbest*nums[i];
            int maxi=maxbest*nums[i];
            minbest=min(nums[i],min(mini,maxi));
            maxbest=max(nums[i],max(mini,maxi));
            res=max(res,max(minbest,maxbest));
        }
        return res;
    }
};
```

<!-- tabs:end -->

<!-- solution:end -->

<!-- problem:end -->
