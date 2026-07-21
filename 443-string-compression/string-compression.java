class Solution {
    public int compress(char[] chars) {
        int j=0;
        int i=0;
        int n =chars.length;
        while(i<n){
            char ch=chars[i];
            int count=0;
            while(i<n && chars[i]==ch){
                count++;
                i++;
            }
            chars[j++]=ch;
            if(count>1){
                for(char c:(count+"").toCharArray()){
                    chars[j++]=c;
                }
            }
        }
        return j;
    }
}