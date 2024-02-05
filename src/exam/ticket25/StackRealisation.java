package exam.ticket25;

import java.util.LinkedList;

class StackRealisation <T> implements StackFunctions{
    private LinkedList<T> list = new LinkedList();

    @Override
    public void push( Object element) {
        list.addFirst((T) element);
    }

    @Override
    public Object pop() {
        if(list.isEmpty()){
            throw new IllegalStateException("stack is empty");
        }

        return list.removeFirst();
    }

    @Override
    public Object peek() {
        if(list.isEmpty()){
            throw new IllegalStateException("stack is empty");
        }
        return list.getFirst();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }

    public void printStack(){
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.getFirst() + " " );
        }
    }
}
