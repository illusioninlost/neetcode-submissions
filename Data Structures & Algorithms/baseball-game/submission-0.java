class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s = new Stack<>();

        for(String op: operations){
            if(op.equals("+")){
                int top = s.pop();
                int newScore = top + s.peek();
                s.push(top);
                s.push(newScore);
            }else if(op.equals("D")){
                s.push(s.peek()*2);
            }else if(op.equals("C")){
                s.pop();
            }else{
                s.push(Integer.parseInt(op));
            }
        }

        int sum = 0;
        for(int score: s){
            sum += score;
        }
        return sum;
    }
}