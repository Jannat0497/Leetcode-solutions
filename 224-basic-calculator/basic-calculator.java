class Solution {
    public int calculate(String s) {
        int num=0; 
        int sign=1;
        int res=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)) {
                num=num*10+(ch-'0');
            }
            if(ch=='+'){
                res+=num*sign;
                num=0;
                sign=1;
            }
            else if(ch=='-'){
                res+=num*sign;
                sign=-1;
                num=0;
            }
            else if(ch=='('){
                st.push(res);
                st.push(sign);
                num=0;
                res=0;
                sign=1;
            }
            else if(ch==')'){
                res+=num*sign;
                num=0;
                int a=st.pop();
                int b=st.pop();
                res=b+a*res;
            }
        }
        res+=num*sign;
        return res;
    }
}