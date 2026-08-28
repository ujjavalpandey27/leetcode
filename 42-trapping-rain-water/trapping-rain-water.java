class Solution {
    public int trap(int[] height) {
        
        int l=0;
        int r=height.length-1;
        
        int[] leftmax=new int[height.length];
        int[] rightmax=new int[height.length];
        int total=0;

        while(r>=0){
            if(r==height.length-1){
                rightmax[r]=height[r];
                r--;
                continue;
            }
            rightmax[r]=Math.max(height[r],Math.max(rightmax[r+1],height[r+1]));
            r--;


        }
        while(l<height.length){
            if(l==0){
                leftmax[l]=height[l];
                l++;
                continue;
            }
            leftmax[l]=Math.max(height[l],Math.max(leftmax[l-1],height[l-1]));
            l++;


        }

        for(int i=0;i<height.length;i++){
        total+=(Math.min(leftmax[i],rightmax[i])-height[i]);
        }
        return total;
    }
}