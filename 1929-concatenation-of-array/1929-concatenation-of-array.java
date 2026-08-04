class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] res=new int[nums.length*2];
        int i=0;
        while(i<nums.length*2){
            res[i]=nums[i%nums.length];
            i++;
        }
        return res;
    }
}