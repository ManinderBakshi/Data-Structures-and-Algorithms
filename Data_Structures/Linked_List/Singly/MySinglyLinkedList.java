package Data_Structures.Linked_List.Singly;

public class MySinglyLinkedList {
    
    private MySinglyLinkedNode head;
    private MySinglyLinkedNode tail;
    int length;

    public MySinglyLinkedList (int value){
        head = new MySinglyLinkedNode(value);
        tail = head;
        length = 1;
    }

    public void printList(){
        if(head==null){
            return ; 
        }
        MySinglyLinkedNode curNode = head;
        while (curNode != null){
            System.out.print(curNode.getValue() + "->");
            curNode = curNode.getNext();
        }

    }

    public void prepend(int value){
        head = new MySinglyLinkedNode(value, head);
        length ++;
    }

    public void append(int value){
        MySinglyLinkedNode newNode = new MySinglyLinkedNode(value);
        tail.setNext(newNode);
        tail = newNode;
        length ++;
    }

    private int wrapIndex(int index){
        return Math.max(Math.min(index, length-1), 0);
    }

    private MySinglyLinkedNode traverseToIndex(int index){
        index = wrapIndex(index);
        MySinglyLinkedNode curNode = head;
        for(int i=0; i<index;i++){
            curNode = curNode.getNext();
        }
        return curNode;
    }

    public void insert(int value, int pos){
        pos = wrapIndex(pos);
        
        if (pos == 1){
            this.prepend(value);
        }
        if (pos == length){
            this.append(value);
        }
        MySinglyLinkedNode newNode = new MySinglyLinkedNode(value);
        MySinglyLinkedNode leader = traverseToIndex(pos-1);
        newNode.setNext(leader.getNext());
        leader.setNext(newNode);
        length ++;
    }

    public void remove(int pos){
        pos = wrapIndex(pos);
        if(pos==0){
            head = head.getNext();
            length --;
            return;
        }
        MySinglyLinkedNode leader = traverseToIndex(pos-1);
        MySinglyLinkedNode node = leader.getNext();
        leader.setNext(node.getNext());
        length --;
    }

    public void reverse(){
        MySinglyLinkedNode first = head;
        MySinglyLinkedNode second = head.getNext();
        tail = head;
        for(int i=0;i<length-1;i++){
            MySinglyLinkedNode temp = second.getNext();
            second.setNext(first);
            first = second;
            second = temp;
        }
        head.setNext(null);
        head = first;
    }

    public static void main(String[] args){
        MySinglyLinkedList list = new MySinglyLinkedList(4);
        list.prepend(3);
        list.prepend(2);
        list.append(6);
        list.insert(5, 4);
        list.remove(1);
        list.printList();
        list.reverse();
        System.out.println();
        list.printList();
    }
}
