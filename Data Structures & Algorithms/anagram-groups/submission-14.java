class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for(String s : strs){
            char[] array = s.toCharArray();
            Arrays.sort(array);
            map.computeIfAbsent(new String(array), key -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
