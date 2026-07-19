import java.util.Stack;

class StockSpanner {
    Stack<Integer> p = new Stack<>();
    Stack<Integer> s = new Stack<>();
    public StockSpanner() {
        
    }
    public int next(int price) {
        int temp=1;
        if(p.isEmpty()){
            p.push(price);
            s.push(temp);
            return 1;
        }
        while(!p.isEmpty() && !s.isEmpty() && p.peek()<=price){
            p.pop();
            temp+=s.pop();
        }
        p.push(price);
        s.push(temp);
        return temp;
    }

}
/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */