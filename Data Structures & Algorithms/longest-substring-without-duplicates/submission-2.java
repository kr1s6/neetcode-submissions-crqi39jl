class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> charSet = new HashSet<>();
        int l =0;
        int max = 0;
        
        for(int r = 0; r < s.length(); r++){
            while(charSet.contains(s.charAt(r))){
                charSet.remove(s.charAt(l++));
            }
            charSet.add(s.charAt(r));
            max = Math.max(max, charSet.size());
        }

        return max;
    }
}
