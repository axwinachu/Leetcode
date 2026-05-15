class Solution {
    public int findMin(int[] nums) {
        int min=nums[0];
        for(int i=1;i<nums.length;i++){
         if(nums[i-1]>nums[i]){
            return nums[i];
         }
        }
        return min;
    }
}