class Solution {
    public boolean isPalindrome(String s) {
        String sNew = s.replaceAll("[^a-zA-z0-9]", "").toLowerCase();   
        System.out.println(sNew);

        int left = 0;
        int right = sNew.length() - 1;
        while(left < right){
            if(sNew.charAt(left) != sNew.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
