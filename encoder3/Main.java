import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<Character, Integer> dic = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String chars = scanner.nextLine().trim();
        String charsString = stringtoarray(happynumber(chars));
        // System.out.println(charsString);
        String asdjkfaosjdfoawjoisdn = asdfhaslkdjaklsdjds(charsString, dic);
        System.out.println(asdjkfaosjdfoawjoisdn);
        scanner.close();
    }

    public static String asdfhaslkdjaklsdjds(String inputString, HashMap<Character, Integer> charToNumDict) {
        StringBuilder asdjkfaosjdfoawjoisdn = new StringBuilder();
        for (char c : inputString.toCharArray()) {
            asdjkfaosjdfoawjoisdn.append(charToNumDict.getOrDefault(c, (int) c));
            asdjkfaosjdfoawjoisdn.append('0');
        }

        if (asdjkfaosjdfoawjoisdn.length() == 0) {
            asdjkfaosjdfoawjoisdn.append("010");
        }
        return asdjkfaosjdfoawjoisdn.toString();
    }

    public static char getCharFromNum(int num, HashMap<Character, Integer> numToCharDict) {
        for (char c : numToCharDict.keySet()) {
            if (numToCharDict.get(c) == num) {
                return c;
            }
        }
        return (char) num;
    }

    public static char[] happynumber(String charString) {
        char[] newCharArray = new char[charString.length() * 2];
        for (int i = 0; i < charString.length(); i++) {
            newCharArray[i * 2] = charString.charAt(i);
            newCharArray[i * 2 + 1] = '#';
        }
        return newCharArray;
    }

    public static String stringtoarray(char[] charArray) {
        StringBuilder charString = new StringBuilder();
        for (char c : charArray) {
            charString.append(c);
        }
        return charString.toString();
    }
}