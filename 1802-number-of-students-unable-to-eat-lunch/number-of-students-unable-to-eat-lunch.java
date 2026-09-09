class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int n=students.length;
        Queue<Integer> q= new LinkedList<>();
        Stack<Integer> st= new Stack<>();
        for(int i=0;i<n;i++){
            q.add(students[i]);
        }
        for(int i=n-1;i>=0;i--){
            st.push(sandwiches[i]);
        }
        int count=0;
        while(!q.isEmpty() && count<q.size()){
            if(q.peek()==st.peek()) {
                q.remove();
                st.pop();
                count=0;
            }
            else{
                q.add(q.remove());
                count++;
            }
        }
        return q.size();
    }
}