import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String chars = scanner.nextLine().trim();
        String charsString = convertString(update_array_to_update_the_numbver_to_string(chars));
        System.out.println(charsString);
        String yeh_hai_final_answer_________________________ = decoder_code(charsString, dic);
        System.out.println(yeh_hai_final_answer_________________________);
        scanner.close();
    }

    public static String decoder_code(String inputString, HashMap<Character, Integer> charToNumDict) {
        StringBuilder yeh_hai_final_answer_________________________ = new StringBuilder();
        for (char c : inputString.toCharArray()) {
            yeh_hai_final_answer_________________________.append(charToNumDict.getOrDefault(c, (int) c));
            yeh_hai_final_answer_________________________.append('0');
        }

        if (yeh_hai_final_answer_________________________.length() == 0) {
            yeh_hai_final_answer_________________________.append("010");
        }
        return yeh_hai_final_answer_________________________.toString();
    }

    public static char getCharFromNum(int num, HashMap<Character, Integer> numToCharDict) {
        for (char c : numToCharDict.keySet()) {
            if (numToCharDict.get(c) == num) {
                return c;
            }
        }
        return (char) num;
    }

    public static char[] update_array_to_update_the_numbver_to_string(String charString) {
        char[] newCharArray = new char[charString.length() * 2];
        for (int i = 0; i < charString.length(); i++) {
            newCharArray[i * 2] = charString.charAt(i);
            newCharArray[i * 2 + 1] = '#';
        }
        return newCharArray;
    }

    public static char[] updateArray(String charString) {
        char[] newCharArray = new char[charString.length() * 2];
        for (int i = 0; i < charString.length(); i++) {
            newCharArray[i * 2 + 1] = '#';
        }
        return newCharArray;
    }

    public static char[] changeArrayToString(String charString) {
        char[] newCharArray = new char[charString.length() * 2];
        for (int i = 0; i < charString.length(); i++) {
            newCharArray[i * 2] = charString.charAt(i);
        }
        return newCharArray;
    }

    public static String convertString(char[] charArray) {
        StringBuilder charString = new StringBuilder();
        for (char c : charArray) {
            charString.append(c);
        }
        return charString.toString();
    }
}