class Solution {
    public int characterReplacement(String s, int k) {
        int l=0;
        int max=0;
        int ans=0;
        int[] hash=new int[26];

        for(int r=0;r<s.length();r++){
            hash[s.charAt(r)-'A']++;
            max=Math.max(max,hash[s.charAt(r)-'A']);
            while(r-l+1-max>k){
                 hash[s.charAt(l)-'A']--;
                 l++;
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}