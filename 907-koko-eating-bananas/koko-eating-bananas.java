class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start=0,end=maximum(piles);
        int ans=end;
        while(start<=end){
            int speed=(start+end)/2;
            int noOfHours=calculateNoOfHour(piles,speed);
            if(noOfHours>h){
                start=speed+1;
            }
            else{
                ans=speed;
                end=speed-1;
            }
        }
        return ans;
    }
    private int maximum(int[] nums){
        int max=nums[0];
        for(int num:nums){
            if(num>max){
                max=num;
            }
        }
        return max;
    }
    private int calculateNoOfHour(int[] piles,int speed){
        int hours=0;
        for(int pile:piles){
            hours+=Math.ceil((pile+0.0)/speed);
        }
        return hours;
    }
}