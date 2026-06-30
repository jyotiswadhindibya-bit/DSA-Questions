/*
1358. Number of Substrings Containing All Three Characters
Solved
Medium
Topics
premium lock icon
Companies
Hint
Given a string s consisting only of characters a, b and c.

Return the number of substrings containing at least one occurrence of all these characters a, b and c.

 

Example 1:

Input: s = "abcabc"
Output: 10
Explanation: The substrings containing at least one occurrence of the characters a, b and c are "abc", "abca", "abcab", "abcabc", "bca", "bcab", "bcabc", "cab", "cabc" and "abc" (again). 
Example 2:

Input: s = "aaacb"
Output: 3
Explanation: The substrings containing at least one occurrence of the characters a, b and c are "aaacb", "aacb" and "acb". 
Example 3:

Input: s = "abc"
Output: 1
 

Constraints:

3 <= s.length <= 5 x 10^4
s only consists of a, b or c characters.

*/
//Solutin in java
class Solution {
    public int numberOfSubstrings(String s) {
        int n=s.length();
        int l[]={-1,-1,-1};
        int res=0;
        for(int i=0;i<n;i++){
            l[s.charAt(i)-97]=i;
            if(l[0]!=-1 && l[1]!=-1 && l[2]!=-1){
                int min=Math.min(l[0],Math.min(l[1],l[2]));
                res+=min+1;
            } 
        }
        return res;
    }
}
