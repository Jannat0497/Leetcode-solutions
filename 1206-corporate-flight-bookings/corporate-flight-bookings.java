class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] d=new int[n+2];
        for(int i=0;i<bookings.length;i++){
            int l=bookings[i][0];
            int r=bookings[i][1];
            int k=bookings[i][2];
            d[l]+=k;
            d[r+1]-=k;
        }
        int count=0;
        int[] res=new int[n];
        int j=0;
        for(int i=1;i<=n;i++){
            count+=d[i];
            res[j++]=count;
        }
        return res;
    }
}