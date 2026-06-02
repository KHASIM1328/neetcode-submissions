class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                stack.add(ch);
            }
            else{
                char top = stack.peek();
                if(stack.isEmpty() || (ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')){
                    return false;
                }
                else{
                    stack.pop();
                }
            }
        }

        return stack.isEmpty();
    }
}
