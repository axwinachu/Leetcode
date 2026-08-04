class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);
        }
        List<Integer> li=new ArrayList<>();
        Set<Integer> set=new HashSet<>(Arrays.stream(nums).boxed().toList());
        
        for(int i=min;i<=max;i++){
           if(!set.contains(i)){
            li.add(i);
           }
        }
        return li;
    }
}