class Solution {
    public int balancedStringSplit(String s) {
        int count=0;
        int countL=0;
        int countR=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='L') countL++;
            else  countR++;
            if(countL==countR) count++;
        }
        return count;
    }
}