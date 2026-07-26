class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length=0;
        int l=0;
        int r=0;
        HashMap<Character,Integer> hash=new HashMap<>();
        while(r<s.length()){
            if(hash.containsKey(s.charAt(r))){
                l=Math.max(l,hash.get(s.charAt(r))+1);
                hash.put(s.charAt(r),r);
            }
            
                length=Math.max(length,r-l+1);
                hash.put(s.charAt(r),r);
                r++;
                

            
        }
        return length;
    }
}