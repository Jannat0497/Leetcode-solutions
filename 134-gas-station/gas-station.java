class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int maxGas=0;
        int maxCost=0;
        int currentTank=0;
        int start=0;
        for(int i=0;i<gas.length;i++){
            maxGas+=gas[i];
            maxCost+=cost[i];
            currentTank+=(gas[i]-cost[i]);
            if(currentTank<0){
                start=i+1;
                currentTank=0;
            }
        }
        if(maxGas<maxCost) return -1;
        return start;
    }
}