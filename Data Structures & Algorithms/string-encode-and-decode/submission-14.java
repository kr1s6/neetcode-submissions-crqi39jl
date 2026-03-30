class Solution {

    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        for(String str : strs){
            res.append(str.length()).append('#').append(str);
        }
        System.out.println("Result: " + res.toString());
        return res.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();

        for(int i=0; i<str.length(); i++){
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int len = Integer.parseInt(str.substring(i, j));
            System.out.println("len: "+ len);
            i = j + 1;
            j = i + len;
            res.add(str.substring(i, j));
            i = j - 1;
        }

        return res;
    }
}
