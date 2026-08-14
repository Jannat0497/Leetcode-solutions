class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n=p.length();
        List<Integer> list=new ArrayList<>();
        if(p.length()>s.length()) return list;
        int[] freq=new int[26];
        int[] freq1=new int[26];
        for(int i=0;i<n;i++){
            freq[p.charAt(i)-'a']++;
        }
        int k=n;
        for(int i=0;i<k;i++){
            freq1[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(freq,freq1)){
            list.add(0);
        }
        for(int i=k;i<s.length();i++){
            freq1[s.charAt(i)-'a']++;
            freq1[s.charAt(i-k)-'a']--;
            if(Arrays.equals(freq,freq1)){
            list.add(i-k+1);
          }
        }
        
        return list;
    }
}