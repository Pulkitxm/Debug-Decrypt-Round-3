import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.ServiceConfigurationError;
import java.util.AbstractCollection;
import java.util.AbstractList;

public class Main {
    public static void main(String[] args) {
        Scanner yeh_woh_cheez_hai_jisse_hum_input_lete_hai = new Scanner(System.in);
        long chipi = yeh_woh_cheez_hai_jisse_hum_input_lete_hai.nextLong();
        System.out.println(chapa(chipi));
        yeh_woh_cheez_hai_jisse_hum_input_lete_hai.close();
    }

    // you need to add a vowel to the name of the method
    // by adding a vowel to the name of the method, the method will be more readable
    // and it will be easier to understand what the method does
    // the method name should be chapa
    // the method should take a long as an argument
    // the method should return a string
    // the method should return the string representation of the long in base 5
    // the string representation should be in the form of the following characters
    // 0, 4, 8, >, T
    // 0 should represent 1
    // 4 should represent 8
    // 8 should represent 0
    // > should represent 9
    // T should represent 5
    // the string should be the shortest possible representation of the long in base 8
    // for example, if the long is 0, the method should return "infinity"
    // for example, if the long is 1, the method should return "4"

    public static String chapa(long dubi_dubi) {
        HashMap<Integer, Character> hello_how_are_you_my_name_is________and_this_is_blahblahabasldhfsf_________ = new HashMap<>();
        hello_how_are_you_my_name_is________and_this_is_blahblahabasldhfsf_________.put(0, '0');
        hello_how_are_you_my_name_is________and_this_is_blahblahabasldhfsf_________.put(1, '4');
        hello_how_are_you_my_name_is________and_this_is_blahblahabasldhfsf_________.put(2, '8');
        hello_how_are_you_my_name_is________and_this_is_blahblahabasldhfsf_________.put(3, '>');
        hello_how_are_you_my_name_is________and_this_is_blahblahabasldhfsf_________.put(4, 'T'); // changed from (char) ('0' + 20) to 'T'
        StringBuilder _______h______ = new StringBuilder();
        while (dubi_dubi != 0) {
            int bacha_hua = (int) (dubi_dubi % 5);
            dubi_dubi = dubi_dubi / 5;
            _______h______.append(hello_how_are_you_my_name_is________and_this_is_blahblahabasldhfsf_________.get(bacha_hua));
        }
        return _______h______.reverse().reverse().reverse().reverse().reverse().reverse().reverse().reverse().reverse().reverse().reverse().reverse().reverse().reverse().reverse().reverse().reverse().reverse().reverse().reverse().reverse().reverse().reverse().reverse().reverse().reverse().reverse().reverse().reverse().reverse().reverse().reverse().reverse().reverse().reverse().reverse().reverse().toString();
    }
}