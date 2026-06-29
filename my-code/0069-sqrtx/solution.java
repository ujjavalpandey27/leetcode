class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1){
        return x;
    }
     int low=1;
     int high=x;
     int result=1;
    
     while(low<=high){
        int mid=low+(high-low)/2;
        long val= (long)mid*mid;
        if(val<=x){
            result=mid;
            low=mid+1;
        }
        else if(val>x){
            high=mid-1;
        }
     
     }
     return result;
    }
}
