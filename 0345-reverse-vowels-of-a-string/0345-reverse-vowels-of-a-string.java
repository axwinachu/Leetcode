class Solution {
    public String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        char[] str=s.toCharArray();
        while(i<j){
            while(i<j &&!isVowel(str[i])){
                i++;
            }
            while(i<j && !isVowel(str[j])){
                j--;
            }
            if(j<=i ||j<0)return new String(str);
            char temp=str[i];
            str[i]=str[j];
            str[j]=temp;
            i++;
            j--;
        }
        return new String(str);
    }
     private boolean isVowel(char ch){
        return "aeiouAEIOU".indexOf(ch)!=-1;
    }
}