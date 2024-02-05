package queue.queue_1_st;

import java.util.Objects;

public class ArrayQueue <T> implements Queue<T>{

    private final Integer maxSize;
    private final T[] queueArray;
    Integer front; // Указатель на начало очереди
    private Integer rear; // Указатель на конец очереди
    private Integer size; // Текущий размер очереди

    public ArrayQueue(Integer maxSize) {
        this.maxSize = maxSize;
        this.queueArray = (T[]) new Object[maxSize]; // создаем массив типа T
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return Objects.equals(size, maxSize);
    }

    public void enqueue(T element) {
        if (!isFull()) {
            queueArray[++rear] = element;
            size++;
        }
    }

    public T dequeue() {
        if (!isEmpty()) {
            T element = queueArray[front];
            front = (front + 1) % maxSize; // Сдвиг указателя front
            size--;
            return element;
        } else {
            throw new IllegalStateException("queue is empty");
        }
    }


    // Возвращает элемент из начала очереди без его удаления
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("queue is empty");
        }
        return queueArray[front];
    }




    public static void main(String[] args) {
        ArrayQueue<Integer> queue = new ArrayQueue<>(5);
        queue.enqueue(15);
        queue.enqueue(1);
        queue.enqueue(5);
        queue.enqueue(2);
        queue.enqueue(25);
        System.out.println("Queue: ");
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println( "Удаленный элемент - " + queue.dequeue());
        System.out.println( queue.peek() );
        System.out.println( "Удаленный элемент - " + queue.dequeue());
        System.out.println( queue.peek() );
        System.out.println( "Удаленный элемент - " + queue.dequeue());
        System.out.println( queue.peek() );
        System.out.println( "Удаленный элемент - " + queue.dequeue());
        System.out.println( queue.peek() );
        System.out.println( "Удаленный элемент - " + queue.dequeue());
        System.out.println( queue.peek() );


    }
}
