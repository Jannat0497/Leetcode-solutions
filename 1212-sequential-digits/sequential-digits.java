import java.util.*;
class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> l=new ArrayList<>();
        String str="123456789";
        int low_digit=String.valueOf(low).length();
        int high_digit=String.valueOf(high).length();
        for(int i=low_digit;i<=high_digit;i++){
            for(int j=0;i+j<=9;j++){
                String s=str.substring(j,i+j);
                int num=Integer.parseInt(s);
                if(num>=low && num<=high){
                    l.add(num);
                }
            }
        }
        return l;
    }
}