class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        for(int i = 0; i < strs[0].length(); i++){
            for(String str : strs){
                if(str.charAt(i) != strs[0].charAt(i)){
                    return str.substring(0, i);
                }
            }
        }

        return strs[0];
    }
}