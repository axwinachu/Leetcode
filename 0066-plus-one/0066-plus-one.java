class Solution {
    public int[] plusOne(int[] digits) {
        if(digits[digits.length-1]!=9){
            digits[digits.length-1]=digits[digits.length-1]+1;
            return digits;
        }
        int i=digits.length-1;
        while(i>=0){
            if(digits[i]==9){
                if(i!=0){
                    digits[i]=0;
                }else{
                    if(digits[i]!=9){
                        digits[i]=digits[i]+1;
                    }else{
                        int[] res=new int[digits.length+1];
                        for(int j=1;j<res.length;j++){
                            res[j]=0;
                        }
                        res[0]=1;
                        return res;
                    }
                }
                
            }else{
                digits[i]=digits[i]+1;
                break;
            }
            i--;
        }
        return digits;

       }
    
}