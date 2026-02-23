class Solution {
    public List<String> letterCombinations(String digits) {
        String[] mapping=new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> combination=new ArrayList<>();
        String temp="";
        backtrack(combination,mapping,temp,0,digits);
        return combination;
    }
    private void backtrack(List<String> combination,String[] mapping,String current,int i,String digits)
    {
        if(i==digits.length())
        {
            combination.add(current);
        }
        else{
            int digit=digits.charAt(i)-'0';
            String validLetter=mapping[digit];
            for(int j=0;j<validLetter.length();j++)
            {
                backtrack(combination,mapping,current+validLetter.charAt(j),i+1,digits);
            }
        }
    }
}