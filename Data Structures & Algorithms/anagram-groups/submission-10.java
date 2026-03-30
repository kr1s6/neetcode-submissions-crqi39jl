class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String str : strs){
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);
            map.computeIfAbsent(sorted, key -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(map.values());

    }
}
