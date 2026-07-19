class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>h=new HashSet<>();
        int left=0;
        int max=0;

        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            while(h.contains(ch)){
                h.remove(s.charAt(left));
                left++;
            }
            h.add(ch);
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}