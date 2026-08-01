<!-- problem:start -->

# [Max Sum Subarray of size K](https://practice.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313)

## Description

<!-- description:start -->

<p><span style="font-size: 18px;">Given an array of integers<strong> arr[]&nbsp;</strong> and a number<strong> k</strong>. Return&nbsp;the maximum sum of a subarray of size k.</span></p>
<p><span style="font-size: 14pt;"><strong>Note:</strong> A subarray is a contiguous part of any given array.</span></p>
<p><strong><span style="font-size: 18px;">Examples:</span></strong></p>
<pre><span style="font-size: 14pt;"><strong>Input:</strong> arr[] = [100, 200, 300, 400], k = 2
<strong>Output: </strong>700
<strong>Explanation: </strong>arr<sub>2</sub><sub> </sub>+ arr<sub>3</sub> = 700, which is maximum.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>arr[] = [1, 4, 2, 10, 23, 3, 1, 0, 20], k = 4
<strong>Output: </strong>39
<strong>Explanation: </strong>arr<sub>1</sub> + arr<sub>2</sub> + arr<sub>3 </sub>+ arr<sub>4</sub> = 39, </span><span style="font-size: 18px;"><span style="font-size: 14pt;">which is maximum.</span><br></span></pre>
<pre><span style="font-size: 18px;"><span style="font-size: 14pt;"><strong>Input:</strong> arr[] = [100, 200, 300, 400], k = 1
<strong>Output: </strong>400
<strong>Explanation: </strong>arr<sub>3</sub> = 400, which is maximum.</span></span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ arr.size() ≤ 10<sup>6<br></sup>0 ≤ arr[i] ≤ 10<sup>6<br></sup></span><span style="font-size: 18px;">1 ≤ k ≤ arr.size()</span></p>

<!-- description:end -->

## Solutions

<!-- solution:start -->

<!-- tabs:start -->

#### Java

```java
class Solution {
    public int maxSubarraySum(int[] arr, int k) {
       int res=-1,n=arr.length,l=0,s=0;
        for(int r=0;r<n;r++){
            s+=arr[r];
            if(r-l+1>k) s-=arr[l++];
            if(r-l+1==k) res=Math.max(res,s);
        }
        return res;
    }
}
```

#### C++

```cpp
class Solution {
  public:
    int maxSubarraySum(vector<int>& arr, int k) {
        int res=-1,n=arr.size(),l=0,s=0;
        for(int r=0;r<n;r++){
            s+=arr[r];
            if(r-l+1>k) s-=arr[l++];
            if(r-l+1==k) res=max(res,s);
        }
        return res;
    }
};
```

<!-- tabs:end -->

<!-- solution:end -->

<!-- problem:end -->
