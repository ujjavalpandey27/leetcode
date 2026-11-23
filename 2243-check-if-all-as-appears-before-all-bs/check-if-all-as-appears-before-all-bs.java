class Solution {
    public boolean checkString(String s) {
        int i=0;
        while(i<s.length() && s.charAt(i)!='b'){
                i++;
            }
        if(i<s.length() && s.charAt(i)=='b'){
        for (int j = i+1; j <s.length() ; j++) {
            if(s.charAt(j)=='a'){
                return false;
            }

        }

        }

        return true;
    }}