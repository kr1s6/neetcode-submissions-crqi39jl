class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<HashMap<Character, Integer>, List<String>> groupedStrings = new HashMap<>();
        for(String str : strs){
            HashMap<Character, Integer> strMap = new HashMap<>();
            for(int i=0; i< str.length(); i++){
                char strKey = str.charAt(i);
                strMap.put(strKey, strMap.getOrDefault(strKey, 1) + 1);
            }
            groupedStrings.putIfAbsent(strMap, new ArrayList<>());
            groupedStrings.get(strMap).add(str);
        }

        return new ArrayList<>(groupedStrings.values()); 
    }
        
}
