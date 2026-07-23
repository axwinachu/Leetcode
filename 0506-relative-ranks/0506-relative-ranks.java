class Solution {
    public String[] findRelativeRanks(int[] score) {
        Map<Integer,Integer> map=new TreeMap<>(Collections.reverseOrder());
        for(int i=0;i<score.length;i++){
            map.put(score[i],i);
        }
        String[] ans = new String[score.length];

        int rank = 1;

        for (int index : map.values()) {

            if (rank == 1)
                ans[index] = "Gold Medal";
            else if (rank == 2)
                ans[index] = "Silver Medal";
            else if (rank == 3)
                ans[index] = "Bronze Medal";
            else
                ans[index] = String.valueOf(rank);

            rank++;
        }
        return ans;

    }
}