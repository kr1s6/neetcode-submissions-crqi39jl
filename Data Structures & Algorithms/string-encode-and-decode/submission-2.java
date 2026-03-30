class Solution {

    public String encode(List<String> strs) {
        StringBuilder output = new StringBuilder();
        for(String str : strs){
            output.append(str.length() + "#" + str);
        }
        System.out.println(output);
        return output.toString();
    }

    public List<String> decode(String str) {
        List<String> output = new ArrayList<>();
        int i = 0;
        while(i < str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int strLength = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            j = i + strLength;
            output.add(str.substring(i, j));
            
            i = j;
        }
        return output;
    }
}
