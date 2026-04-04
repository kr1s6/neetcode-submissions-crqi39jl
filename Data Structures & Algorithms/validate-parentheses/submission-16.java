class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = Map.of(
            ')', '(',
            ']', '[',
            '}', '{'
        );

        Deque<Character> stack = new ArrayDeque();
        for(char c : s.toCharArray()){
            if(map.containsKey(c) && !stack.isEmpty()){
                char last = stack.pollFirst();
                if(map.get(c) != last){
                    return false;
                }
            } else {
                stack.addFirst(c);
            }
        }

        return stack.isEmpty();
    }
}
