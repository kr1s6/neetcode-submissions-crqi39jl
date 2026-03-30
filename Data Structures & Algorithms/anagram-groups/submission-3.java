class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap<Character, Integer>, List<String>> list = new HashMap<>();

        for(int i=0; i<strs.length; i++){
            HashMap<Character, Integer> count = new HashMap<>();
            for(char x : strs[i].toCharArray()){
                count.put(x, count.getOrDefault(x, 0) + 1);
            }

            if(list.containsKey(count)){
                list.get(count).add(strs[i]);
            }else{
                List<String> value = new ArrayList<>();
                value.add(strs[i]);
                list.put(count, value);
            }
        }

        return new ArrayList<>(list.values());

    }
}
