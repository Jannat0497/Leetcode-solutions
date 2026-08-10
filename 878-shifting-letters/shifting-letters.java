class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        char[] arr = s.toCharArray();
        int totalShift = 0;
        
        for (int i = shifts.length - 1; i >= 0; i--) {
            totalShift = (totalShift + shifts[i]) % 26;
            int newChar = arr[i] - 'a' + totalShift;
            arr[i] = (char) ('a' + (newChar % 26));
        }
        
        return new String(arr);
    }
}