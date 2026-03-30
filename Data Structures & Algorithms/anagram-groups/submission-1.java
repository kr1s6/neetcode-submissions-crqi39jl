class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<HashMap<Character, Integer>, List<String>> groupedStrings = new HashMap<>();
        for(String str : strs){
            HashMap<Character, Integer> strMap = new HashMap<>();
            for(int i=0; i< str.length(); i++){
                char strKey = str.charAt(i);
                strMap.put(strKey, strMap.getOrDefault(strKey, 1) + 1);
            }
            groupedStrings.computeIfPresent(strMap, (k, v) -> {
                v.add(str);
                return v;
            });
            groupedStrings.computeIfAbsent(strMap, k -> new ArrayList<>(List.of(str)));
        }

        return new ArrayList<>(groupedStrings.values()); 
    }
        
}
