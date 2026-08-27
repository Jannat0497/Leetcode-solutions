class Solution {
    public int numDecodings(String s) {
        int a = 1, b = 0;
        for(int i = 0; i < s.length(); i++) {
            int c = 0;
            if(s.charAt(i) != '0')
                c += a;
            if(i > 0) {
                int num = Integer.parseInt(s.substring(i - 1, i + 1));
                if(num >= 10 && num <= 26)
                    c += b;
            }
            b = a;
            a = c;
        }
        return a;
    }
}