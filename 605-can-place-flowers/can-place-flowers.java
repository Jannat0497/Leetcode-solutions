class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0) return true;
        for(int j=0;j<flowerbed.length;j++){
            int i=j;
            if(flowerbed[j]==0){
                int left=(i==0)?0:flowerbed[i-1];
                int right=(i==flowerbed.length-1)?0:flowerbed[i+1];
                if(left==0 && right==0){
                    flowerbed[j]=1;
                    n--;
                }
            }
            if(n<=0) return true;
        }
        return false;
    }
}