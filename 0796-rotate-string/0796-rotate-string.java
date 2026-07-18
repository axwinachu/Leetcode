class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        String newString=s+s;
        for(int i=0;i<newString.length()-goal.length();i++){
            if(newString.substring(i,i+goal.length()).equals(goal)){
                return true;
            }
        }
        return false;
    }
}