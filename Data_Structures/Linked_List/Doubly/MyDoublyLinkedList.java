package Data_Structures.Linked_List.Doubly;

public class MyDoublyLinkedList {
    private MyDoublyLinkedNode head;
    private MyDoublyLinkedNode tail;
    int length;

    public MyDoublyLinkedList(int value){
        head = new MyDoublyLinkedNode(value);
        tail = head;
        length = 1;
    }

    public void printList(){
        if(head==null){
            return ;
        }
        MyDoublyLinkedNode curNode = head;
        while(curNode!=null){
            System.out.print(curNode.getValue() + "->");
            curNode = curNode.getNext();
        }
    }

    public void printReverseList(){
      if(head==null){
        return;
      }
      MyDoublyLinkedNode curNode = tail;
      while(curNode!=null){
        System.out.print("<-" + curNode.getValue());
        curNode = curNode.getPrev();
      }
    }

    public void prepend(int value){
        MyDoublyLinkedNode newNode = new MyDoublyLinkedNode(value, head, null);
        head.setPrev(newNode);
        head = newNode;
        length ++;
    }

    public void append(int value){
        MyDoublyLinkedNode newNode = new MyDoublyLinkedNode(value, null, tail);
        tail.setNext(newNode);
        tail = newNode;
        length ++;
    }

    public MyDoublyLinkedNode traverseToIndex(int index) {
        index = wrapIndex(index);
        MyDoublyLinkedNode currentNode = head;
        for (int i = 0; i < index; i++) {
          currentNode = currentNode.getNext();
        }
        return currentNode;
      }
    
    private int wrapIndex(int index) { //Used for wrapping the given index to make sure it's valid
        return Math.max(Math.min(index, length - 1), 0);
      }

    public void insert(int index, int value) {
        index = wrapIndex(index);
        if (index == 0) {
          prepend(value);
          return;
        }
    
        if (index == length - 1) {
          append(value);
          return;
        }
    
        MyDoublyLinkedNode leader = traverseToIndex(index - 1);
        MyDoublyLinkedNode follower = leader.getNext();
    
        MyDoublyLinkedNode newNode = new MyDoublyLinkedNode(value, follower, leader);
        leader.setNext(newNode);
        follower.setPrev(newNode);
        length++;
      }

      public void remove(int index){
        index = wrapIndex(index);
        if(index == 0){
          head = head.getNext();
          head.setPrev(null);
          length--;
          return;
        }
        if(index == length-1){
          tail = (tail.getPrev());
          tail.setNext(null);
          length--;
          return;
        }
        MyDoublyLinkedNode leader = traverseToIndex(index - 1);
        MyDoublyLinkedNode follower = leader.getNext().getNext();
        leader.setNext(follower);
        follower.setPrev(leader);
        length--;
      }

    public static void main(String []arg){
        MyDoublyLinkedList list = new MyDoublyLinkedList(5);
        list.append(6);
        list.append(7);
        list.prepend(3);
        list.insert(2, 2);
        
        list.remove(4);
        list.printList();
        System.out.println();
    }
}
