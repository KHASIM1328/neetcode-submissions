class Solution {
    public int minOperations(String[] logs) {

        Stack<String> stack = new Stack<>();

        for(String log : logs){
            if(!stack.isEmpty() && log.equals("../")){
                stack.pop();
            }
            else if(log.equals("./")){
                continue;
            }
            else if(log.matches("^[a-zA-Z1-9].*")){
                stack.push(log);
            }
        }

        return stack.size();
        
    }
}