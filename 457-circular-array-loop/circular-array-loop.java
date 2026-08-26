class Solution {
    public boolean circularArrayLoop(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int curr = i;
            boolean positive = nums[i] > 0;
            int count = 0;
            while (count < n) {
                if ((nums[curr] > 0) != positive)
                    break;
                int next = (curr + nums[curr]) % n;
                if (next < 0)
                    next += n;
                if (next == curr)
                    break;
                curr = next;
                count++;
                if (curr == i)
                    return true;
            }
        }
        return false;
    }
}