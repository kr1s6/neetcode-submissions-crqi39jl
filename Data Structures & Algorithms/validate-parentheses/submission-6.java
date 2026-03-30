class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> closeToOpen = new HashMap<>();
        closeToOpen.put(')', '(');
        closeToOpen.put(']', '[');
        closeToOpen.put('}', '{');
        for(Character ch : s.toCharArray()){
            if(closeToOpen.containsKey(ch)){
                if(stack.isEmpty()){
                    return false;
                }
                char znak = stack.removeLast();
                if(closeToOpen.get(ch) != znak){
                    return false;
                }
            } else{
                stack.addLast(ch);
            }
        }

        return stack.isEmpty();
    }
}
