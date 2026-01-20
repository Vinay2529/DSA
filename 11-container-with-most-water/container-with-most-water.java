class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int l=0,r=n-1;
        int max=0;
        while(l<r)
        {
            int len=Math.min(height[l],height[r]);
            int width=r-l;
            int area=len*width;
            max=Math.max(area,max);
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return max;
    }
}