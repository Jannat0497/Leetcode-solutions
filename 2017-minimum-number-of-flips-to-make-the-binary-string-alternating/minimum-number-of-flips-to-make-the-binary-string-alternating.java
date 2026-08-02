class Solution {
    public int minFlips(String s) {
        int n = s.length();
        String d = s + s;
        int diff1 = 0, diff2 = 0;
        int minFlips = Integer.MAX_VALUE;
        for (int i = 0; i < d.length(); i++) {
            if (i % 2 == 0 && d.charAt(i) == '1') diff1++;
            if (i % 2 != 0 && d.charAt(i) == '0') diff1++;

            if (i % 2 == 0 && d.charAt(i) == '0') diff2++;
            if (i % 2 != 0 && d.charAt(i) == '1') diff2++;

            if (i >= n) {
                int out = i - n; 
                if (out % 2 == 0 && d.charAt(out) == '1') diff1--;
                if (out % 2 != 0 && d.charAt(out) == '0') diff1--;

                if (out % 2 == 0 && d.charAt(out) == '0') diff2--;
                if (out % 2 != 0 && d.charAt(out) == '1') diff2--;
            }
            if (i >= n - 1) {
                minFlips = Math.min(minFlips, Math.min(diff1, diff2));
            }    
        }
        return minFlips;
    }
}
