class Solution {
    public boolean isPalindrome(int x) {
        int num=x;
      if(num<0)return false;
      int rev=0;
      while(num>0){
        int dig=num%10;
        rev=(rev*10)+dig;
        num/=10;
      }
      return x==rev;
    }
}