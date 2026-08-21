class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        int count=0;
        for(int i=0;i<num.length();i++){
            while(st.size()>0 &&count<k && num.charAt(i)<st.peek()){
                st.pop();
                count++;
            }
            st.push(num.charAt(i));

        }
        while(count<k && st.size()>0){
            st.pop();
            count++;
        }

        StringBuilder s= new StringBuilder();
        while(st.size()>0){
            s.append(st.pop());
        }
        
        s.reverse();
        while(s.length()>0 && s.charAt(0)=='0'){
            s.deleteCharAt(0);
        }

        if(s.length()==0){
            return "0";
        }
        return s.toString();
        
        
    }
}