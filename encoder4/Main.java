import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Integer> fibonacciSequence(int n) {
        List<Integer> sequence = new ArrayList<>();
        sequence.add(0);
        sequence.add(1);
        while (sequence.size() < n) {
            sequence.add(sequence.get(sequence.size() - 1) + sequence.get(sequence.size() - 2));
        }
        return sequence;
    }

    public static String fibonacciEncoder(String text) {
        String encodedText = "";
        List<Integer> fibonacciNumbers = fibonacciSequence(text.length());
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            int encodedChar = (character + fibonacciNumbers.get(i)) % 128;
            encodedText += (char) encodedChar;
        }
        return encodedText;
    }

    public static String fibonacciDecoder(String encodedText) {
        String decodedText = "";
        List<Integer> fibonacciNumbers = fibonacciSequence(encodedText.length());
        for (int i = 0; i < encodedText.length(); i++) {
            char character = encodedText.charAt(i);
            int decodedChar = (character - fibonacciNumbers.get(i) + 128) % 128;
            decodedText += (char) decodedChar;
        }
        return decodedText;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String encodedText = fibonacciEncoder(text);
        System.out.println("Encoded Text: " + encodedText);
        String decodedText = fibonacciDecoder(encodedText);
        System.out.println("Decoded Text: " + decodedText);
        scanner.close();
    }
}