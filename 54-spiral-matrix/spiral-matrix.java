class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length,n=matrix[0].length;
        int direction=0;
        int left=0, right=n-1, top=0, bottom=m-1;
        List<Integer> result=new ArrayList<>();
        while(top<=bottom && left<=right)
        {
            if(direction==0)
            {
                for(int j=left;j<=right;j++)
                {
                    result.add(matrix[top][j]);
                }
                direction=1;
                top++;
            }
            else if(direction==1)
            {
                for(int i=top;i<=bottom;i++)
                {
                    result.add(matrix[i][right]);
                }
                direction=2;
                right--;
            }
            else if(direction==2)
            {
                for(int j=right;j>=left;j--)
                {
                    result.add(matrix[bottom][j]);
                }
                direction=3;
                bottom--;
            }
            else{
                for(int i=bottom;i>=top;i--)
                {
                    result.add(matrix[i][left]);
                }
                direction=0;
                left++;
            }
        }
        return result;
    }
}