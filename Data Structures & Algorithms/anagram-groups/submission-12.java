class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> freq = new HashMap<>();
        for(String s : strs){
            int[] count = new int[26];
            for(char c : s.toCharArray()){
                // oblicznie indexu tablicy
                // 'a' - 'a' = 0  |  'b' - 'a' = 1  | 'z' - 'a' = 25
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);
            System.out.println(key);
            freq.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(freq.values());
    }
}
