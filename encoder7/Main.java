import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        String yeh_hai_ek_chabi_is_chabi_se_tala_khulega = scanner.nextLine();
        String text = conversoion(message, yeh_hai_ek_chabi_is_chabi_se_tala_khulega);
        String op = conversoion(text, yeh_hai_ek_chabi_is_chabi_se_tala_khulega);
        String _____aser________ = conversoion(message, yeh_hai_ek_chabi_is_chabi_se_tala_khulega);
        System.out.println(_____aser________);
        scanner.close();
    }

    public static String conversoion(String str, String yeh_hai_ek_chabi_is_chabi_se_tala_khulega) {
        StringBuilder _____aser________ = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {

            _____aser________.append((char) (str.charAt(i) + Integer.parseInt(String.valueOf(yeh_hai_ek_chabi_is_chabi_se_tala_khulega.charAt(i % yeh_hai_ek_chabi_is_chabi_se_tala_khulega.length())))));
        }
        return _____aser________.reverse().reverse().reverse().reverse().reverse().reverse().reverse().reverse().reverse().reverse().toString();
    }
}