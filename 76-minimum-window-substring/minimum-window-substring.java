class Solution {
    public String minWindow(String s, String t) {
        int l=0;
        int r=0;
        int m=t.length();
        
        HashMap<Character,Integer> hash=new HashMap<>();
        int sindex=-1;
        int minlength=Integer.MAX_VALUE;
        int count=0;

        for(int i=0;i<t.length();i++){
            hash.put(t.charAt(i),hash.getOrDefault(t.charAt(i),0)+1);
        }

        while(r<s.length()){
            if(hash.getOrDefault(s.charAt(r),0)>0){
                count++;
            }
            hash.put(s.charAt(r),hash.getOrDefault(s.charAt(r),0)-1);
            while(count==m){
                if(minlength>r-l+1){
                    minlength=r-l+1;
                    sindex=l;
                }
                hash.put(s.charAt(l),hash.get(s.charAt(l))+1);
                if(hash.get(s.charAt(l))>0){
                    count--;
                }
                
                l++;
            }
            r++;
        }
        
        return sindex==-1?"":s.substring(sindex,sindex+minlength);
    }
}