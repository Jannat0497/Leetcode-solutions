class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] num= new int[arr.length];
        for(int i=0;i<arr.length;i++){
            num[i]=arr[i];
        }
        Arrays.sort(num);
        int r=1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i:num){
            if(!map.containsKey(i)){
                map.put(i,r++);
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=map.get(arr[i]);
        }
        return arr;
    }
}