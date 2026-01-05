class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mp=new HashMap<>();
        for(String str:strs)
        {
            char[] arr=str.toCharArray();
            Arrays.sort(arr);
            String key=String.valueOf(arr);
            if(!mp.containsKey(key))
            {
                mp.put(key,new ArrayList<>());
            }
            mp.get(key).add(str);
        }
        List<List<String>> answer=new ArrayList<>();
        for(String key:mp.keySet())
        {
            answer.add(mp.get(key));
        }
        return answer;
    }
}