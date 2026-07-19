class Solution {
    public static void mergeSort(int [] nums,int low,int high) {
        if(low>=high)return ;
        if(low<high){
            int mid=low+(high-low)/2;
            mergeSort(nums,low,mid);
            mergeSort(nums,mid+1,high);
            merge(nums,low,mid,high);

        }
    }
    public static void merge(int[] arr,int low, int mid, int high){
        int [] temp=new int[high-low+1];
        int i=low,j=mid+1,k=0;
        while(i<=mid &&j<=high){
            if(arr[i]<=arr[j]){
                temp[k++]=arr[i++];
            }
            else{
                temp[k++]=arr[j++];
            }
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=high){
            temp[k++]=arr[j++];
        }
        for(i=low,k=0;i<=high;i++,k++){
                arr[i]=temp[k];
        }

    }
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
}