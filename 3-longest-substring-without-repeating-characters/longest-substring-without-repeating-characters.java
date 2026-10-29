class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs= new HashSet<>();
        int l=0;
        int best=0;
        for(int i=0;i<s.length();i++){
            while(hs.contains(s.charAt(i))){
                hs.remove(s.charAt(l++));
            }
            hs.add(s.charAt(i));
            best=Math.max(best,i-l+1);
        }
        return best;
    }
}