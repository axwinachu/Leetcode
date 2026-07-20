class Solution {
    
    public int pivotIndex(int[] nums) {
        int[] arr=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            arr[i+1]=arr[i]+nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(rangeSum(arr,0,i)==rangeSum(arr,i,nums.length-1)){
                return i;
            }
        }
        return -1;
    }
    private int rangeSum(int[] prefix,int left,int right){
        return prefix[right+1]-prefix[left];
    }
    
}