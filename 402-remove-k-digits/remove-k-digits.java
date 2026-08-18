class Solution {
    public String removeKdigits(String num, int k) {
        if(num.length()<=k) return "0";
        StringBuilder str=new StringBuilder();
        Stack <Character> s=new Stack<>();
        for(int i=0;i<num.length();i++){
            char ch=num.charAt(i);
            while(!s.isEmpty() && k>0 && s.peek()>ch ) {
                s.pop();
                k--;
            }
            s.push(ch);
        }
        while(k>0){
             s.pop();
             k--;
        }
        while (!s.isEmpty()) {
            str.append(s.pop());
        }
        str.reverse();
        int i = 0;
        while (i < str.length() - 1 && str.charAt(i) == '0') {
            i++;
        }
        return str.substring(i);
    }
}