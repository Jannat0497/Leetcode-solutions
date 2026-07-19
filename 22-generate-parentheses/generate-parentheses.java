class Solution {
    public List<String> generateParenthesis(int n) {
        List <String> res=new ArrayList<>();
        solve(res,"",0,0,n);
        return res;
    }
    public void solve(List<String> res,String curr,int open,int close,int n ){
        if(curr.length()==2*n){
            res.add(curr);
            return;
        }
        if(open<n){
            solve(res,curr+"(",open+1,close,n);
        }
        if(close<open){
            solve(res,curr+")",open,close+1,n);
        }
    }
}