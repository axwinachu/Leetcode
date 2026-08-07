class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> li= new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        li.add(List.of(1));
        q.add(1);
        for(int i=0;i<rowIndex;i++){
          int prev=0;
          int size=q.size();
          List<Integer> curr=new ArrayList<>();
          for(int j=0;j<size;j++){
            int polled=q.poll();
           curr.add(prev+polled);
           prev=polled;
          }
          curr.add(1);
          li.add(curr);
          q.clear();
          for(int data:curr){
             q.offer(data);
          }
        }
        return li.get(rowIndex);
    }
}