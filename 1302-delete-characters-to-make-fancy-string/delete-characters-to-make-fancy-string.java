class Solution {
    public String makeFancyString(String s) {
        int n=s.length();
        if(n<2) return s;
        StringBuilder str=new StringBuilder();
        str.append(s.charAt(0));
        str.append(s.charAt(1));
        for(int i=2;i<n;i++){
            char ch=s.charAt(i);
            if(s.charAt(i-2)==ch && s.charAt(i-1)==ch){
               continue;
            }
            else{
               str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
}