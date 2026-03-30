class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // gdy były dwa anagramy to tworzyło się dwie mapy <char, count> i potem się je porównywało
        // sprawdzało się na początku czy oba strinki mają w ogóle tyle samo liter

        Map<String, List<String>> map = new HashMap<>();

        for(String str : strs){
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            map.computeIfAbsent(sortedStr, key -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(map.values());
        
    }
}
