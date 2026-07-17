class Solution {
    public int longestPalindrome(String s) {
        int[] arr=new int[128];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)]++;
        }
        int numChar=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
              numChar++;
            }
        }
        if(numChar<=1){
            return s.length();
        }
        int count=0;
        boolean oneFlag=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                count+=arr[i];
            }else{
                count+=arr[i]-arr[i]%2;
                oneFlag=true;
            }
        }
        return oneFlag?count+1:count;
    }
}