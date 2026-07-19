class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> hs=new HashMap<>();
        hs.put('I',1); hs.put('V',5);
        hs.put('X',10); hs.put('L',50);
        hs.put('C',100);
        hs.put('D',500);
        hs.put('M',1000);
        int prev=0;
        int num=0;
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            int curr=hs.get(ch);
            if(curr<prev){
                num-=curr;
            }
            else{
                num+=curr;
            }
            prev=curr;
        }
        return num;
    }
}