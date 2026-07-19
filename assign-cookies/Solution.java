class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n=s.length,c=g.length;
        if(n==0 || n==1) return n;
        Arrays.sort(g);
        Arrays.sort(s);
        int j=0;
        int res=0;
        for(int i=0;i<n && j<c;i++){
            if(s[i]>=g[j]){
                j++;
                res++;
            }
        }
        return res;
    }
}