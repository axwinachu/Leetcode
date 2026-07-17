class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        int count=0;
        while(i<s.length() && j<t.length()){
            char ch=s.charAt(i);
            while(j<t.length() && i<s.length()){
                if(s.charAt(i) != t.charAt(j)){
                    j++;
                }else{
                    count++;
                    i++;
                    j++;
                }
                
            }
        }
       return count==s.length();
    }
}