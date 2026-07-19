class Solution {
    public String simplifyPath(String path) {
        String[] sep=path.split("/");
        List<String> l=new ArrayList<>();
        for(String p:sep){
            if(p.equals(".") ||p.equals("")){continue;}
            if(p.equals("..")){
                if(!l.isEmpty()){
                    l.remove(l.size()-1);
                }
            }
            else{
                l.add(p);
            }
        }
        return "/"+String.join("/",l); 
    }
}