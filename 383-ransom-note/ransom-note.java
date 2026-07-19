class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length()) return false;
        int[] freq= new int[26];
        for(char i:magazine.toCharArray()){
            freq[i-'a']++;
        }
        for(char i:ransomNote.toCharArray()){
            freq[i-'a']--;
            if(freq[i-'a']<0){
                return false;
            }
        }
        return true;
    }
}