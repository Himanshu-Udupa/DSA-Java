class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for (String token : tokens) {
            if (!(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")))
                stack.push(Integer.parseInt(token));
            else {
                int b = stack.pop();
                int a = stack.pop();
                int res = switch (token.charAt(0)) {
                    case '+' -> a + b;
                    case '-' -> a - b;
                    case '*' -> a * b;
                    case '/' -> a / b;
                    default -> 0;
                };
                stack.push(res);
            }
        }
        return stack.peek();
    }
}
