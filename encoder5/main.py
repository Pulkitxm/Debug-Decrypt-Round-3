def decode_code_________________________________________________________________________________________________________________(text):
    this_is_the_text_that_you_will_put_in_the_encoder_oops_the_decoder_sorry_so_that_you_can_get_something_for_blind_people_but_since_you_r_giving_this_contest_you_are_prolly_not_blind_right = ''
    for char in text.upper():
        temp = ""
        if char not in yeh_koi_aisi_cheez_hai_jisse_tum_yeh_question_solve_kar_payoge__________________________________________________________________:
            # this char is not in the dictonary
            temp += char
            temp += temp
        if char in yeh_koi_aisi_cheez_hai_jisse_tum_yeh_question_solve_kar_payoge__________________________________________________________________:
            this_is_the_text_that_you_will_put_in_the_encoder_oops_the_decoder_sorry_so_that_you_can_get_something_for_blind_people_but_since_you_r_giving_this_contest_you_are_prolly_not_blind_right += yeh_koi_aisi_cheez_hai_jisse_tum_yeh_question_solve_kar_payoge__________________________________________________________________[char] + ' '
        else:
            this_is_the_text_that_you_will_put_in_the_encoder_oops_the_decoder_sorry_so_that_you_can_get_something_for_blind_people_but_since_you_r_giving_this_contest_you_are_prolly_not_blind_right += ' '
    return this_is_the_text_that_you_will_put_in_the_encoder_oops_the_decoder_sorry_so_that_you_can_get_something_for_blind_people_but_since_you_r_giving_this_contest_you_are_prolly_not_blind_right.strip()

text = input()
encoded_text = decode_code_________________________________________________________________________________________________________________(text)
print(encoded_text)
