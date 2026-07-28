<!-- problem:start -->

# [Smallest Palindromic Rearrangement I](https://leetcode.com/problems/smallest-palindromic-rearrangement-i)

## Description

<!-- description:start -->

<p>You are given a <strong><span data-keyword="palindrome-string">palindromic</span></strong> string <code>s</code>.</p>

<p>Return the <strong><span data-keyword="lexicographically-smaller-string">lexicographically smallest</span></strong> palindromic <span data-keyword="permutation-string">permutation</span> of <code>s</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = &quot;z&quot;</span></p>

<p><strong>Output:</strong> <span class="example-io">&quot;z&quot;</span></p>

<p><strong>Explanation:</strong></p>

<p>A string of only one character is already the lexicographically smallest palindrome.</p>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = &quot;babab&quot;</span></p>

<p><strong>Output:</strong> <span class="example-io">&quot;abbba&quot;</span></p>

<p><strong>Explanation:</strong></p>

<p>Rearranging <code>&quot;babab&quot;</code> &rarr; <code>&quot;abbba&quot;</code> gives the smallest lexicographic palindrome.</p>
</div>

<p><strong class="example">Example 3:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = &quot;daccad&quot;</span></p>

<p><strong>Output:</strong> <span class="example-io">&quot;acddca&quot;</span></p>

<p><strong>Explanation:</strong></p>

<p>Rearranging <code>&quot;daccad&quot;</code> &rarr; <code>&quot;acddca&quot;</code> gives the smallest lexicographic palindrome.</p>
</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s.length &lt;= 10<sup>5</sup></code></li>
	<li><code>s</code> consists of lowercase English letters.</li>
	<li><code>s</code> is guaranteed to be palindromic.</li>
</ul>


<!-- description:end -->

## Solutions

<!-- solution:start -->

<!-- tabs:start -->

#### Java

```java
class Solution {
    public String smallestPalindrome(String s) {
        int n=s.length();
        if(n==1) return s;
        int f[]=new int[26];
        StringBuilder r=new StringBuilder();
        char c=0;
        for(int i=0;i<n;i++) f[s.charAt(i)-97]++;
        for(int i=0;i<26;i++){
            if(f[i]%2==1) c=(char)(i+97);
            for(int j=0;j<f[i]/2;j++) r=r.append((char)(i+97));
        }
        StringBuilder r1=new StringBuilder(r);
        if(c!=0) r.append(c);
        r.append(r1.reverse());
        return r.toString();
    }
}
```


#### C++

```cpp
class Solution {
public:
    string smallestPalindrome(string s) {
        int n=s.length();
        if(n==1) return s;
        int f[26]={0};
        for(int i=0;i<n/2;i++) f[s[i]-97]++;
        int ind=0;
        for(int i=0;i<26;i++) 
        while(f[i]-->0) s[ind++]=(char)(i+97);
        for(int i=0;i<n/2;i++) s[n-1-i]=s[i];
        return s;
    }
};
```

<!-- tabs:end -->

<!-- solution:end -->

<!-- problem:end -->
