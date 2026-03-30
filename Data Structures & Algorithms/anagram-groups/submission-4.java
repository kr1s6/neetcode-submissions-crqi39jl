class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Map<Character, Integer>, List<String>> sMap = new HashMap<>();

        for(String str : strs){
            Map<Character, Integer> strMap = new HashMap<>();
            for(int i=0; i < str.length(); i++){
                strMap.put(str.charAt(i), strMap.getOrDefault(str.charAt(i), 0) + 1);
            }

            if(sMap.containsKey(strMap)){
                ArrayList<String> v = new ArrayList<>(sMap.get(strMap));
                v.add(str);
                sMap.put(strMap, v);
            } else {
                sMap.put(strMap, List.of(str));  
            }
        }

        return new ArrayList<>(sMap.values());
    }
}
