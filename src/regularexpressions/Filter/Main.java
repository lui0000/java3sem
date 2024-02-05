package regularexpressions.Filter;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        // Пример с массивом строк
        String[] stringArray = {"Hello123", "123World", "456Test", "789"};

        // Создаем фильтр, который оставляет только строки, содержащие только буквы и цифры
        Filter alphanumericFilter = o -> o.toString().matches("[A-Za-z0-9]+");

        // Применяем фильтр к массиву
        Object[] filteredStrings = filter(stringArray, alphanumericFilter);

        // Выводим результат
        for (Object o : filteredStrings) {
            System.out.println(o);
        }
    }

    public static Object[] filter(Object[] array, Filter filter) {
        List<Object> result = new ArrayList<>();
        for (Object o : array) {
            if (filter.apply(o)) {
                result.add(o);
            }
        }
        return result.toArray();
    }
}
