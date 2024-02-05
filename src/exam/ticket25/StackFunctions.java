package exam.ticket25;
interface  StackFunctions<T> {
    // Поместить элемент на вершину стека
   void push(T element);
    // Извлечь элемент с вершины стека
    T pop();
    // Поместить элемент на вершину стека
    T peek();
    //проверка на свободность
    boolean isEmpty();
    // получить размер
    int size();
}
