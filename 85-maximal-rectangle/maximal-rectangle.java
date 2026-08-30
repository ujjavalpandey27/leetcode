class Solution {
    public int maximalRectangle(char[][] matrix) {
        int[] arr=new int[matrix[0].length];
        int cur=0;
        int max=0;
        for(int i=0;i<matrix.length;i++){
           
            for (int j = 0; j <matrix[i].length ; j++) {
                if(matrix[i][j]=='1'){
                    
                    arr[j]+=1;
                }
                else{
                    arr[j]=0;
                }
            }
            cur=hex(arr);
            max=Math.max(cur,max);
            
        }
        return max;
    }
    public int hex(int[] arr){
        int nse=0;
        int pse=0;
        int max=0;
        int cur=0;
        int index=0;
        
        Stack<Integer> st=new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
               index=st.pop();
               
               nse=i;
               if(st.isEmpty()){
                   pse=-1;
               }
               else
                    pse=st.peek();
               
               cur=arr[index]*(nse-pse-1);
               max=Math.max(cur,max);
                
                
            }
            st.push(i);
            
        }
        while(!st.isEmpty()){
            index=st.pop();

            nse=arr.length;
            if(st.isEmpty()){
                pse=-1;
            }
            else
                pse=st.peek();

            cur=arr[index]*(nse-pse-1);
            max=Math.max(cur,max);

        }
        return max;

        }
    }
