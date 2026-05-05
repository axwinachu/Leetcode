class Solution {
    void helper(int curr,int n,int dif,ArrayList<Integer> sol){
        if(n==0){
            sol.add(curr);
            return;
        }
        int last=curr%10;
        if(last+dif <=9){
            helper(curr*10 +last+dif,n-1,dif,sol);
        }
        if(dif!=0 &&last-dif>=0){
            helper(curr*10 +last-dif,n-1,dif,sol);
        }

    }
    public int[] numsSameConsecDiff(int n, int k) {
        ArrayList<Integer> sol=new ArrayList<>();
        for(int i=1;i<=9;i++){
            helper(i,n-1,k,sol);
        }
        int[] res=new int[sol.size()];
        for(int i=0;i<sol.size();i++){
            res[i]=sol.get(i);
        }
        return res;
        
    }
}