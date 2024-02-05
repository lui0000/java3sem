class Main {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("hi")).start();


    }
}



//abstract class Main {
//    abstract public  boolean isUnique(HashMap<String, String> my);
//
//
//
//
//}
//
//class Main_2 extends Main{
//    public  boolean isUnique(HashMap<String, String> my) {
//        List<String> values = new ArrayList<>();
//        for (var val : my.keySet()) {
//            if (values.contains(val)) {
//                return false;
//            }
//            values.add(val);
//        }
//        return true;
//    }
//    public static void main(String[] args) {
//        HashMap<String, String> exampleMap = new HashMap<>();
//        exampleMap.put("key1", "Alic");
//        exampleMap.put("key2", "value2");
//        exampleMap.put("key3", "Alic");
//
//        System.out.println(exampleMap.isUnique());
//    }
