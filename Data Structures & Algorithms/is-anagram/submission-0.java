class Solution {
    public boolean isAnagram(String s, String t) {
       if(s.length()!=t.length())
       {
        return false;
       }
        HashMap<Character,Integer> map=new HashMap<>();
        for(char a:s.toCharArray())
        {
                map.put(a,map.getOrDefault(a,0)+1); 
        }
        for(char p:t.toCharArray())
        {
            if(!map.containsKey(p))
            {
                return false;
            }
            map.put(p,map.get(p)-1);
            if(map.get(p)==0)
            {
                map.remove(p);
            }
        }
        return map.isEmpty();
    }
}
