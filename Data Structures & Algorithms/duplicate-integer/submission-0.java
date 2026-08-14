class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int a:nums)
        {
            if(map.containsKey(a))
            {
                map.put(a,map.getOrDefault(a,0)+1);
            }
            else
            {
                map.put(a,1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            if(entry.getValue()>1)
            {
                return true;
            }
        }
        return false;
    }
}