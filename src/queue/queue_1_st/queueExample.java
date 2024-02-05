package queue.queue_1_st;
import java.util.Queue;
//public class queueExample <T>{
//    private Integer maxSize;
//    private T[] queueArray;
//    private Integer front; // Указатель на начало очереди
//    private Integer rear; // Указатель на конец очереди
//    private Integer size; // Текущий размер очереди
//
//    public queueExample(Integer maxSize) {
//        this.maxSize = maxSize;
//        this.queueArray = (T[]) new Object[maxSize]; // создаем массив типа T
//        this.front = 0;
//        this.rear = -1;
//        this.size = 0;
//    }
//
//    public boolean isEmpty() {
//        return size == 0;
//    }
//
//    public boolean isFull() {
//        return size == maxSize;
//    }
//
//    public void enqueue(T element) {
//        if (!isFull()) {
//            if (rear == maxSize - 1) {
//                rear = -1;
//            }
//            queueArray[++rear] = element;
//            size++;
//        }
//    }
//
//    public T dequeue() {
//        if (!isEmpty()) {
//            T element = queueArray[front++];
//            if (front == maxSize) {
//                front = 0;
//            }
//            size--;
//            return element;
//        } else {
//            throw new IllegalStateException("Очередь пуста.");
//        }
//    }
//
//    public static void main(String[] args) {
//
//
//    }
//}


//import java.util.LinkedList;
//
//public class queueExample<T> {
//    private final LinkedList<T> elements = new LinkedList<>();
//
//    // Добавляет элемент в конец очереди
//    public void enqueue(T item) throws Exception{
////        assert item != null : "item cannot be null";
//        if(item == null) {
//            throw new Exception("item cannot be null");
//        }
//        elements.addLast(item);
//        // Постусловие: элемент item добавлен в конец очереди
//    }
//
//    // Удаляет и возвращает элемент из начала очереди
//    public T dequeue() throws Exception{
//        //assert !isEmpty() : "queue is not empty";
//        if (isEmpty()){
//            throw new Exception("queue is empty");
//        }
//        T item = elements.removeFirst();
//        // Постусловие: элемент, который был удален из начала очереди, возвращен
//        return item;
//    }
//
//    // Возвращает элемент из начала очереди без его удаления
//    public T peek() throws Exception{
//        if( isEmpty()) {
//            throw new Exception("queue is empty");
//        }
//        //assert !isEmpty() : "queue is not empty";
//        return elements.getFirst();
//        // Постусловие: элемент из начала очереди возвращен, сам элемент не был удален
//    }
//
//    // Проверяет, пуста ли очередь
//    public boolean isEmpty() {
//        return elements.isEmpty();
//    }
//
//    public static void main(String[] args) throws Exception {
//        queueExample<String> queue = new queueExample<>();
//        System.out.println("queue");
//        queue.enqueue("Oliver Smith");
//        queue.enqueue("Emma Johnson");
//        queue.enqueue("William Williams");
//        queue.enqueue("Sophia Jones");
//        queue.enqueue("Mac Miller");
//        System.out.print(queue.peek());
//        System.out.print(queue.peek());
//        System.out.print(queue.peek());
//        System.out.print(queue.peek());
//        System.out.println(queue.peek());
//        try{
//        System.out.println("delited item = " + queue.dequeue());
//        System.out.println("delited item = " + queue.dequeue());
//        System.out.println("delited item = " + queue.dequeue());
//        System.out.println("delited item = " + queue.dequeue());
//        System.out.println("delited item = " + queue.dequeue());
//        System.out.println("delited item = " + queue.dequeue());
//        } catch (Exception e) {
//            System.out.println("oh no!");
//        }
//
//
//    }
//
//
//}
