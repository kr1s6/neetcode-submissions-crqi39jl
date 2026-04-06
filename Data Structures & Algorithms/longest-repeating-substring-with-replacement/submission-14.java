class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int res = 0;
        int maxF = 0;
        int l = 0;
        for(int r = 0; r < s.length(); r++){
            char c = s.charAt(r);
            map.put(c, map.getOrDefault(c, 0) + 1);
            maxF = Math.max(maxF, map.get(c));

            while((r-l+1) - maxF > k){
                char cl = s.charAt(l);
                map.put(cl, map.get(cl) - 1);
                l++;
            }
            res = Math.max(res, (r-l+1));
        }

        return res;
    }
}
