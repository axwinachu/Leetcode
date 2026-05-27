class Solution {
    public boolean isGood(int[] nums) {
        int max=nums[0];
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        if(max!=nums.length-1)return false;
        if(map.get(max)!=2){
            return false;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=max){
                if(map.get(nums[i])!=1){
                    return false;
                }
            }
        }
        return true;
    }
}