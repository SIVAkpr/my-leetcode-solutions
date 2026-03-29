1class Solution {
2    public void rotate(int[][] matrix) {
3        int n=matrix.length;
4        for(int i=0;i<n/2;i++){
5            for(int j=0;j<n;j++){
6                int temp=matrix[i][j];
7                matrix[i][j]=matrix[n-i-1][j];
8                matrix[n-i-1][j]=temp;
9            }
10        }
11        for(int i=0;i<n;i++){
12            for(int j=0;j<i;j++){
13                int temp=matrix[i][j];
14                matrix[i][j]=matrix[j][i];
15                matrix[j][i]=temp;
16            }
17        }
18    }
19}