package queue.queue_1_st;


public interface Queue<T> {
    // Добавляет элемент в конец очереди
    void enqueue(T element);

    // Удаляет и возвращает элемент из начала очереди
    T dequeue();

    // Возвращает элемент из начала очереди без его удаления
    T peek();

    // Проверяет, пуста ли очередь
    boolean isEmpty();

    // Проверяет, полна ли очередь
    boolean isFull();
}
