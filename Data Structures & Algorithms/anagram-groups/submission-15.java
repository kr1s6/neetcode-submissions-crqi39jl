class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> freq = new HashMap<>();
        
        for(String s : strs){
            char[] array = new char[26];
            for(char a : s.toCharArray()){
                array[a - 'a']++;
            }

            freq.computeIfAbsent(new String(array), key -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(freq.values());
    }
}
