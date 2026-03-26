class Solution {
    public String mergeAlternately(String word1, String word2) {
        int s1=word1.length();
        int s2=word2.length();
        int i=0;
        int j=0;
        String res="";
        while(i<s1 && j<s2){
            res=res+word1.charAt(i)+word2.charAt(j);
            i++;
            j++;
        }
        while(i<s1){
            res=res+word1.charAt(i);
            i++;
        }
        while(j<s2){
            res=res+word2.charAt(j);
            j++;
        }
        return res;
    }
}