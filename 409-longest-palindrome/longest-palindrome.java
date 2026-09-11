class Solution {
    public int longestPalindrome(String s) {
        if(s.length()==1){
            return 1;
        }
        Map<Character,Integer> mp=new HashMap<>();

        for(char ch:s.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        int sum=0;
        boolean hasOdd = false;

        for (Map.Entry<Character, Integer> entry : mp.entrySet()) {
            int frequency = entry.getValue();
            if(frequency%2==0){
                sum+=frequency;
            }
            else{
                sum+=frequency-1;
                hasOdd=true;
            }
        }
        if(hasOdd){
            sum+=1;
        }
        return sum;

    }
}