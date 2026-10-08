<!-- problem:start -->

# [Remove All Adjacent Duplicates In String](https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string)

## Description

<!-- description:start -->

<p>You are given a string <code>s</code> consisting of lowercase English letters. A <strong>duplicate removal</strong> consists of choosing two <strong>adjacent</strong> and <strong>equal</strong> letters and removing them.</p>

<p>We repeatedly make <strong>duplicate removals</strong> on <code>s</code> until we no longer can.</p>

<p>Return <em>the final string after all such duplicate removals have been made</em>. It can be proven that the answer is <strong>unique</strong>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;abbaca&quot;
<strong>Output:</strong> &quot;ca&quot;
<strong>Explanation:</strong> 
For example, in &quot;abbaca&quot; we could remove &quot;bb&quot; since the letters are adjacent and equal, and this is the only possible move.  The result of this move is that the string is &quot;aaca&quot;, of which only &quot;aa&quot; is possible, so the final string is &quot;ca&quot;.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;azxxzy&quot;
<strong>Output:</strong> &quot;ay&quot;
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s.length &lt;= 10<sup>5</sup></code></li>
	<li><code>s</code> consists of lowercase English letters.</li>
</ul>


<!-- description:end -->

## Solutions

<!-- solution:start -->

<!-- tabs:start -->

#### C++

```cpp
class Solution {
public:
    string removeDuplicates(string s) {
        int n=s.size();
        stack<char> st;
        st.push(s[0]);
        for(int i=1;i<n;i++){
            if(!st.empty() && st.top()==s[i]){
                st.pop();
                continue;
            }
            st.push(s[i]);
        }
        string res="";
        while(!st.empty()){
            res.push_back(st.top());
            st.pop();
        }
        reverse(res.begin(),res.end());
        return res;
    }
};
```


#### Java

```java
class Solution {
    public String removeDuplicates(String s) {
        int n=s.length();
        Stack<Character> st=new Stack<>();
        st.push(s.charAt(0));
        for(int i=1;i<n;i++){
            if(!st.empty() && st.peek()==s.charAt(i)){
                st.pop();
                continue;
            }
            st.push(s.charAt(i));
        }
        char res[]=new char[st.size()];
        for(int i=st.size()-1;i>=0;i--) res[i]=st.pop();
        return new String(res);
    }
}
```
<!-- tabs:end -->

<!-- solution:end -->

<!-- problem:end -->
