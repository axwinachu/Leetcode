class Solution {
    public int firstUniqChar(String s) {
        // for(int i=0;i<s.length();i++){
        //     boolean flag=false;
        //     for(int j=0;j<s.length();j++){
        //         if(i!=j){
        //             if(s.charAt(i)==s.charAt(j)){
        //                 flag=true;
        //                 break;
        //             }
        //         }
        //     }
        //     if(!flag) return i;

        // }
        // return -1;

        //optimized
        // Map<Character,Integer> map=new HashMap<>();
        // for(int i=0;i<s.length();i++){
        //     if(map.containsKey(s.charAt(i))){
        //         map.put(s.charAt(i),map.get(s.charAt(i))+1);
        //     }else{
        //     map.put(s.charAt(i),1);
        //     }
        // }
        // for(int i=0;i<s.length();i++){
        //     if(map.get(s.charAt(i))==1){
        //         return i;
        //     }
        // }
        // return -1;

        //more optimized

        int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(arr[s.charAt(i)-'a']==1)return i;
        }
        return -1;
    }
}