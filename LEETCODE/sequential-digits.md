<!-- problem:start -->

# [Sequential Digits](https://leetcode.com/problems/sequential-digits)

## Description

<!-- description:start -->

<p>An&nbsp;integer has <em>sequential digits</em> if and only if each digit in the number is one more than the previous digit.</p>

<p>Return a <strong>sorted</strong> list of all the integers&nbsp;in the range <code>[low, high]</code>&nbsp;inclusive that have sequential digits.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<pre><strong>Input:</strong> low = 100, high = 300
<strong>Output:</strong> [123,234]
</pre><p><strong class="example">Example 2:</strong></p>
<pre><strong>Input:</strong> low = 1000, high = 13000
<strong>Output:</strong> [1234,2345,3456,4567,5678,6789,12345]
</pre>
<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>10 &lt;= low &lt;= high &lt;= 10^9</code></li>
</ul>


<!-- description:end -->

## Solutions

<!-- solution:start -->

<!-- tabs:start -->

#### Java

```java
class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> res=new ArrayList<>();
        for (int i=1;i<=9;i++){
            int n=i;
            for (int j=i+1;j<=9;j++){
                n=n*10+j;
                if (n>=low && n<=high)
                    res.add(n);
            }
        }
        Collections.sort(res);
        return res;
    }
}
```


#### C++

```cpp
class Solution {
public:
    vector<int> sequentialDigits(int low, int high) {
        vector<int> res;
        for (int i=1;i<=9;i++){
            int n=i;
            for (int j=i+1;j<=9;j++){
                n=n*10+j;
                if (n>=low && n<=high)
                    res.push_back(n);
            }
        }
        sort(res.begin(),res.end());
        return res;
    }
};
```
<!-- tabs:end -->

<!-- solution:end -->

<!-- problem:end -->
