package linkedlist;

import lombok.Getter;

@Getter
public class LinkedList {
    private ListNode head;
    private ListNode tail;
    private int size = 0;

    @Getter
    class ListNode{
        int data;
        ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data){
        ListNode node = new ListNode(data);
        if(head == null){
            head = node;
            tail = node;
        }else{
            ListNode tmp = head;
            node.next = tmp;
            head = node;
        }
        size++;
    }

    public ListNode get(int index){
        ListNode findNode = head;
        for (int i = 0; i < index; i++) {
             findNode = findNode.next;
        }
        return findNode;
    }

    public void addAt(int index, int data){
        ListNode insertNode = new ListNode(data);
        if(size == 0){
            addFirst(data);
        }else{
            get(index - 1).next = insertNode;
            insertNode.next = get(index);
        }
    }

    public void remove(int index){
        get(index - 1).next = get(index + 1);
        get(index).next = null;
    }

    public boolean contains(int data){
        boolean check =false;
        for (int i = 0; i < size; i++) {
             if(head == null){
                 return check;
             }else if(head.data == data){
                 check = true;
             }
             head = head.next;

        }
        return check;
    }
}
