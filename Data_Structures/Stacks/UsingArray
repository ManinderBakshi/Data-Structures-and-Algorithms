import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class MyStack {

    private List<Integer> array = new ArrayList<>();

    public int peak(){
        if(array.size() == 0){
            throw new EmptyStackException();
        }
        return array.get(array.size()-1);
    }

    public int pop(){
        if(array.size() == 0){
            throw new EmptyStackException();
        }
        return array.remove(array.size()-1);
    }

    public void push(int val){
        array.add(val);
    }

    public void print(){
        for(int value: array){
            System.out.println(value);
        }
    }

public static void main(String[] args){
    MyStack stack=new MyStack();
    stack.push(5);
    stack.push(6);
    stack.push(9);
    stack.print();
}    
}
