class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = Map.of(
            ')', '(',
            ']', '[',
            '}', '{'
        );

        Deque<Character> stack = new ArrayDeque<>();

        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                if(stack.isEmpty() || map.get(c) != stack.pollLast()){
                    return false;
                }
            } else {
                stack.addLast(c);
            }
        }

        return stack.isEmpty();
    }
}
