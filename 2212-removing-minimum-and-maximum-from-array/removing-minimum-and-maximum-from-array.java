class Solution {
    public int minimumDeletions(int[] nums) { 
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (min > nums[i]) {
                min = nums[i];
                minIndex = i;
            }
            if (max < nums[i]) {
                max = nums[i];
                maxIndex = i;
            }
        }
        int n = nums.length;
        int a = Math.max(minIndex, maxIndex) + 1;
        int b = n - Math.min(minIndex, maxIndex);
        int c = Math.min(minIndex, maxIndex) + 1 + n - Math.max(minIndex, maxIndex);
        return Math.min(a, Math.min(b, c));
    }
}