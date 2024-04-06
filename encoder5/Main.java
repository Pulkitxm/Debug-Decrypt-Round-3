import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final Map<Character, String> morseCodeDict = new HashMap<>();

    public static String encodeToMorse(String text) {
        StringBuilder encodedText = new StringBuilder();
        for (char c : text.toUpperCase().toCharArray()) {
            if (morseCodeDict.containsKey(c)) {
                encodedText.append(morseCodeDict.get(c)).append(" ");
            } else {
                encodedText.append(" ");
            }
        }
        return encodedText.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String encodedText = encodeToMorse(text);
        System.out.println("Encoded: " + encodedText);
        scanner.close();
    }
}