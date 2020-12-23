package linkedlist;

public class ListNode {
    private int data;
    public ListNode next;

    public ListNode(int data){
        this.data = data;
        next = null;
    }

    public int getData(){
        return data;
    }
}
