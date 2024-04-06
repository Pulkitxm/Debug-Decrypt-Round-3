import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final Map<Character, String> yeh_koi_aisi_cheez_hai_jisse_tum_yeh_question_solve_kar_payoge__________________________________________________________________ = new HashMap<>();

    public static String decode_code_________________________________________________________________________________________________________________(String text) {
        StringBuilder this_is_the_text_that_you_will_put_in_the_encoder_oops_the_decoder_sorry_so_that_you_can_get_something_for_blind_people_but_since_you_r_giving_this_contest_you_are_prolly_not_blind_right = new StringBuilder();
        for (char c : text.toUpperCase().toCharArray()) {
            if (yeh_koi_aisi_cheez_hai_jisse_tum_yeh_question_solve_kar_payoge__________________________________________________________________.containsKey(c)) {
                this_is_the_text_that_you_will_put_in_the_encoder_oops_the_decoder_sorry_so_that_you_can_get_something_for_blind_people_but_since_you_r_giving_this_contest_you_are_prolly_not_blind_right.append(yeh_koi_aisi_cheez_hai_jisse_tum_yeh_question_solve_kar_payoge__________________________________________________________________.get(c)).append(" ");
            } else {
                this_is_the_text_that_you_will_put_in_the_encoder_oops_the_decoder_sorry_so_that_you_can_get_something_for_blind_people_but_since_you_r_giving_this_contest_you_are_prolly_not_blind_right.append(" ");
            }
        }
        return this_is_the_text_that_you_will_put_in_the_encoder_oops_the_decoder_sorry_so_that_you_can_get_something_for_blind_people_but_since_you_r_giving_this_contest_you_are_prolly_not_blind_right.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String this_is_the_text_that_you_will_put_in_the_encoder_oops_the_decoder_sorry_so_that_you_can_get_something_for_blind_people_but_since_you_r_giving_this_contest_you_are_prolly_not_blind_right = decode_code_________________________________________________________________________________________________________________(text);
        System.out.println(this_is_the_text_that_you_will_put_in_the_encoder_oops_the_decoder_sorry_so_that_you_can_get_something_for_blind_people_but_since_you_r_giving_this_contest_you_are_prolly_not_blind_right);
        scanner.close();
    }
}