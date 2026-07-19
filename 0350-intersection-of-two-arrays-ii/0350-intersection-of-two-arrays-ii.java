class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
    Map<Integer,Integer> map1=new HashMap<>();
    Map<Integer,Integer> map2=new HashMap<>();
    for(int data : nums1){
        map1.put(data,map1.getOrDefault(data,0)+1);
    }
    for(int data : nums2){
        map2.put(data,map2.getOrDefault(data,0)+1);
    }
    List<Integer> res=new ArrayList<>();
    for(int i=0;i<nums1.length;i++){
        if(map1.containsKey(nums1[i]) && map2.containsKey(nums1[i])){
            if(map1.get(nums1[i])!=0 && map2.get(nums1[i])!=0){
                res.add(nums1[i]);
                map1.put(nums1[i],map1.get(nums1[i])-1);
                map2.put(nums1[i],map2.get(nums1[i])-1);
            }
            
        }
    }
    for(int i=0;i<nums2.length;i++){
        if(map1.containsKey(nums2[i]) && map2.containsKey(nums2[i])){
            if(map1.get(nums2[i])!=0 && map2.get(nums2[i])!=0){
                 res.add(nums2[i]);
                map1.put(nums2[i],map1.get(nums2[i])-1);
                map2.put(nums2[i],map2.get(nums2[i])-1);
            }
            
        }
    }
    return  res.stream()
          .mapToInt(Integer::intValue)
          .toArray();
    }
}