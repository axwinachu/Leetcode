class Solution {
    public char findTheDifference(String s, String t) {
        int[] ch=new int[26];
        for(char cha:s.toCharArray()){
            int idx=cha-'a';
            ch[idx]++;
        }
        for(char cha:t.toCharArray()){
            int idx=cha-'a';
            ch[idx]++;
        }
        for(int i=0;i<26;i++){
            if(ch[i]%2!=0){
                return (char) (i+'a');
            }
        }
        return ' ';

    }
}