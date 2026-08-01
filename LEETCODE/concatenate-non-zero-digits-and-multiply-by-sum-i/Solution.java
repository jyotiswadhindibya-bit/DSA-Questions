class Solution {
    public long sumAndMultiply(int n) {
        if(n==0) return 0;
        int x=0,s=0,i=1;
        while(n>0){
            int d=n % 10;
            n/=10;
            if(d==0) continue;
            s+=d;
            x+=d*i;
            i*=10;
        }
        return 1l*x*s;
    }
}