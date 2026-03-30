class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        int l = 0;
        for(int r = 0; r < s.length(); r++){
            char now = s.charAt(r);
            if(map.containsKey(now) && map.get(now) >= l){
                l = map.get(now) + 1;
                map.remove(now);
            }

            map.put(now, r);
            max = Math.max(max, r-l+1);
        }

        return max;
    }
}
