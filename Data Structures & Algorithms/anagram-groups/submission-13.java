class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> freq = new HashMap<>();

        for(String s : strs){
            int[] count = new int[26];
            char[] array = s.toCharArray();
            for(char h : array){
                count[h - 'a']++;
            }
            String key = Arrays.toString(count);
            freq.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(freq.values());
    }
}
