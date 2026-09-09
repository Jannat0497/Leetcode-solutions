class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        Queue<Integer> q= new LinkedList<>();
        int[] res=new int[deck.length];
        int j=0;
        for(int i=0;i<deck.length;i++){
            q.add(i);
        }
        while(!q.isEmpty() && j<deck.length){
            int idx=q.poll();
            res[idx]=deck[j];
            j++;
            if (!q.isEmpty()) {
                q.add(q.poll());
            }
        }
        return res;
    }
}