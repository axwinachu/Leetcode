class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            Set<Integer> set2=new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                if(set2.contains(-1*(nums[i]+nums[j]))){
                    List<Integer> li=new ArrayList<>();
                    li.add(nums[i]);
                    li.add(nums[j]);
                    li.add(-1*(nums[i]+nums[j]));
                    li.sort((a,b)->a-b);
                    set.add(li);
                }
                set2.add(nums[j]);
            }
        }
        return set.stream().toList();
    }
}