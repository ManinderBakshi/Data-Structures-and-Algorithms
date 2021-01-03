package Data_Structures.Queues.UsingLinkedList;

import java.util.EmptyStackException;

public class MyQueue {
    
    private MySinglyLinkedNode front;
    private MySinglyLinkedNode rear;
    private int length;
    
    public MyQueue(){
        this.front = null;
        this.rear = null;
        length = 0;
    }

    public int peak(){
        if(front==null){
            throw new EmptyStackException();
        }
        return front.getValue();
    }

    public void enqueue(int value){
        MySinglyLinkedNode node = new MySinglyLinkedNode(value);

        if(length==0){
            front = node;
        }
        else {
            rear.setNext(node);   
        }
        rear = node;
        length++;
    }

    public int dequeue(){
        if(length==0){
            throw new EmptyStackException();
        }
        else{
            MySinglyLinkedNode temp = front;
            front = front.getNext();
            length--;
            return temp.getValue();
        }
    }

    public void print(){
        MySinglyLinkedNode temp = front;
        while(temp!=null){
            System.out.print(temp.getValue()+"->");
            temp = temp.getNext();
        }
    }

    public static void main(String[] args){
        MyQueue q = new MyQueue();
        q.enqueue(5);
        q.enqueue(4);
        q.enqueue(3);
        q.print();
        q.dequeue();
        q.print();
    }
}
