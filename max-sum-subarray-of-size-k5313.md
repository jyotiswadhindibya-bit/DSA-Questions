<!-- problem:start -->

# [Max Sum Subarray of size K](https://practice.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313)

## Description

<!-- description:start -->

<p>Problem description not available.</p>

<!-- description:end -->

## Solutions

<!-- solution:start -->

<!-- tabs:start -->

#### Java

```java
https://www.geeksforgeeks.org
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
