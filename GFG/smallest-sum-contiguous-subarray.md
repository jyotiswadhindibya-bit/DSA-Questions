<!-- problem:start -->

# [Minimum Sum Subarray](https://practice.geeksforgeeks.org/problems/smallest-sum-contiguous-subarray)

## Description

<!-- description:start -->

<p><span style="font-size: 18px;">Given an array <strong>arr[]</strong>, find the sub-array containing at least one number which has the minimum sum and return its sum.</span></p>
<p><strong><span style="font-size: 18px;">Examples :</span></strong></p>
<pre><span style="font-size: 18px;"><strong>Input:</strong> arr[] = [3,-4, 2,-3,-1, 7,-5]
<strong>Output:</strong> -6
<strong>Explanation: </strong>The subarray is [-4,2,-3,-1] = -6</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [2, 6, 8, 1, 4]
<strong>Output:</strong> 1
<strong>Explanation:</strong> The subarray is [1] = 1</span></pre>


<!-- description:end -->

## Solutions

<!-- solution:start -->

<!-- tabs:start -->

#### Java

```java
class Solution {
    public int minSubarraySum(int[] a) {
        int n=a.length;
        int best=a[0],res=a[0];
        for(int i=1;i<n;i++){
            best=Math.min(best+a[i],a[i]);
            res=Math.min(best,res);
        }
        return res;
     }
}
```


#### C++

```cpp
class Solution {
  public:
    int minSubarraySum(vector<int> &a) {
        int n=a.size();
        int best=a[0],res=a[0];
        for(int i=1;i<n;i++){
            best=min(best+a[i],a[i]);
            res=min(best,res);
        }
        return res;
    }
};
```
<!-- tabs:end -->

<!-- solution:end -->

<!-- problem:end -->
