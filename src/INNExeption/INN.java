package INNExeption;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class INN {


    public static void main(String[] args) throws INNExeption {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Вы физическое - 1 или юридическое лицо - 2: ");
        String x = scanner.nextLine();

        switch (x) {
            case "1" -> {
                System.out.print("Введите ИНН: ");
                String innString = scanner.nextLine();
                try {
                    ChekINN(innString);
                } catch (INNExeption e) {
                    System.out.println("Inn is incorrect");
                }
            }
            case "2" -> {
                System.out.print("Введите ИНН: ");
                String innString1 = scanner.nextLine();
                try {
                    ChekINN1(innString1);
                } catch (INNExeption e) {
                    System.out.println("Inn is incorrect");
                }
            }
        }



        //Long INN = Long.parseLong(innString);
    }

    public static void ChekINN(String str) throws INNExeption {
        Pattern patternINN = Pattern.compile("^\\d{12,}$");
        Matcher matcherINN = patternINN.matcher(str);
//Runtime предоставляет разнообразную информацию о текущем состоянии и выполнении Java-программы
        if (!matcherINN.find()) {
            throw new INNExeption("INN is incorrect", new RuntimeException());
        } else {
            System.out.println("my congratulation, original gangster");
        }

    }
    public static void ChekINN1(String str) throws INNExeption {
        Pattern patternINN = Pattern.compile("^\\d{10,}$");
        Matcher matcherINN = patternINN.matcher(str);

        if (!matcherINN.find()) {
            throw new INNExeption("Inn is incorrect");
        } else {
            System.out.println("my congratulation, original gangster");
        }

    }


}
