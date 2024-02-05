package TimeData;
import java.text.ParseException;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws ParseException {
        Date date1 = new Date();
        Date date2 = new Date();
        String name = "John";
        int age = 25;
        double height = 175.5;

        System.out.printf("Имя: %s, Возраст: %d, Рост: %.2f\n", name, age, height);

        Calendar calendar1 = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar1.setTime(date1);
        calendar2.setTime(date2);
        calendar1.add(Calendar.WEEK_OF_MONTH,0);
        calendar2.add(Calendar.DAY_OF_MONTH,1);
//        System.out.println(calendar1.getTime());
//        System.out.println(calendar2.getTime());

        // first task
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("time of receiving the task  -  " + (simpleDateFormat.format(calendar1.getTime())) + "  -  Bondarenko Elizaveta");
        System.out.println("task due time  -  " + (simpleDateFormat.format(calendar2.getTime())) + "  -  Bondarenko Elizaveta");


        //second task Сент. 30/2023/12:00
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd/yyyy/HH:mm");

        try {
            System.out.print("Enter date and time ( dd/MM/yyyy/HH:mm): ");
            String inputDateString = scanner.nextLine();
            // Parse the input string using the defined formatter
            LocalDateTime inputDateTime = LocalDateTime.parse(inputDateString, formatter);
            // Get the current date and time
            LocalDateTime currentDateTime = LocalDateTime.now();
            // Calculate the difference in seconds
            Duration duration = Duration.between(currentDateTime, inputDateTime);
            // Output the parsed date and time
            System.out.println("Parsed date and time: " + formatter.format(inputDateTime));
            System.out.println("Current date and time: " + formatter.format(currentDateTime));
            System.out.println("Time difference in seconds: " + duration.getSeconds());
        } catch (Exception e) {
            System.out.println("Error: Invalid date and time format.");
        } finally {
            scanner.close();
        }
        // fourth task  вставка, удаление, добавление и поиск
        final int N = 100; // Количество элементов
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Замеряем время вставки в ArrayList
        long startTime = System.nanoTime();
        for (int i = 0; i < N; i++) {
            arrayList.add(i);
        }
        long endTime = System.nanoTime();
        long arrayListInsertionTime = endTime - startTime;
        System.out.println("ArrayList filling time: " + arrayListInsertionTime + " nanoseconds");

        // Замеряем время вставки в LinkedList
        startTime = System.nanoTime();
        for (int i = 0; i < N; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        long linkedListInsertionTime = endTime - startTime;
        System.out.println("LinkedList filling time: " + linkedListInsertionTime + " nanoseconds\n");




        // удаление

        // Замеряем время удаления элементов из ArrayList
        long startTime1 = System.nanoTime();
        arrayList.remove(0);

        long endTime1 = System.nanoTime();
        long arrayListInsertionTime1 = endTime1 - startTime1;
        System.out.println("ArrayList deletion time: " + arrayListInsertionTime1 + " nanoseconds");

        // Замеряем время удаления элементов из LinkedList
        startTime = System.nanoTime();
        linkedList.remove(0);

        endTime = System.nanoTime();
        long linkedListInsertionTime1 = endTime1 - startTime1;
        System.out.println("LinkedList deletion time: " + linkedListInsertionTime1 + " nanoseconds\n");


        // добавление


        long startTime2 = System.nanoTime();
        arrayList.add(111);
        long endTime2 = System.nanoTime();
        long arrayListInsertionTime2 = endTime2 - startTime2;
        System.out.println("ArrayList insert time: " + arrayListInsertionTime2 + " nanoseconds");

        startTime2 = System.nanoTime();
        linkedList.add(111);
        endTime2 = System.nanoTime();
        long linkedListInsertionTime2 = endTime2 - startTime2;
        System.out.println("LinkedList insert time: " + linkedListInsertionTime2 + " nanoseconds\n");

        // поиск
        long startTime3 = System.nanoTime();
        arrayList.indexOf(1);
//        System.out.println(arrayList.indexOf(1));
        long endTime3 = System.nanoTime();
        long arrayListInsertionTime3 = endTime3 - startTime3;
        System.out.println("ArrayList search time: " + arrayListInsertionTime3 + " nanoseconds");

        startTime3 = System.nanoTime();
        linkedList.indexOf(1);
//        System.out.println(linkedList.indexOf(1));
        endTime3 = System.nanoTime();
        long linkedListInsertionTime3 = endTime3 - startTime3;
        System.out.println("LinkedList search time: " + linkedListInsertionTime3 + " nanoseconds\n");

    }

}



