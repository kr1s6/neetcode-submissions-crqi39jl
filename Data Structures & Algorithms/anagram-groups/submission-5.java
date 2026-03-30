class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap<Character, Integer>, List<String>> sMap = new HashMap<>();

        for(String str : strs){
            HashMap<Character, Integer> strMap = new HashMap<>();
            for(int i=0; i < str.length(); i++){
                strMap.put(str.charAt(i), strMap.getOrDefault(str.charAt(i), 0) + 1);
            }

            if(sMap.containsKey(strMap)){
                sMap.get(strMap).add(str);
            } else {
                sMap.put(strMap, new ArrayList(List.of(str)));  
            }
        }

        return new ArrayList<>(sMap.values());
    }
}
