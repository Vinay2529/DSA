class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n=position.length;
        int start=1,end=position[n-1]-position[0];
        int ans=1;
        while(start<=end){
            int mid=(start+end)/2;
            if(isDistancePossible(position,m,mid))
            {
                ans=mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }
    private boolean isDistancePossible(int[] position,int noOfBalls,int distance){
        int ballsplaced=1;
        int lastBallPlaced=position[0];
        for(int i=1;i<position.length && ballsplaced<noOfBalls;i++){
            if(position[i]>= lastBallPlaced+distance ){
                lastBallPlaced=position[i];
                ballsplaced++;
            }
        }
        return ballsplaced==noOfBalls;
    }
}