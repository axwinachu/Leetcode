class Solution {
    public String processStr(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            switch(s.charAt(i)){
                case '*':
                if(sb.length()!=0)sb.deleteCharAt(sb.length()-1);
                break;
                case '#':
                sb.append(sb);
                break;
                case '%':
                sb.reverse();
                break;
                default:
                sb.append(s.charAt(i)+"");
            }
            
        }
        return sb.toString();
    }
}