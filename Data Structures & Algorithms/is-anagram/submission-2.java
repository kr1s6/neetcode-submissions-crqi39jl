class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sAr = s.toCharArray();
        char[] tAr = t.toCharArray();
        Arrays.sort(sAr);
        Arrays.sort(tAr);

        if(s.length() != t.length()){
            return false;
        }

        for(int i =0; i < sAr.length; i++){
            if(sAr[i] != tAr[i]){
                return false;
            }
        }
       return true;
    }
}
