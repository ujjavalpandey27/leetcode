class Solution {
    public int totalFruit(int[] fruits) {
     HashMap<Integer,Integer> hash=new HashMap<>();
            int l=0;
            int r=0;
            int length=0;
           

            while(r<fruits.length){
                hash.put(fruits[r],hash.getOrDefault(fruits[r],0)+1);
                
                while(hash.size()>2){
                  
                   hash.put(fruits[l],hash.get(fruits[l])-1);
                    if(hash.getOrDefault(fruits[l],0)==0){
                       hash.remove(fruits[l]);
                     
                   }
                   l++;
                   
                  
                }
                
              
                length=Math.max(length,r-l+1);
                r++;
                
    }
    return length;
        
    }
}