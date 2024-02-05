package regularexpressions.RegularExpressions;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegularExpressions {

    public static void main(String[] args) {
//        System.out.println("№1");
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a line of text: ");
//        String inputLine = scanner.nextLine();
//        //fe: [\\s,:-]+
//        String regex = "[\\s,:-]+";
//        // String input = "Hello,world - Java:Programming";
//        String[] elements = inputLine.split("[\\s,:-]+");
//        for (String element : elements) {
//            System.out.println(element);
        // Пример с массивом строк
//
//        }
//        scanner.close();
        System.out.println("№2");
        String correct = "abcdefghijklmnopqrstuv18340";
        String incorrect = "abcdefghijklmnoasdfasdpqrstuv18340";
        //^abcdefghijklmnopqrstuv\\d{5}$ или
        Pattern p = Pattern.compile("(abcdefghijklmnopqrstuv)\\d{5}");
        // в переменной m хранится объект, класса Matcher
        Matcher m = p.matcher(correct);
        Matcher mt = p.matcher(incorrect);
        // проверяем на соответствие
        System.out.println(m.matches());
        System.out.println(mt.matches());
        System.out.println("№3");
        String PricesInDifferentCurrencies = "25.98 USD 14 RUВ 1.5 EU 44 ERR 66 RUS 8 US";
        Pattern pt = Pattern.compile("\\d+\\.\\d+\\s(USD|RUВ|EU)");
        Pattern pt1 = Pattern.compile("[^.\\d]\\d+\\s(USD|RUВ|EU)");
        Matcher mat = pt.matcher(PricesInDifferentCurrencies);
        Matcher mat1 = pt1.matcher(PricesInDifferentCurrencies);
        while (mat.find()) {
            System.out.println(mat.group());

        }
        while (mat1.find()) {
            System.out.println(mat1.group());
        }
        System.out.println("№4");
        String input = "( 1 + 8 ) - 9 / 4 - 6 / 5 - 2 * 9";
        Pattern pattern = Pattern.compile("\\+\\s*(\\d+)|\\b(\\d+)");

        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            if (matcher.group(1) != null) {
                System.out.println("Found digit with '+' sign: " + matcher.group(1));
            } else {
                System.out.println("Found digit without '+' sign: " + matcher.group(2));
            }
        }
        System.out.println("№5");
        // dd/mm/yyyy. Начиная с 1900 года до 9999 года
        String years = "29/02/2000, 30/04/2003, 01/01/2003, 01/01/1903, 30-04-2003, 1/1/1899, 32/04/1900, 31/01/1800, 31/14/2001, 11/04/2003";
        Pattern pattern2 = Pattern.compile("(0[1-9]|[12]\\d|3[01])/(0[1-9]|1[0-2])/(19\\d{2}|[2-9]\\d{3})");
        Matcher matcher2 = pattern2.matcher(years);
        while (matcher2.find()) {
                System.out.println("correct form: " + matcher2.group());
            }
        System.out.println("№6");
        String email = "user@example.com, @my.ru, user@@example.com, user@example.ru";
        Pattern patternEmail = Pattern.compile("\\w+@\\w+.(com|ru)");
        Matcher matcherEmail = patternEmail.matcher(email);
        while (matcherEmail.find()) {
            System.out.println("correct form: " + matcherEmail.group());
        }
        System.out.println("№7");
//        String password = " F032_Password TrySpy1 smart_pass A007";
//        Pattern patternPassword = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[_!\\?])[A-Za-z\\d_!\\?]{8,}$");
//        Matcher matcherPassword = patternPassword.matcher(password);
//        "F032_Password TrySpy1 smart_pass A007"
        String password = "F032_Password7";
        Pattern patternPassword = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[_!\\?])[A-Za-z\\d_!\\?]{8,}$");
        Matcher matcherPassword = patternPassword.matcher(password);
//        if (matcherPassword.matches()) {
//            System.out.println("correct form: " + password);
//        } else {
//            System.out.println("incorrect form: " + password);
//        }
        while (matcherPassword.find()) {
            System.out.println("correct form: " + matcherPassword.group());
        }

        System.out.println("№9");
        String text =  "НA small fire occurred in the forest area. Fire brigades went to the scene." +
                " They quickly began putting out the fire. The fire was contained, contained and" +
                " extinguished within a few hours.";
        String[] words = text.split("[\\s.,]+");
        // Создаем мапу для хранения слов и их количества вхождений
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Подсчитываем количество вхождений слов и сохраняем в мапу
        for (String word : words) {
            String normalizedWord = word.toLowerCase(); // Учитываем регистр
            wordCountMap.put(normalizedWord, wordCountMap.getOrDefault(normalizedWord, 0) + 1);
        }

        // Создаем список объектов RegularExpressions
        List<RegularExpressions> regularExpressionsList = new ArrayList<>();

        // Заполняем список объектами
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            regularExpressionsList.add(new RegularExpressions(entry.getKey(), entry.getValue()));
        }

        // Выводим слова и их количество вхождений
        for (RegularExpressions expression : regularExpressionsList) {
            System.out.println("Word: " + expression.getWord() + ", Number of occurrences: " + expression.getEntry());
        }

        }

    private final String Word;
    private final Integer Entry;
    public String getWord()
    {
        return Word;
    }
    public int getEntry() {
        return Entry;
    }
    public RegularExpressions( String Word, Integer Entry) {
        this.Word = Word;
        this.Entry = Entry;
    }




}