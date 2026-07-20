class Solution {
    public int subarraySum(int[] nums, int k) {
        int[] prefixSum=new int[nums.length+1];
        for(int i=1;i<=nums.length;i++){
            prefixSum[i]=prefixSum[i-1]+nums[i-1];
        }
        int count=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0, 1);
        for(int i=1;i<=nums.length;i++){
            count+=map.getOrDefault(prefixSum[i]-k,0);
            map.put(prefixSum[i],map.getOrDefault(prefixSum[i],0)+1);
        }
        return count;
    }
}