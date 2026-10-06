<!-- problem:start -->

# [Interval List Intersections](https://leetcode.com/problems/interval-list-intersections)

## Description

<!-- description:start -->

<p>You are given two lists of closed intervals, <code>firstList</code> and <code>secondList</code>, where <code>firstList[i] = [start<sub>i</sub>, end<sub>i</sub>]</code> and <code>secondList[j] = [start<sub>j</sub>, end<sub>j</sub>]</code>. Each list of intervals is pairwise <strong>disjoint</strong> and in <strong>sorted order</strong>.</p>

<p>Return <em>the intersection of these two interval lists</em>.</p>

<p>A <strong>closed interval</strong> <code>[a, b]</code> (with <code>a &lt;= b</code>) denotes the set of real numbers <code>x</code> with <code>a &lt;= x &lt;= b</code>.</p>

<p>The <strong>intersection</strong> of two closed intervals is a set of real numbers that are either empty or represented as a closed interval. For example, the intersection of <code>[1, 3]</code> and <code>[2, 4]</code> is <code>[2, 3]</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2019/01/30/interval1.png" style="width: 700px; height: 194px;" />
<pre>
<strong>Input:</strong> firstList = [[0,2],[5,10],[13,23],[24,25]], secondList = [[1,5],[8,12],[15,24],[25,26]]
<strong>Output:</strong> [[1,2],[5,5],[8,10],[15,23],[24,24],[25,25]]
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> firstList = [[1,3],[5,9]], secondList = []
<strong>Output:</strong> []
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>0 &lt;= firstList.length, secondList.length &lt;= 1000</code></li>
	<li><code>firstList.length + secondList.length &gt;= 1</code></li>
	<li><code>0 &lt;= start<sub>i</sub> &lt; end<sub>i</sub> &lt;= 10<sup>9</sup></code></li>
	<li><code>end<sub>i</sub> &lt; start<sub>i+1</sub></code></li>
	<li><code>0 &lt;= start<sub>j</sub> &lt; end<sub>j</sub> &lt;= 10<sup>9</sup> </code></li>
	<li><code>end<sub>j</sub> &lt; start<sub>j+1</sub></code></li>
</ul>


<!-- description:end -->

## Solutions

<!-- solution:start -->

<!-- tabs:start -->

#### C++

```cpp
class Solution {
public:
    vector<vector<int>> intervalIntersection(vector<vector<int>>& fl, vector<vector<int>>& sl) {
        int n=fl.size(),m=sl.size();
        vector<vector<int>> res;
        int i=0,j=0;
        while(i<n && j<m){
            int s1=fl[i][0],e1=fl[i][1];
            int s2=sl[j][0],e2=sl[j][1];
            if(s2>=s1){
            if(e1>=s2){
                int s=max(s1,s2);
                int e=min(e1,e2);
                res.push_back({s,e});
            }
        }
            else{
            if(e2>=s1){
                int s=max(s1,s2);
                int e=min(e1,e2);
                res.push_back({s,e});
            }
        }
            if(e1>e2) j++;
            else i++;
        }
        return res;
    }
};
```


#### Java

```java
class Solution {
    public int[][] intervalIntersection(int[][] fl, int[][] sl) {
        int n=fl.length,m=sl.length;
        ArrayList<int[]> res=new ArrayList<>();
        int i=0,j=0;
        while(i<n && j<m){
            int s1=fl[i][0],e1=fl[i][1];
            int s2=sl[j][0],e2=sl[j][1];
            if(s2>=s1){
                if(e1>=s2) res.add(new int[]{Math.max(s1,s2),Math.min(e1,e2)});
            }
            else{
                if(e2>=s1) res.add(new int[]{Math.max(s1,s2),Math.min(e1,e2)});
            }
            if(e1>e2) j++;
            else i++;
        }
    return res.toArray(new int[res.size()][]);
    }
}
```
<!-- tabs:end -->

<!-- solution:end -->

<!-- problem:end -->
