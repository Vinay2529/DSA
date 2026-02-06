class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start=1,end=maximum(piles);
        int ans=1;
        while(start<=end){
            int speed=(start+end)/2;
            int noofhours=calculate(piles,speed);
            if(noofhours>h)
            {
                start=speed+1;
            }
            else{
                ans=speed;
                end=speed-1;
            }
        }
        return ans;
    }
    private int calculate(int[] piles,int speed)
    {
        int hour=0;
        for(int pile:piles)
        {
            hour+=Math.ceil((pile+0.0)/speed);
        }
        return hour;
    }
    private int maximum(int[] nums){
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        return max;
    }
}