class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int[] temp=new int[m+n];
        int k=0;
        int i=0,j=0;
        double sum=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                temp[k++]=nums1[i++];
            }
            else{
                temp[k++]=nums2[j++];
            }
            
        }
        while(i<m) {
            temp[k++]=nums1[i]; 
            i++;
        }
        while(j<n) {
             temp[k++]=nums2[j];
             j++;
        }
        
        if((m+n)%2==0){ 
            int div=(m+n)/2;  
            int a=div-1;
            int b=div;
            return (double)(temp[a]+temp[b])/2.0;
        }
        else{
            int div=(m+n)/2;
            return (double)temp[div];
        }
        
    }
}