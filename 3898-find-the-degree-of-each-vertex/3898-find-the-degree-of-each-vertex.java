class Solution {
    public int[] findDegrees(int[][] matrix) {
        List<Integer> li=new ArrayList<>();

        for(int i=0;i<matrix.length;i++){
            int count=0;
            for(int j=0;j<matrix.length;j++){
                if(matrix[i][j]==1){
                    count++;
                }
            }
            li.add(count);
        }
        int[] res=li.stream().mapToInt(Integer::intValue).toArray();
        return res;
    }
}