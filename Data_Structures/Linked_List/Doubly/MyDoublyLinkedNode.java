package Data_Structures.Linked_List.Doubly;

public class MyDoublyLinkedNode {

    private int value;
    private MyDoublyLinkedNode next;
    private MyDoublyLinkedNode previous;

    public MyDoublyLinkedNode(int value){
        this.value = value;
        this.next = null;
        this.previous = null;
    }

    public MyDoublyLinkedNode(int value, MyDoublyLinkedNode next, MyDoublyLinkedNode prev){
        this.value = value;
        this.next = next;
        this.previous = prev;
    }

    public int getValue(){
        return value;
    }

    public void setValue(int value){
        this.value = value;
    }

    public MyDoublyLinkedNode getNext(){
        return next;
    }

    public void setNext(MyDoublyLinkedNode next){
        this.next = next;
    }

    public MyDoublyLinkedNode getPrev(){
        return previous;
    }

    public void setPrev(MyDoublyLinkedNode prev){
        this.previous = prev;
    }
    
}
