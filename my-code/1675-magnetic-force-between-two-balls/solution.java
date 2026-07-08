class Solution {
    public int maxDistance(int[] position, int m) {
         Arrays.sort(position);
    int low=1;
    int high=position[position.length-1]-position[0];
    int ans=Integer.MIN_VALUE;
    while(low<=high){
        int mid=low+(high-low)/2;
        int result=helper(position,m,mid);  
        if(result==1){
            ans=Math.max(ans,mid);
            low=mid+1;
        }  
        else{
            high=mid-1;
        }
    }
    if(ans==Integer.MIN_VALUE){
        return 0;
    }
    return ans;
    }
    public int helper(int[] position,int m,int mid){
        int counter=1;
        int lastplaced=position[0];
        for(int i=1;i<position.length;i++){
            if(position[i]-lastplaced>=mid){
                lastplaced=position[i];
                counter++;
                if(counter==m){
                    return 1;
                }
            }

        }
        return 0;
    }
    }

