class Solution {
    public int compress(char[] chars) {
        int j=0;
        int i=0;
        while(i<chars.length){
            char ch=chars[i];
            int count=0;
            while(i<chars.length && chars[i]==ch){
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