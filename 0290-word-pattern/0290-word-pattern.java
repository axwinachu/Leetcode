class Solution {
    public boolean wordPattern(String pattern, String s) {
        char[] pat=pattern.toCharArray();
        String[] words=s.split(" ");
        if(words.length!=pat.length)return false;
        Map<Character,String> map=new HashMap<>();
        for(int i=0;i<words.length;i++){
            if(map.containsKey(pat[i])){
                if(!map.get(pat[i]).equals(words[i])){
                    return false;
                }
            }else{
                if(map.containsValue(words[i])){
                    return false;
                }
                map.put(pat[i],words[i]);
            }    
        }
        return true;
    }
}