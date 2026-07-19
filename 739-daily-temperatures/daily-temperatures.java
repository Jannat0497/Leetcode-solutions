class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> s = new Stack<>();
        int n = temperatures.length;
        int[] result = new int[n];
        
        for (int i = n - 1; i >= 0; i--) {
            while (!s.isEmpty() && temperatures[s.peek()] <= temperatures[i]) {
                s.pop();
            }
            result[i] = s.isEmpty() ? 0 : s.peek() - i;
            s.push(i);
        }
        
        return result;
    }
}