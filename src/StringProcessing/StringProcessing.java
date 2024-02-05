package StringProcessing;
import java.lang.String;
import java.io.IOException;

public class StringProcessing {
    public static void StringManipulation(String str1){
        System.out.println("Первый номер\n");
        System.out.println("1. Первоначальная строка: " +str1);
        char lastChar = str1.charAt(str1.length() - 1);
        System.out.println("2. Последний символ строки: " + lastChar);
        boolean str2 = str1.endsWith("!!!");
        System.out.println("3. Заканчивается ли строка подстрокой (!!!): " + str2);
        boolean str3 = str1.startsWith("I like");
        System.out.println("4. Начинается ли строка с подстроки (I like): " + str3);
        boolean str4 = str1.contains("Java");
        System.out.println("5. Содержит ли введенная строка подстроку (Java): " + str4);
        int index = str1.indexOf("Java");
        System.out.println("6. Позиция подстроки Java в строке I like Java начинается с индекса: " + index);
        String str5 = str1.replace("a","o");
        System.out.println("7. Новая строка с заменой символов a на o: " + str5);
        String str6 = str1.toUpperCase();
        System.out.println("8. Преобразование строки к верхнему регистру: " + str6);
        String str7 = str1.toLowerCase();
        System.out.println("9. Преобразование строки к нижнему регистру: " + str7);
        String str8 = str1.substring(0,7);
        String str9 = str1.substring(11,14);
        String str10 = str8 + str9;
        System.out.println("10. Порезанная строка: " + str10);
    }

    private String Surname = "";
    private String MiddleName = "";
    private String Name = "";
    public StringProcessing(String Surname, String Name, String MiddleName) {
        this.Surname = Surname;
        this.Name = Name;
        this.MiddleName = MiddleName;
    }
    public String getFullName() {
        System.out.println("Второй номер\n");
        StringBuilder fullName = new StringBuilder();
        fullName.append(Surname);

        if (Name != null) {
            fullName.append(" ").append(Name.charAt(0)).append(".");
        }

        if (MiddleName != null) {
            fullName.append(" ").append(MiddleName.charAt(0)).append(".");
        }

        return fullName.toString();
    }

        String country = "";
        String region = "";
        String city = "";
        String street = "";
        String house = "";
        String building = "";
        String apartment = "";
    public StringProcessing(String addressString) {
        parseAddress(addressString);
    }

    public String getCountry() {return country;}
    public String getRegion() {return region;}
    public String getCity() {return city;}
    public String getStreet() {return street;}
    public String getHouse() {return house;}
    public String getBuilding() {return building;}
    public String getApartment() {return apartment;}
    private void parseAddress(String addressString) {
        System.out.println("Третий номер\n");
        String[] parts = addressString.split(",");
        if (parts.length >= 7) {
            country = parts[0].trim();
            region = parts[1].trim();
            city = parts[2].trim();
            street = parts[3].trim();
            house = parts[4].trim();
            building = parts[5].trim();
            apartment = parts[6].trim();
        }
    }
//        String[] parts = str11. split("[,\\s]+"); ??
private static void NumberСonverter(String number) {
    try {
        if (number.charAt(0) == '+') {
            String plus = number.substring(0, 2);
            String code = number.substring(2, 5);
            String first = number.substring(5, 8);
            String second = number.substring(8, 10);
            String third = number.substring(10, 12);
            System.out.println(plus + '(' + code + ')' + '-' + first + '-' + second + '-' + third);
        } else if (number.charAt(0) == '8') {
            String plus = number.substring(0, 1);
            String code = number.substring(1, 4);
            String first = number.substring(4, 7);
            String second = number.substring(7, 9);
            String third = number.substring(9, 11);
            System.out.println(plus + '(' + code + ')' + '-' + first + '-' + second + '-' + third);
        }
    } catch (Exception e) {
        System.out.println("Something went wrong, this number incorrect");
    }

}
        private String code;
        private String name;
        private String color;
        private String size;

        public StringProcessing(String code, String name, String color, String size) {
            this.code = code;
            this.name = name;
            this.color = color;
            this.size = size;
        }

        @Override
        public String toString() {
            return "Code: " + code + "\n" +
                    "Name: " + name + "\n" +
                    "Color: " + color + "\n" +
                    "Size: " + size + "\n";
        }



    public static void main(String[] args) throws IOException{
        String str = "I like Java!!!";
        StringManipulation(str);
        StringProcessing person1 = new StringProcessing("Бондаренко", null, null);
        System.out.println(person1.getFullName());
        String str11 = "United States, California, Los Angeles,Hollywood Blvd, 1234, Building A, Apartment 567";
        StringProcessing address = new StringProcessing(str11);

        System.out.println("Страна: " + address.getCountry());
        System.out.println("Регион: " + address.getRegion());
        System.out.println("Город: " + address.getCity());
        System.out.println("Улица: " + address.getStreet());
        System.out.println("Дом: " + address.getHouse());
        System.out.println("Корпус: " + address.getBuilding());
        System.out.println("Квартира: " + address.getApartment());
        String str12 = "+104289652211";
        String str123 = "89175655655";
        String str13 = "89175655";
        System.out.println("Четвертый номер\n");
        NumberСonverter(str12);
        NumberСonverter(str123);
        NumberСonverter(str13);

        String[] shirtsData = {
                "S001,Black Polo Shirt,Black,XL",
                "S002,Black Polo Shirt,Black,L",
                "S003,Blue Polo Shirt,Blue,XL",
                "S004,Blue Polo Shirt,Blue,M",
                "S005,Tan Polo Shirt,Tan,XL",
                "S006,Black T-Shirt,Black,XL",
                "S007,White T-Shirt,White,XL",
                "S008,White T-Shirt,White,L",
                "S009,Green T-Shirt,Green,S",
                "S010,Orange T-Shirt,Orange,S",
                "S011,Maroon Polo Shirt,Maroon,S"
        };

        StringProcessing[] shirts = new  StringProcessing[shirtsData.length];

        for (int i = 0; i < shirtsData.length; i++) {
            String[] shirtInfo = shirtsData[i].split(",");
            if (shirtInfo.length == 4) {
                shirts[i] = new  StringProcessing(shirtInfo[0], shirtInfo[1], shirtInfo[2], shirtInfo[3]);
            }
        }
        System.out.println("Пятый номер\n");
        for ( StringProcessing shirt : shirts) {
            if (shirt != null) {
                System.out.println(shirt.toString());
            }
        }
    }
}


