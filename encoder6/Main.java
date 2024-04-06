import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String whisperedIdeas = scanner.nextLine().toUpperCase();
        String secretTune = scanner.nextLine().toUpperCase();
        String hiddenWhispers = scrambleThoughts(whisperedIdeas, extendTune(secretTune, whisperedIdeas.length()));
        System.out.println(hiddenWhispers);
        scanner.close();
    }
    public static char[][] generateEncryptionGrid() {
        char[][] grid = new char[26][26];
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                grid[i][j] = (char) ((i + j) % 26 + 65);
            }
        }
        return grid;
    }
    public static String scrambleThoughts(String ideas, String extendedTune) {
        char[][] grid = generateEncryptionGrid();
        StringBuilder hiddenIdeas = new StringBuilder();
        for (int i = 0; i < ideas.length(); i++) {
            if (Character.isAlphabetic(ideas.charAt(i))) {
                int noteIndex = i % extendedTune.length();
                hiddenIdeas.append(grid[extendedTune.charAt(noteIndex) - 65][ideas.charAt(i) - 65]);
            } else {
                hiddenIdeas.append(ideas.charAt(i));
            }
        }
        return hiddenIdeas.toString();
    }
    public static String extendTune(String melody, int ideaLength) {
        StringBuilder extendedMelody = new StringBuilder(melody);
        while (extendedMelody.length() < ideaLength) {
            extendedMelody.append(melody);
        }
        return extendedMelody.substring(0, ideaLength);
    }
}
