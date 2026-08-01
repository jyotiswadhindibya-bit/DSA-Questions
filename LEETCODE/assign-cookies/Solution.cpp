class Solution {
public:
    int findContentChildren(vector<int>& g, vector<int>& s) {
        int n=s.size(),c=g.size();
        if(n==0 || n==1) return n;
        sort(g.begin(),g.end());
        sort(s.begin(),s.end());
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
};