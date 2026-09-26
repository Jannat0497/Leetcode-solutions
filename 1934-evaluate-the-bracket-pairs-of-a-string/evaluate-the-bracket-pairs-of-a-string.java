class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        StringBuilder str=new StringBuilder();
        HashMap<String,String> map=new HashMap<>();
        for(List<String> i:knowledge){
            map.put(i.get(0),i.get(1));
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                int j=s.indexOf(')',i);
                String val=s.substring(i+1,j);
                str.append(map.getOrDefault(val,"?"));
                i=j;
            }
            else{
                str.append(ch);
            }
        }
        return str.toString();
    }
}