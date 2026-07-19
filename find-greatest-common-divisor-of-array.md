<!-- problem:start -->

# [Find Greatest Common Divisor of Array](https://leetcode.com/problems/find-greatest-common-divisor-of-array)

## Description

<!-- description:start -->

<p>Given an integer array <code>nums</code>, return<strong> </strong><em>the <strong>greatest common divisor</strong> of the smallest number and largest number in </em><code>nums</code>.</p>

<p>The <strong>greatest common divisor</strong> of two numbers is the largest positive integer that evenly divides both numbers.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [2,5,6,9,10]
<strong>Output:</strong> 2
<strong>Explanation:</strong>
The smallest number in nums is 2.
The largest number in nums is 10.
The greatest common divisor of 2 and 10 is 2.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [7,5,6,8,3]
<strong>Output:</strong> 1
<strong>Explanation:</strong>
The smallest number in nums is 3.
The largest number in nums is 8.
The greatest common divisor of 3 and 8 is 1.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> nums = [3,3]
<strong>Output:</strong> 3
<strong>Explanation:</strong>
The smallest number in nums is 3.
The largest number in nums is 3.
The greatest common divisor of 3 and 3 is 3.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>2 &lt;= nums.length &lt;= 1000</code></li>
	<li><code>1 &lt;= nums[i] &lt;= 1000</code></li>
</ul>


<!-- description:end -->

## Solutions

<!-- solution:start -->

<!-- tabs:start -->

#### C++

```cpp
class Solution {
public:
    int findGCD(vector<int>& nums) {
        int lar=nums[0],sml=nums[0],n=nums.size();
        for(int i=1;i<n;i++){
            lar=max(lar,nums[i]);
            sml=min(sml,nums[i]);
        }
        return gcd(sml,lar);
    }
};
```


#### Java

```java
class Solution {
    public int findGCD(int[] nums) {
        int n=nums.length,max=nums[0],min=nums[0];
        for(int i=1;i<n;i++){
            max=Math.max(nums[i],max);
            min=Math.min(nums[i],min);
        }

        int res=1;
        for(int i=2;i<=min;i++)
        if(max%i==0 && min%i==0) res=i;
        return res;
    }
}
```
<!-- tabs:end -->

<!-- solution:end -->

<!-- problem:end -->
