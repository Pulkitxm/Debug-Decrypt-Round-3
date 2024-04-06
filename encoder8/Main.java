import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Character, Integer> vowelMapping = new HashMap<>();
        vowelMapping.put('a', 0);
        vowelMapping.put('e', 1);
        vowelMapping.put('i', 2);
        vowelMapping.put('o', 3);
        vowelMapping.put('u', 4);

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        String decodedResult = decodeString(vowelMapping, number);
        System.out.println(decodedResult);
    }

    public static String decodeString(Map<Character, Integer> mapping, int encodedResult) {
        StringBuilder decodedStr = new StringBuilder();
        while (encodedResult > 0) {
            int index = encodedResult % 5;
            for (Map.Entry<Character, Integer> entry : mapping.entrySet()) {
                if (entry.getValue() == index) {
                    decodedStr.insert(0, entry.getKey());
                    break;
                }
            }
            encodedResult /= 5;
        }
        return decodedStr.toString();
    }
}