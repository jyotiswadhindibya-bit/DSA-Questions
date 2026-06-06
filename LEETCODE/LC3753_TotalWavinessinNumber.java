/*
3753. Total Waviness of Numbers in Range II
Solved
Hard
Topics
premium lock icon
Companies
Hint
You are given two integers num1 and num2 representing an inclusive range [num1, num2].

The waviness of a number is defined as the total count of its peaks and valleys:

A digit is a peak if it is strictly greater than both of its immediate neighbors.
A digit is a valley if it is strictly less than both of its immediate neighbors.
The first and last digits of a number cannot be peaks or valleys.
Any number with fewer than 3 digits has a waviness of 0.
Return the total sum of waviness for all numbers in the range [num1, num2].
 

Example 1:

Input: num1 = 120, num2 = 130

Output: 3

Explanation:

In the range [120, 130]:

120: middle digit 2 is a peak, waviness = 1.
121: middle digit 2 is a peak, waviness = 1.
130: middle digit 3 is a peak, waviness = 1.
All other numbers in the range have a waviness of 0.
Thus, total waviness is 1 + 1 + 1 = 3.

Example 2:

Input: num1 = 198, num2 = 202

Output: 3

Explanation:

In the range [198, 202]:

198: middle digit 9 is a peak, waviness = 1.
201: middle digit 0 is a valley, waviness = 1.
202: middle digit 0 is a valley, waviness = 1.
All other numbers in the range have a waviness of 0.
Thus, total waviness is 1 + 1 + 1 = 3.

Example 3:

Input: num1 = 4848, num2 = 4848

Output: 2

Explanation:

Number 4848: the second digit 8 is a peak, and the third digit 4 is a valley, giving a waviness of 2.

 

Constraints:

1 <= num1 <= num2 <= 1015​​​​​​​
*/
//solution
class Solution {
    static int waves[]=new int[570];
    static{
        int j=0;
        for(int i=0;i<1000;i++){
            int h=i/100;
            int t=i/10%10;
            int o=i%10;
            if(t>Math.max(h,o) || t<Math.min(h,o)) waves[j++]=i; 
        }
    }
    public long totalWaviness(long num1, long num2) {
        return wavy(num2)-wavy(num1-1);
    }
    public long wavy(long n){
        if(n<100) return 0;
        long res=0;
        for(int i=0;i<570;i++)
        res+=wavyWays(n,waves[i]);
        return res;
    }
    public long wavyWays(long n,int p){
        long ways=0,mul=1,type=(p<100)?1:0;
        for(int i=0;i<16;i++){
            if(mul*100>n) return ways;
            long l=n/(mul*1000);
            long curr=n/mul%1000;
            long r=n%mul;
            long c=0,e=0;
            if(curr>p) c=l-type+1;
            else if(curr==p){
                c=Math.max(0,l-type);
                e=(l>=type)?r+1:0;
            }
            else c=Math.max(0,l-type);
            ways+=c*mul+e;
            mul*=10;
        }
        return ways;
        }
    }
