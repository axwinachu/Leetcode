class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int temp=0;
        for(int i=0;i<nums.length;i++){
            if(temp<0){
                temp=0;
            }
            temp+=nums[i];
            max=Math.max(temp,max);
        }
        return max;
    }
}