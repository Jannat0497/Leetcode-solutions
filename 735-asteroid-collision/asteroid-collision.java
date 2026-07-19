class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st= new Stack<>();
        int n=asteroids.length;
        for(int a:asteroids){  
            Boolean des=false;   
           while(!st.isEmpty() && st.peek()>0 && a<0){
                if(st.peek()<-a){
                    st.pop();
                }
                else if(st.peek()==-a){
                    st.pop();
                    des=true;
                    break;
                }
                else{
                    des=true;
                    break;
                }
           }
           if(!des){
                st.push(a);
           }
        }
        int[] ans = new int[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            ans[i] = st.pop();  
        }
        return ans;
    }
}