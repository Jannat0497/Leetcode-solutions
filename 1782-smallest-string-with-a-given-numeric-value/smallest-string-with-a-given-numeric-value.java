class Solution {
    public String getSmallestString(int n, int k) {
        StringBuilder str=new StringBuilder();
        for(int i=0;i<n;i++){
            str.append("a");
        }
        k=k-n;
        int i=n-1;
        while(k>0){
             if (k > 25) {
                str.setCharAt(i, 'z');
                k = k - 25;
            }
            else {
                char ch = (char) ('a' + k);
                str.setCharAt(i, ch);
                k = 0;
            }
            i--;

        }
        return str.toString();
    }
}