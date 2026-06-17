1class Solution {
2    public String processStr(String s) {
3        StringBuilder rst=new StringBuilder();
4        for(char i: s.toCharArray()){
5            if(i=='*'){
6                if(rst.length()>0){
7                    rst.setLength(rst.length()-1);
8                }
9            }
10            else if(i=='#'){
11                rst.append(rst.toString());
12            }
13            else if(i=='%'){
14                rst.reverse();
15            }
16            else{
17                rst.append(i);
18            }
19        }
20        return rst.toString();
21    }
22    // public String remove(String s){
23    //     return s.substring(0,s.length()-1);
24    // }
25    // public String duplicate(String s){
26    //     if(s!=null){
27    //         return s.repeat(2);
28    //     }
29    //     else{
30    //         return s;
31    //     }
32    // }
33    // public String reverse(String s){
34    //     String a=new StringBuilder(s).reverse().toString();
35    //     return a;
36    // }
37}