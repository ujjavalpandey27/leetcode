class Solution {
    public double myPow(double x, int n) {
    long N=n;
    double y=x;
      if(n<0){
        y=(1/x);
       N*=-1;
       }
      return helper(y,N);
    }
    public double helper(double x, long n){
        if(n==0){
            return 1;
        }
        if(x==0 || x==1 ||n==1){
            return x;
        }
       

       

       if(n%2==0){
        return helper(x*x,n/2);
       }
       else{
        return helper(x,n-1)*x;
       }
    }
}
