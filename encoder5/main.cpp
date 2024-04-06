#include <iostream>
#include <unordered_map>
#include <sstream>

std::string decode_code_________________________________________________________________________________________________________________(const std::string& text) {
    std::stringstream this_is_the_text_that_you_will_put_in_the_encoder_oops_the_decoder_sorry_so_that_you_can_get_something_for_blind_people_but_since_you_r_giving_this_contest_you_are_prolly_not_blind_right;
    for (char c : text) {
        char upper_c = std::toupper(c);
        if (yeh_koi_aisi_cheez_hai_jisse_tum_yeh_question_solve_kar_payoge__________________________________________________________________.count(upper_c) > 0) {
            this_is_the_text_that_you_will_put_in_the_encoder_oops_the_decoder_sorry_so_that_you_can_get_something_for_blind_people_but_since_you_r_giving_this_contest_you_are_prolly_not_blind_right << yeh_koi_aisi_cheez_hai_jisse_tum_yeh_question_solve_kar_payoge__________________________________________________________________[upper_c] << ' ';
        } else {
            std::cout << this_is_the_text_that_you_will_put_in_the_encoder_oops_the_decoder_sorry_so_that_you_can_get_something_for_blind_people_but_since_you_r_giving_this_contest_you_are_prolly_not_blind_right << ' ';
        }
    }
    return this_is_the_text_that_you_will_put_in_the_encoder_oops_the_decoder_sorry_so_that_you_can_get_something_for_blind_people_but_since_you_r_giving_this_contest_you_are_prolly_not_blind_right.str();
}

int main() {
    std::string text;
    std::getline(std::cin, text);
    
    std::string this_is_the_text_that_you_will_put_in_the_encoder_oops_the_decoder_sorry_so_that_you_can_get_something_for_blind_people_but_since_you_r_giving_this_contest_you_are_prolly_not_blind_right = decode_code_________________________________________________________________________________________________________________(text);
    std::cout << this_is_the_text_that_you_will_put_in_the_encoder_oops_the_decoder_sorry_so_that_you_can_get_something_for_blind_people_but_since_you_r_giving_this_contest_you_are_prolly_not_blind_right << std::endl;
    
    return 0;
}