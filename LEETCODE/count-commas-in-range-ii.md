<!-- problem:start -->

# [Count Commas in Range II](https://leetcode.com/problems/count-commas-in-range-ii)

## Description

<!-- description:start -->

<p>You are given an integer <code>n</code>.</p>

<p>Return the <strong>total</strong> number of commas used when writing all integers from <code>[1, n]</code> (inclusive) in <strong>standard</strong> number formatting.</p>

<p>In <strong>standard</strong> formatting:</p>

<ul>
	<li>A comma is inserted after <strong>every three</strong> digits from the right.</li>
	<li>Numbers with <strong>fewer</strong> than 4 digits contain no commas.</li>
</ul>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">n = 1002</span></p>

<p><strong>Output:</strong> <span class="example-io">3</span></p>

<p><strong>Explanation:</strong></p>

<p>The numbers <code>&quot;1,000&quot;</code>, <code>&quot;1,001&quot;</code>, and <code>&quot;1,002&quot;</code> each contain one comma, giving a total of 3.</p>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">n = 998</span></p>

<p><strong>Output:</strong> <span class="example-io">0</span></p>

<p><strong>Explanation:</strong></p>

<p><strong>​​​​​​​</strong>All numbers from 1 to 998 have fewer than four digits. Therefore, no commas are used.</p>
</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= n &lt;= 10<sup>15</sup></code></li>
</ul>


<!-- description:end -->

## Solutions

<!-- solution:start -->

<!-- tabs:start -->

#### C++

```cpp
class Solution {
public:
    long long countCommas(long long n) {
        if(n<=999) return 0;
        else if(n<=999999) return n-999;
        else if(n<=999999999) return (999999-999)+2*(n - 999999);
        else if(n<=999999999999LL) return (999999-999)+2*(999999999-999999)+3*(n - 999999999);
        else if(n<=999999999999999LL) return (999999-999)+2*(999999999-999999)+3*(999999999999LL-999999999)+4*(n-999999999999LL);
        else return (999999-999)+2*(999999999-999999)+3*(999999999999LL-999999999)+4*(999999999999999LL-999999999999LL)+5*(n-999999999999999LL);
    }
};
```


#### Java

```java
class Solution {
    public long countCommas(long n) {
        if(n<=999) return 0;
        else if(n<=999999) return n-999;
        else if(n<=999999999) return (999999-999)+2*(n - 999999);
        else if(n<=999999999999L) return (999999-999)+2*(999999999-999999)+3*(n - 999999999);
        else if(n<=999999999999999L) return (999999-999)+2*(999999999-999999)+3*(999999999999L-999999999)+4*(n-999999999999L);
        else return (999999-999)+2*(999999999-999999)+3*(999999999999L-999999999)+4*(999999999999999L-999999999999L)+5*(n-999999999999999L);
    }
}
```
<!-- tabs:end -->

<!-- solution:end -->

<!-- problem:end -->
