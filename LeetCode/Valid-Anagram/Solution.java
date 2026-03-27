1class Solution {
2    public boolean isAnagram(String s, String t) {
3        if(s.length()!=t.length()){
4            return false;
5        }
6        HashMap<Character,Integer> map1=new HashMap<>();
7        HashMap<Character,Integer> map2=new HashMap<>();
8        for(int i=0;i<s.length();i++){
9            map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0)+1);
10            map2.put(t.charAt(i),map2.getOrDefault(t.charAt(i),0)+1);
11        }
12        for(Map.Entry<Character,Integer> entry: map1.entrySet()){
13            if(!entry.getValue().equals(map2.get(entry.getKey()))){
14                return false;
15            }
16        }
17        return true;
18    }
19}