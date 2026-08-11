<!-- problem:start -->

# [Longest Repeating Character Replacement](https://leetcode.com/problems/longest-repeating-character-replacement)

## Description

<!-- description:start -->

<p>You are given a string <code>s</code> and an integer <code>k</code>. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most <code>k</code> times.</p>

<p>Return <em>the length of the longest substring containing the same letter you can get after performing the above operations</em>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;ABAB&quot;, k = 2
<strong>Output:</strong> 4
<strong>Explanation:</strong> Replace the two &#39;A&#39;s with two &#39;B&#39;s or vice versa.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;AABABBA&quot;, k = 1
<strong>Output:</strong> 4
<strong>Explanation:</strong> Replace the one &#39;A&#39; in the middle with &#39;B&#39; and form &quot;AABBBBA&quot;.
The substring &quot;BBBB&quot; has the longest repeating letters, which is 4.
There may exists other ways to achieve this answer too.</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s.length &lt;= 10<sup>5</sup></code></li>
	<li><code>s</code> consists of only uppercase English letters.</li>
	<li><code>0 &lt;= k &lt;= s.length</code></li>
</ul>


<!-- description:end -->

## Solutions

<!-- solution:start -->

<!-- tabs:start -->

#### Java

```java
class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int l=0,len=0,diff=0,res=0;
        int f[]=new int[26];
        for(int r=0;r<n;r++){
            f[s.charAt(r)-65]++;
            len=r-l+1;
            int max=largest(f);
            diff=len-max;
            while(diff>k){
                f[s.charAt(l++)-65]--;
                max=largest(f);
                diff=(r-l+1)-max;
            }
            res=Math.max(r-l+1,res);
        }
        return res;
    }
    public int largest(int f[]){
        int max=0;
        for(int i=0;i<26;i++) max=Math.max(max,f[i]);
        return max;
    }
}
```


#### C++

```cpp
class Solution {
public:
    int characterReplacement(string s, int k) {
        int n=s.size();
        int l=0,len=0,diff=0,res=0;
        int f[26]={0};
        for(int r=0;r<n;r++){
            f[s[r]-65]++;
            len=r-l+1;
            int m=largest(f);
            diff=len-m;
            while(diff>k){
                f[s[l++]-65]--;
                m=largest(f);
                diff=(r-l+1)-m;
            }
            res=max(r-l+1,res);
        }
        return res;
    }
    int largest(int f[]){
        int m=0;
        for(int i=0;i<26;i++) m=max(m,f[i]);
        return m;
    }
};
```
<!-- tabs:end -->

<!-- solution:end -->

<!-- problem:end -->
