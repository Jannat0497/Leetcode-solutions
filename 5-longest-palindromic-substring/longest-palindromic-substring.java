class Solution {
    public static Boolean palindrome(String str){
        int l=0;
        int h=str.length()-1;
        while(l<=h){
            if(str.charAt(l) != str.charAt(h)){
                return false;
            }
            l++;
            h--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        String longest="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int idx=0;
            for(int j=s.length()-1;j>=i;j--){
                if (j - i + 1 <= longest.length()) {
                    break; 
                }
                if(ch==s.charAt(j)){
                    String str=s.substring(i,j+1);
                    if(palindrome(str)){
                        if (str.length() > longest.length()) {
                            longest = str;
                        }
                        break;
                    }
                }
            }
            
        }
        
        return longest;
    }
}