class Solution {
public:
        bool check(int n){
        while(n!=0){
            int d=n%10;
            if(d==0) return false;
            n=n/10;
        }
        return true;
        }
        vector<int> getNoZeroIntegers(int n) {
        vector<int> num(2);
        for(int i=1;i<n;i++){
            int a=i;
            int b=n-i;
            if(check(a)&& check(b)){
                num[0]=a;
                num[1]=b;
                break;
            }
        }
        return num;
    }
};