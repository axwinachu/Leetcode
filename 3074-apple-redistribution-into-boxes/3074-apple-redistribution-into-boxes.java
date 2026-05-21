class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int total=0;
        int boxCount=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for(int i=0;i<apple.length;i++){
            total+=apple[i];
        }
        for(int i=0;i<capacity.length;i++){
            pq.add(capacity[i]);
        }
        while(total>0){
            int box=pq.poll();
            total-=box;
            boxCount++;
        }
        return boxCount;


    }
}