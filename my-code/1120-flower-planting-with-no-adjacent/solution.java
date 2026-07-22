class Solution {
    public int[] gardenNoAdj(int n, int[][] paths) {
            int[] result=new int[n];
            if(paths.length==0){
                Arrays.fill(result,1);
                }
            
             int[] colour=new int[n+1];
             
            List<List<Integer>> connection=new ArrayList<>();
            List<Integer> mini=new ArrayList<>();
            
           for(int i=0;i<n+1;i++){
            connection.add(new ArrayList<>());
           }
           for(int i=0;i<paths.length;i++){
            int u=paths[i][0];
            int v=paths[i][1];
            connection.get(u).add(v);
            connection.get(v).add(u);
           }
            
           if(helper(connection,colour,1)){
            for(int i=0;i<n;i++){
                result[i]=colour[i+1];
            }
            return result;
          
           }
           return result;
            
           

        }
        public boolean issafe(List<List<Integer>> connection,int[] colour,int index,int col){
        for(int i=0;i<connection.get(index).size();i++){
            if(colour[connection.get(index).get(i)]==col){
                return false;
                
            }
           
        }
            return true;
        }
       public  boolean helper(List<List<Integer>> connection,int[] colour,int index){
        if(index==connection.size()){
            return true;
        }
        for(int i=1;i<5;i++){
            if(issafe(connection,colour,index,i)){
                colour[index]=i;
                if (helper(connection, colour, index + 1) == true) {
                    return true; 
                }
               colour[index]=0;
            }
            
            
        }
        return false;
    }
}
