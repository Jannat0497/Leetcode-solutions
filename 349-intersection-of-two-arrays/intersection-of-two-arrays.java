class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> seen1 = new HashSet<>();
        for (int num : nums1) {
                seen1.add(num);
        }
        HashSet<Integer> seen2 = new HashSet<>();
        for (int num : nums2) {
            if (seen1.contains(num))
                seen2.add(num);
        }
        int[] result = new int[seen2.size()];
        int count = 0;
        for (int num : seen2){
            result[count++] = num;
        }

        return result;
    }
}