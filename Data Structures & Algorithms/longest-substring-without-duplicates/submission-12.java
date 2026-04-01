class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();

        int res = 0;
        int l = 0;
        for(int r = 0; r < s.length(); r++){
            if(map.containsKey(s.charAt(r)) && map.get(s.charAt(r)) >= l){
                l = map.get(s.charAt(r)) + 1;
                map.remove(s.charAt(r));
            }

            map.put(s.charAt(r), r);
            res = Math.max(res, r-l+1);
        }

        return res;
    }
}

// 0 1 2 3 4 5 6
// z x y z x y z
//     l
//         r  

// 0 1 2 3
// a b b a
//     l
//       r