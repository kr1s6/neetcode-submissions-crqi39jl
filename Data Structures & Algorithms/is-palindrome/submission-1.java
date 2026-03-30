class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int sLen = s.length();
        if(sLen == 0){
            return true;
        }
        System.out.println("s: " + s + " sLen: " + sLen);
        for(int i=0; i<= sLen/2; i++){
            if(s.charAt(i) != s.charAt(sLen - 1 - i)){
                return false;
            }
           
        }

        return true;
    }
}
