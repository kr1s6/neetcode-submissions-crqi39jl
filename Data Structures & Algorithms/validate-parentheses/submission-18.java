class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = Map.of(
            ')', '(',
            '}', '{',
            ']', '['
        );

        Deque<Character> stack = new ArrayDeque<>();
        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                if(stack.poll() != map.get(c)){
                    return false;
                }
            } else {
                stack.addFirst(c);
            }
        }

        return stack.isEmpty();
    }
}
