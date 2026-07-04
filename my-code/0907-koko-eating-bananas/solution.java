class Solution {
    public int minEatingSpeed(int[] piles, int h) {
    int low=1;
    int high=Integer.MIN_VALUE;
    for(var i :piles){
        if(i>high){
            high=i;
        }
        }
       
    int ans=Integer.MAX_VALUE;
    while(low<=high){
        int mid=low+(high-low)/2;
        int result=helper(piles,mid,h);
        if(result==0){
            low=mid+1;
        }
        else{
            ans=Math.min(mid,ans);
            high=mid-1;
        }
    
    }
    return ans;
    }
    public int helper(int[] piles,int mid,int h){
        long sum=0;
        for(int i=0;i<piles.length;i++){
            sum+=((piles[i]+mid-1)/mid);
            if(sum>h){
                return 0;
            }
        }
        
            return 1;
        



    }
    }

