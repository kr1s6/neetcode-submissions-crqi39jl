class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        // Now we can comapre first and last element only
        for(int i = 0; i < strs[0].length(); i++){
            if(strs[strs.length - 1].charAt(i) != strs[0].charAt(i)){
                return strs[0].substring(0, i);
            }
        }

        return strs[0];
    }
}