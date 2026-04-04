class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int res = 0;

        int l = 0;
        int maxF = 0;
        for(int r = 0; r < s.length(); r++){
            char cr = s.charAt(r);
            map.put(cr, map.getOrDefault(cr, 0) + 1);
            maxF = Math.max(maxF, map.get(cr));

            while((r-l+1) - maxF > k){
                map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
                l++;
            }
            res = Math.max(res, r-l+1);
        }

        return res;
    }
}
