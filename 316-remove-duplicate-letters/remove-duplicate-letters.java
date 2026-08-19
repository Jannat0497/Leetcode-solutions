class Solution {
    public String removeDuplicateLetters(String s) {
        HashSet<Character> hs=new HashSet<>();
        Stack<Character> st= new Stack<>();
        int[] freq= new int[26];
        for(char ch : s.toCharArray()){
            freq[ch-'a']++;
        }
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[ch-'a']--;
            if(hs.contains(ch)){
               continue;
            }
            while(!st.isEmpty() && st.peek()>ch && freq[st.peek() - 'a'] > 0){
                hs.remove(st.pop());
            }
            st.push(ch);
            hs.add(ch);       
            
        }
        while(!st.isEmpty()){
            str.append(st.pop());
        }
        return str.reverse().toString();
    }
}