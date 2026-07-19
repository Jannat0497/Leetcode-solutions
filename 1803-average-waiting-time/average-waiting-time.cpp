class Solution {
public:
    double averageWaitingTime(vector<vector<int>>& customers) {
       long long time=0;
       long long sum=0;
       for(int i=0;i<customers.size();i++){
        if(time<customers[i][0]){
            time=customers[i][0];
        }
        time=time+=customers[i][1];
        sum+=time-customers[i][0];
       }
       return (double)sum/customers.size();
    }
};