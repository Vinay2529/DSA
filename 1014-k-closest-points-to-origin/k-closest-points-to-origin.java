class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int left=0,right=points.length-1;
        while(left<=right)
        {
            int pivotindex=partition(points,left,right);
            if(pivotindex==k-1)
            {
                break;
            }
            else if(pivotindex>k-1)
            {
                right=pivotindex-1;
            }
            else{
                left=pivotindex+1;
            }
        }
        int[][] result=new int[k][2];
        for(int i=0;i<k;i++)
        {
            result[i]=points[i];
        }
        return result;
    }
    private int partition(int[][] points,int left,int right)
    {
        int pivotindex=left+ new Random().nextInt(right-left+1);
        int[] pivotpoint=points[pivotindex];

        swap(points,pivotindex,right);
        int i=left;
        for(int j=left;j<right;j++)
        {
            if(compare(points[j],pivotpoint)<0)
            {
                swap(points,i++,j);
            }
        }
        swap(points,i,right);
        return i;
    }
    private int compare(int[] point1,int[] point2)
    {
        return (point1[0] * point1[0] + point1[1] * point1[1]) - (point2[0] * point2[0] + point2[1] * point2[1]);
    }
    private void swap(int[][] points, int i, int j) { int[] temp = points[i]; points[i] = points[j]; points[j] = temp; }
}