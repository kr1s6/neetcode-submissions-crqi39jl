class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> bracketsMap = new HashMap<>();
        bracketsMap.put(')', '(');
        bracketsMap.put('}', '{');
        bracketsMap.put(']', '[');

        for(Character ch : s.toCharArray()){
            if(bracketsMap.containsKey(ch) && !stack.isEmpty()){
                char last = stack.removeLast();
                if(bracketsMap.get(ch) != last){
                    return false;
                }
               
            } else{
                 stack.addLast(ch);
            }
        }

        return stack.isEmpty();
    }
}
