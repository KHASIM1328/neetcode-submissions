class Solution {
    public int calPoints(String[] operations) {

        Stack<String> stack = new Stack<>();

        int total = 0;

        for(String operation : operations){
            if(!stack.isEmpty() && operation.equals("+")){
                String right = stack.pop();
                String left = stack.peek();

                stack.push(right);
                int val = Integer.parseInt(right) + Integer.parseInt(left);
                stack.push(String.valueOf(val));
                total += val;
            }
            else if(operation.equals("D")){
                String last = stack.peek();
                int val = Integer.parseInt(last) * 2;
                stack.push(String.valueOf(val));
                total += val;
            }
            else if(operation.equals("C")){
                total -= Integer.parseInt(stack.pop());
            }
            else{
                stack.push(operation);
                total += Integer.parseInt(operation);
            }
        }

        return total;
        
    }
}