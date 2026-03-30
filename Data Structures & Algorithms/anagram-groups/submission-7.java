class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groupedAnnagrams = new HashMap<>();

        for(String str : strs){
            char[] letters = str.toCharArray();
            Arrays.sort(letters);
            String sortedLetters = new String(letters);
            groupedAnnagrams.computeIfAbsent(sortedLetters, key -> new ArrayList<>()).add(str);
        }

        return new ArrayList(groupedAnnagrams.values());
        
    }
}
