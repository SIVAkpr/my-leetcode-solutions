1class Solution {
2    public List<Integer> spiralOrder(int[][] matrix) {
3        int row=matrix.length;
4        int col=matrix[0].length;
5        List<Integer> rst=new ArrayList<>();
6        int l=row*col;
7        int top=0;
8        int right=col-1;
9        int left=0;
10        int bottom=row-1;
11        // System.out.println(row+" "+col+" "+bottom);
12        while(top<=bottom && left<=right){
13            for(int i=left;i<=right;i++){
14                rst.add(matrix[top][i]);
15            }
16            top++;
17            for(int i=top;i<=bottom;i++){
18                rst.add(matrix[i][right]);
19            }
20            right--;
21            if(top<=bottom){
22                for(int i=right;i>=left;i--){
23                    rst.add(matrix[bottom][i]);
24                }
25                bottom--;
26            }
27            if(left<=right){
28                for(int i=bottom;i>=top;i--){
29                    rst.add(matrix[i][left]);
30                }
31                left++;
32            }
33        }
34        return rst;
35    }
36}