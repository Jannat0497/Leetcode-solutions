class Solution {
    public String smallestPalindrome(String s) {
         int n = s.length();
        char[] half = new char[n / 2];
        for (int i = 0; i < n / 2; i++) {
            half[i] = s.charAt(i);
        }
        Arrays.sort(half);
        String left = new String(half);
        String right = new StringBuilder(left).reverse().toString();
        if (n % 2 != 0) {
            return left + s.charAt(n / 2) + right;
        } else {
            return left + right;
        }
    }
}