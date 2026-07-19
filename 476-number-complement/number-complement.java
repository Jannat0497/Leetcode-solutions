class Solution {
    public int findComplement(int num) {
        int sum=0;
        int bit=1;
        while(num>0){
            if(num%2==0){
                sum+=bit;
            }
            bit*=2;
            num=num/2;

        }
        return sum;
    }
}