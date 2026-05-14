class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for (String ops : operations) {
            if (ops.equals("+")) {
                int prev = stack.pop();
                int beforePrev = stack.peek();
                int sum = prev + beforePrev;
                stack.push(prev);
                stack.push(sum);
            } else if (ops.equals("D")) {
                stack.push(stack.peek() * 2);
            } else if (ops.equals("C")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(ops));
            }
        }
        int total = 0;
        for (int num : stack) {
            total += num;
        }
        return total;
    }
}