class Solution {
    public String smallestNumber(String pattern) {
        StringBuilder str=new StringBuilder();
        Stack<Integer> st= new Stack<>();
        int i = 1;
        for (int j = 0; j <= pattern.length(); j++) {
            st.push(i++);
            if (j == pattern.length() || pattern.charAt(j) == 'I') {
                while (!st.isEmpty()) {
                    str.append(st.pop());
                }
            }
        }
        return str.toString();
    }
}