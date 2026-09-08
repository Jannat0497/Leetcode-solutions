class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        int[] result = new int[queries.length];
        int[] pos = new int[nums.length];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == x) {
                pos[count] = i;
                count++;
            }
        }
        for (int i = 0; i < queries.length; i++) {
            if (queries[i] > count) {
                result[i] = -1;
            } else {
                result[i] = pos[queries[i] - 1];
            }
        }
        return result;
    }
}