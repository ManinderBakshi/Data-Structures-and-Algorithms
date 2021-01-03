package Data_Structures.Stacks.UsingLinkedList;
import java.util.EmptyStackException;


public class MyStack {
    
    private MySinglyLinkedNode top;
    private MySinglyLinkedNode bottom;
    private int length;

    public MyStack(){
        this.top = null;
        this.bottom = null;
        this.length = 0;
    }

    public int peak(){
        if(top==null){
            throw new EmptyStackException();
        }
        return top.getValue();
    }

    public void push(int value){
        top = new MySinglyLinkedNode(value, this.top);
        if(length==0){
            top=bottom;
        }
        length++;
    }

    public int pop(){
        if(top==null){
            throw new EmptyStackException();
        }
        MySinglyLinkedNode temp = this.top;
        this.top = this.top.getNext();
        length --;
        return temp.getValue();
    }

    public void print(){
        if(top==null){
            throw new EmptyStackException();
        }
        MySinglyLinkedNode temp = top;
        while(temp!=null){
            System.out.print(temp.getValue()+"->");
            temp = (temp.getNext());
        }
    }

    public static void main(String[] args){
        MyStack newStack = new MyStack();
        newStack.push(5);
    }
}
