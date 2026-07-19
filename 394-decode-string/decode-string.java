class Solution {
    public String decodeString(String s) {
        Stack<String> st=new Stack<>();
        Stack<Integer> count=new Stack<>();
        int num=0;
        String curr="";
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                num=(num*10)+(ch-'0');
            }
            else if(ch=='['){
                st.push(curr);
                count.push(num);
                num=0;
                curr="";
            }
            else if(ch==']'){
                String temp="";
                int c=count.pop();
                String prev=st.pop();
                for(int i=0;i<c;i++){
                    temp+=curr;
                }
                curr=prev+temp;
            }
            else{
                curr+=ch;
            }
        } 
        return curr;
    }
}
