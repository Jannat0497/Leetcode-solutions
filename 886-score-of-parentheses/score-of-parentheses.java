class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st=new Stack<>();
        st.push(0);
        for(char i:s.toCharArray()){
            if(i=='('){
                st.push(0);
            }
            else{
                int x=st.pop();
                int val=x;
                if(x==0){
                    val=1;
                }
                else{
                   val=2*x;
                }
                st.push(st.pop()+val);
            }
        }
        return st.peek();
    }
}