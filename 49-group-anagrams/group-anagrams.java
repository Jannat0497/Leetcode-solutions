class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String new_s = new String(chars);  
            if (!map.containsKey(new_s)) {
                map.put(new_s, new ArrayList<>());
            }
            map.get(new_s).add(str);
        }      
        return new ArrayList<>(map.values());
    }   
}
