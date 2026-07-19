class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        char[] jewelArr = jewels.toCharArray();
        char[] stoneArr = stones.toCharArray();

        for (int i = 0; i < jewelArr.length; i++) {
            for (int j = 0; j < stoneArr.length; j++) {
                if (stoneArr[j] == jewelArr[i]) {
                    count++;
                }
            }
        }
        return count;
    }
}