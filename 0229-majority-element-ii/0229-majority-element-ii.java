class Solution {
    public List<Integer> majorityElement(int[] nums) {
        if(nums.length<3)return Arrays.stream(nums).boxed().collect(Collectors.toSet())
        .stream().toList();
        int minFreq=nums.length/3;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer> ans=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>minFreq){
                ans.add(entry.getKey());
            }
        }
        return ans;
    }
}