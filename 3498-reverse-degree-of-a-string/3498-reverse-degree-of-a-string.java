class Solution {
    public int reverseDegree(String s) {
        int product=0;
        int st=26;
        for(int i=0;i<s.length();i++){
            int len=s.charAt(i)-'a';
            product+=(st-len)*(i+1);
        }
        return product;
    }
}