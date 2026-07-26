<!-- problem:start -->

# [Maximum Product of Three Numbers](https://leetcode.com/problems/maximum-product-of-three-numbers)

## Description

<!-- description:start -->

<p>Given an integer array <code>nums</code>, <em>find three numbers whose product is maximum and return the maximum product</em>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<pre><strong>Input:</strong> nums = [1,2,3]
<strong>Output:</strong> 6
</pre><p><strong class="example">Example 2:</strong></p>
<pre><strong>Input:</strong> nums = [1,2,3,4]
<strong>Output:</strong> 24
</pre><p><strong class="example">Example 3:</strong></p>
<pre><strong>Input:</strong> nums = [-1,-2,-3]
<strong>Output:</strong> -6
</pre>
<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>3 &lt;= nums.length &lt;=&nbsp;10<sup>4</sup></code></li>
	<li><code>-1000 &lt;= nums[i] &lt;= 1000</code></li>
</ul>


<!-- description:end -->

## Solutions

<!-- solution:start -->

<!-- tabs:start -->

#### C++

```cpp
class Solution {
public:
    int maximumProduct(vector<int>& nums) {
        int l=-1001,s=-1001,t=-1001,n1=0,n2=0;
        for(const auto& d:nums){
            if(d>l) {
            t=s;
            s=l;
            l=d;
            }
           else if(d>s && d<=l){
            t=s;
            s=d;
           }
           else if(d>t && d<=s) t=d;
            if(d<n1){
                n2=n1;
                n1=d;
            }
            else if(d<n2 && d>=n1) n2=d;
        }
        return max(n1*n2*l,l*s*t);
    }
};
```

<!-- tabs:end -->

<!-- solution:end -->

<!-- problem:end -->
