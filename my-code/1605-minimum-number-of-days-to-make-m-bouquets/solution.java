class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
    if ((long) m * k > bloomDay.length) return -1;
     int low=Integer.MAX_VALUE;
     for(var i:bloomDay){
        if(i<low){
            low=i;
        }
     }
    int high=Integer.MIN_VALUE;
     for(var i:bloomDay){
        if(i>high){
            high=i;
        }
     }
    int ans=-1;

    while(low<=high){
        int mid= low+(high-low)/2;
        int result=helper(bloomDay,k,m,mid);
        if(result==1){
            ans=mid;
            high=mid-1;
        }
        else{
            low=mid+1;
        }
        
    }
    return ans;
    }
    public int helper(int[] bloomDay,int k, int m,int mid){
        int count=0;
        int bouquets=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=mid){
                count++;
                if(count==k){
                    bouquets++;
                    if(bouquets==m){
                        return 1;
                    }
                    count=0;
                }
               
                
            }
             else{
                    count=0;
                }
            

        }
        return 0;

    }
    }

