class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> answer=new ArrayList<>();

        for(int i=0;i<n;i++){
            List<Integer> rows=new ArrayList<>();

            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    rows.add(1);
                }
                else{
                    rows.add(
                        answer.get(i-1).get(j-1)+
                        answer.get(i-1).get(j)
                    );
                }
            }
            answer.add(rows);
        }
        return answer;
    }
}