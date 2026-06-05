class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        Set<String> set=new HashSet<>();
        for(int i=0;i<bannedWords.length;i++){
            set.add(bannedWords[i]);
        }
        int count=0;
        for(String msg:message){
            if(set.contains(msg))count++;
            if(count>1)return true;
        }
        return false;
    }
}