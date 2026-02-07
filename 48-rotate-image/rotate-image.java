class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(i!=j)
                {
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }
            }
        }

        for(int i=0;i<n;i++)
        {
            reverse(matrix,n,i);
        }
    }
    private void reverse(int[][] matrix,int n,int row)
    {
        int s=0,e=n-1;
        while(s<=e){
            int temp=matrix[row][s];
            matrix[row][s]=matrix[row][e];
            matrix[row][e]=temp;
            s++;
            e--;
        }
    }
}