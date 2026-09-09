class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int n=tickets.length;
        int count=0;
        Queue<Integer> q= new LinkedList<>();
        for(int i=0;i<n;i++){
             q.add(i);
        }
        while(!q.isEmpty()){
                int idx=q.poll();
                tickets[idx]--;
                count++;
                if(idx==k && tickets[k]==0) return count;
                if (tickets[idx] > 0) {
                    q.add(idx);
                }
        }
        
        return count;
    }
}