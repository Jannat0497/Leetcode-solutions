class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> rad= new LinkedList<>();
        Queue<Integer> dire= new LinkedList<>();
        int n =senate.length();
        for(int i=0;i<n;i++){
            char ch=senate.charAt(i);
            if(ch=='R'){
                rad.offer(i);
            }
            else{
                dire.offer(i);
            }
        }
        while(!rad.isEmpty() && !dire.isEmpty()){
            int r=rad.poll();
            int d=dire.poll();
            if(r<d){
                rad.offer(r+n);
            }
            else{
                dire.offer(d+n);
            }
        }
        if(rad.isEmpty()){
            return "Dire";
        }
        else{
            return "Radiant";
        }
    }
}