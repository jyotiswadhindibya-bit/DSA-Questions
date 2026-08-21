<!-- problem:start -->

# [Maximum Length Substring With Two Occurrences](https://leetcode.com/problems/maximum-length-substring-with-two-occurrences)

## Description

<!-- description:start -->

Given a string <code>s</code>, return the <strong>maximum</strong> length of a <span data-keyword="substring">substring</span>&nbsp;such that it contains <em>at most two occurrences</em> of each character.
<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = &quot;bcbbbcba&quot;</span></p>

<p><strong>Output:</strong> <span class="example-io">4</span></p>

<p><strong>Explanation:</strong></p>
The following substring has a length of 4 and contains at most two occurrences of each character: <code>&quot;bcbb<u>bcba</u>&quot;</code>.</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = &quot;aaaa&quot;</span></p>

<p><strong>Output:</strong> <span class="example-io">2</span></p>

<p><strong>Explanation:</strong></p>
The following substring has a length of 2 and contains at most two occurrences of each character: <code>&quot;<u>aa</u>aa&quot;</code>.</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>2 &lt;= s.length &lt;= 100</code></li>
	<li><code>s</code> consists only of lowercase English letters.</li>
</ul>


<!-- description:end -->

## Solutions

<!-- solution:start -->

<!-- tabs:start -->

#### C++

```cpp
class Solution {
public:
    int maximumLengthSubstring(string s) {
        int n=s.length();
        int f[26]={0};
        int l=0,res=0;
        for(int r=0;r<n;r++){
            f[s[r]-97]++;
            while(f[s[r]-97]>2) f[s[l++]-97]--;
            res=max(res,r-l+1);
        }
        return res;
    }
};
```


#### Java

```java
class Solution {
    public int maximumLengthSubstring(String s) {
        int n=s.length();
        int f[]=new int[26];
        int l=0,res=0;
        for(int r=0;r<n;r++){
            f[s.charAt(r)-97]++;
            while(f[s.charAt(r)-97]>2) f[s.charAt(l++)-97]--;
            res=Math.max(res,r-l+1);
        }
        return res;
    }
}
```
<!-- tabs:end -->

<!-- solution:end -->

<!-- problem:end -->
