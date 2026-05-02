class Solution {
    private boolean isValid(List<List<Integer>> adj,boolean[] vis,int source,int dest,int n){
        if(source==dest) return true;
        vis[source]=true;
        for (int neighbor : adj.get(source)) {
            if (!vis[neighbor]) {
                 if (isValid(adj, vis, neighbor, dest,n)) {
                        return true;
                }
            }
        }
        return false;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] data:edges){
            int u=data[0];
            int v=data[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean[] vis=new boolean[n];
        return isValid(adj,vis,source,destination,n);
    }
}