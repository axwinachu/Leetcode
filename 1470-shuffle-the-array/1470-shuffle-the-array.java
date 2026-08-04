class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res=new int[nums.length];
        int i=0;
        int j=n;
        int idx=0;
        while(j<nums.length){
            res[idx]=nums[i];
            res[idx+1]=nums[j];
            idx+=2;
            i++;
            j++;
        }
        return res;
    }
}