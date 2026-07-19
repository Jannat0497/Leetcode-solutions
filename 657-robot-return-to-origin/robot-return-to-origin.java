class Solution {
    public boolean judgeCircle(String moves) {
        int change=0;
        int change1=0;
        for(int i=0;i<moves.length();i++){
            char c=moves.charAt(i);
            if(c=='U'){
                change++;
            }
            else if(c=='D'){
                change--;
            }
            else if(c=='L'){
                change1++;
            }
            else if(c=='R'){
                change1--;
            }
        }
        if(change==0 && change1==0){
            return true;
        }
        return false;
    }
}