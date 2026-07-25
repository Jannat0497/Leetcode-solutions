class Solution {
    public int maxProduct(int n) {
        int max=0,sec_max=0;
        while(n>0){
            int digit=n%10;
            if(max<digit){
                sec_max=max;
                max=digit;
            }
            else if(digit>sec_max){
                sec_max=digit;
            }
            n=n/10;
        }
        int product = sec_max*max;
        return product;
    }
}