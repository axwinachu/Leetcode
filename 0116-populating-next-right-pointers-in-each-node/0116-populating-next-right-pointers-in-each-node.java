/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};+
*/

class Solution {
    public Node connect(Node root) {
        Node temp=root;
        if(root==null)return root;
        Queue<Node> q=new LinkedList<>();
        q.add(temp);
        while(!q.isEmpty()){
            int size=q.size();
            Node last=null;
            for(int i=0;i<size;i++){
                Node polled=q.poll();
                if(polled!=null && polled.left!=null){
                    q.offer(polled.left);
                }
                if(polled!=null && polled.right!=null){
                    q.offer(polled.right);
                } 
                polled.next=q.peek();
                last=polled; 
            }
            if(last!=null)last.next=null;

        }
        return root;
    }
}