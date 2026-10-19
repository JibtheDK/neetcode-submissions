class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            String t = tokens[i];
            if (t.equals("+") || t.equals("-") || t.equals("*") ||          t.equals("/")) {
                int right = stack.pop();
                int left = stack.pop();
                if (t.equals("+")) stack.push(left + right);
                else if (t.equals("-")) stack.push(left - right);
                else if (t.equals("*")) stack.push(left * right);
                else stack.push(left / right);
            } else {
                stack.push(Integer.parseInt(t));
            }
        }
        return stack.pop();
    }
}