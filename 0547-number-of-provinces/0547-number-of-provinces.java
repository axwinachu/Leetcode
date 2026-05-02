class Solution {
    private void dfs(int[][] isConnected,boolean[] vis,int curr,int n){
        for(int i=0;i<n;i++){
            if(isConnected[curr][i]==1 && !vis[i]){
                vis[i]=true;
                dfs(isConnected,vis,i,n);
            }
        }

    }
    public int findCircleNum(int[][] isConnected) {
        int count=0;
        int n=isConnected.length;
        boolean[] vis=new boolean[n];
        for(int i=0;i<n;i++){
            if(!vis[i]){
                count++;
                dfs(isConnected,vis,i,n);
            }
        }
        return count;
    }
}