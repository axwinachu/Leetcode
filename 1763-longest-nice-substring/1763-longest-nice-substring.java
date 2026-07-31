class Solution {
    public String longestNiceSubstring(String s) {
        List<String> subString=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                subString.add(s.substring(i,j));
            }
        }
       String ans="";
        for(String str: subString){
            Set<Character> set = new HashSet<>();
            boolean flag=true;
            for(char ch : str.toCharArray()){ 
              set.add(ch);
            }
            for(char ch : str.toCharArray()){
                if(Character.isLowerCase(ch)){
                    if(!set.contains(Character.toUpperCase(ch))){
                      flag=false;
                      break;
                    }
                }else{
                    if(!set.contains(Character.toLowerCase(ch))){
                      flag=false;
                      break;
                    }
                }
            }
            if(flag){
                if (flag && str.length() > ans.length()) {
                   ans = str;
                }
            }
        }
        return ans;
    }
}