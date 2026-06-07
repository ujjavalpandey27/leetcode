class Solution {
    public int evalRPN(String[] tokens) {  
        int[] temp = new int[tokens.length];
        int count = 0; // This acts as your stack pointer
        
        for (String i : tokens) {
            switch (i) {
                case "+":
                    temp[count - 2] = temp[count - 2] + temp[count - 1];
                    count--; // Shrink the stack by 1
                    break;
                case "-":
                    temp[count - 2] = temp[count - 2] - temp[count - 1];
                    count--;
                    break;
                case "*":
                    temp[count - 2] = temp[count - 2] * temp[count - 1];
                    count--;
                    break;
                case "/":
                    temp[count - 2] = temp[count - 2] / temp[count - 1];
                    count--;
                    break;
                default:
                 
                    temp[count] = Integer.parseInt(i);
                    count++;
                    break;
            }
        }
        return temp[0]; 
    }
}
