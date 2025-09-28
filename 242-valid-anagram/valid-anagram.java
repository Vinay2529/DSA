class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() !=t.length())
        {
            return false;
        }
        char[] arr1=s.toCharArray();
        char[] arr2=t.toCharArray();
        Map<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<arr1.length;i++)
        {
            mp.put(arr1[i],mp.getOrDefault(arr1[i],0)+1);
        }
        for(int i=0;i<arr2.length;i++)
        {
            if(!mp.containsKey(arr2[i]))
            {
                return false;
            }
            int count = mp.get(arr2[i]) - 1;
            if (count < 0) {
                return false; 
            }
            mp.put(arr2[i], count);
        }
        return true;
    }
}