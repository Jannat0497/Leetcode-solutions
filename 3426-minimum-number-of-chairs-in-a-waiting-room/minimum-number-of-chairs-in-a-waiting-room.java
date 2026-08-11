class Solution {
    public int minimumChairs(String s) {
        int count=0;
        int max=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='E') {
                count++;
                max=Math.max(max,count);
            }
            else if(ch=='L') count--;
        }
        return max;
    }
}