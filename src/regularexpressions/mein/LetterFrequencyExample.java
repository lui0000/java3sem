package regularexpressions.mein;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LetterFrequencyExample {

    public static void main(String[] args) {
        // Sample text
        String text = "Заковряшин Николай Михайлович";

        // Call the function to build letter frequency
        Map<Character, Integer> letterFrequency = buildLetterFrequency(text);

        // Display the results
        System.out.println("Letter frequencies:");
        for (Map.Entry<Character, Integer> entry : letterFrequency.entrySet()) {
            char letter = entry.getKey();
            int frequency = entry.getValue();
            System.out.println(letter + ": " + frequency);
        }
    }

    public static Map<Character, Integer> buildLetterFrequency(String text) {
        Map<Character, Integer> letterFrequency = new HashMap<>();
        String regex = "[а-яА-Яa-zA-Z]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            char letter = matcher.group().toLowerCase().charAt(0);
            letterFrequency.put(letter, letterFrequency.getOrDefault(letter, 0) + 1);
        }
        return letterFrequency;
    }
}
