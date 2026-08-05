1class Solution {
2    public List<String> letterCombinations(String digits) {
3        List<String> rst=new ArrayList<>();
4        String[] num={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
5        int n;
6        rst.add("");
7        for(char i : digits.toCharArray()){
8            List<String> l=new ArrayList<>();
9            n=i-'0';
10            for(int j=0;j<num[n].length();j++){
11                for(String k : rst)
12                    l.add(k+num[n].charAt(j));
13            }
14            rst=l;
15        }
16        return rst;
17    }
18}