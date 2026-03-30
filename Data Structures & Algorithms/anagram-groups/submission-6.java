class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Map<Character, Integer>, List<String>> groupedAnnagrams = new HashMap<>();

        for(String str : strs){
            Map<Character, Integer> map = new HashMap<>();
            for(int i=0; i<str.length(); i++){
                map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
            }

            groupedAnnagrams.computeIfAbsent(map, key -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(groupedAnnagrams.values());
        
    }
}
