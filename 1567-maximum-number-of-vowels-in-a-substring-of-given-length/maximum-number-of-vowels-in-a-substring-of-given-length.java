class Solution {
    public int maxVowels(String s, int k) {
        int count=0;
        int max=Integer.MIN_VALUE;
        Queue<Character> q=new LinkedList<>();
        for(int i=0;i<k;i++){
            char ch=s.charAt(i);
            q.add(ch);
            if(ch=='a' ||ch=='e'|| ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        max=count;
        for(int i=k;i<s.length();i++){
            char ch=s.charAt(i);
            q.add(ch);
            if(ch=='a' ||ch=='e'|| ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
            int r=q.remove();
            if(r=='a' ||r=='e'|| r=='i'||r=='o'||r=='u'){
                count--;
            }
            max=Math.max(max,count);
        }
        return max;

    }
}