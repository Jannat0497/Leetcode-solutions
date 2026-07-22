class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> ls=new ArrayList<>();
        HashSet<String> s1=new HashSet<>();
        HashSet<String> repeat=new HashSet<>();
        int len=s.length();
        for(int i=0;i<=len-10;i++){
            String str=s.substring(i,i+10);
            if(!s1.contains(str)){
                s1.add(str);
            }
            else{
                repeat.add(str);
            }
        }
        for(String i:repeat){
            ls.add(i);
        }
        return ls;
    }   
}