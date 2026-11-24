class Solution {
    public int countAsterisks(String s) {
        int count = 0;
        int line = 0;
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '|'){
                 if (st.isEmpty()) {
                    st.push(ch);
                } else {
                    st.pop();
                }
            }      
            else if (st.isEmpty() && ch == '*')
                count++;

        }
        return count;
    }
}