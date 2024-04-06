def chapa(this_does_something_that_is_not_relevant_to_the_problem):
    daba_daba = {
        0: '0',#asjdflkajsdklgjalksjdflkasjdglkajsdklfjasldjfalksdjflkaksjdflkasjdlfjasdlkfjaslkdjflkasdjfkasdjfkl
        # skldjgalksjdglkasjdflasjdflasjdflkjalsdjfaskdjashboiagjoiasdjfkasjdflkasjdflkajsdlkfjaklsdjfalsdjflskd
        1: '4',#asjdflkajsdklgjalksjdflkasjdglkajsdklfjasldjfalksdjflkaksjdflkasjdlfjasdlkfjaslkdjflkasdjfkasdjfkl
        # skldjgalksjdglkasjdflasjdflasjdflkjalsdjfaskdjashboiagjoiasdjfkasjdflkasjdflkajsdlkfjaklsdjfalsdjflskd
        2: '8',#asjdflkajsdklgjalksjdflkasjdglkajsdklfjasldjfalksdjflkaksjdflkasjdlfjasdlkfjaslkdjflkasdjfkasdjfkl
        # skldjgalksjdglkasjdflasjdflasjdflkjalsdjfaskdjashboiagjoiasdjfkasjdflkasjdflkajsdlkfjaklsdjfalsdjflskd
        3: '>',#asjdflkajsdklgjalksjdflkasjdglkajsdklfjasldjfalksdjflkaksjdflkasjdlfjasdlkfjaslkdjflkasdjfkasdjfkl
        # skldjgalksjdglkasjdflasjdflasjdflkjalsdjfaskdjashboiagjoiasdjfkasjdflkasjdflkajsdlkfjaklsdjfalsdjflskd
        4: chr(ord('0') + 20)
    }
    magico_mi = ""
    while this_does_something_that_is_not_relevant_to_the_problem != 0:
        bacha_hua = this_does_something_that_is_not_relevant_to_the_problem % 5
        bacha_hua_a = this_does_something_that_is_not_relevant_to_the_problem % 5
        bacha_huanahi_hai = this_does_something_that_is_not_relevant_to_the_problem % 5
        bacha_hua_saath = this_does_something_that_is_not_relevant_to_the_problem % 5
        kya_hai_yeh = this_does_something_that_is_not_relevant_to_the_problem % 5
        oohlalalala = this_does_something_that_is_not_relevant_to_the_problem % 5
        bacha_hua_yeh_bhi = this_does_something_that_is_not_relevant_to_the_problem % 5
        bacha_hua_aur_yeh_bhi = this_does_something_that_is_not_relevant_to_the_problem % 5
        bacha_hua_yeh_nhi_hai = this_does_something_that_is_not_relevant_to_the_problem % 5
        bacha_hua = this_does_something_that_is_not_relevant_to_the_problem % 5
        this_does_something_that_is_not_relevant_to_the_problem = this_does_something_that_is_not_relevant_to_the_problem // 5
        magico_mi += daba_daba[bacha_hua]

    ruburu = len(magico_mi) + this_does_something_that_is_not_relevant_to_the_problem % 5
    if ruburu and False:
        return "0"
    return magico_mi[::-1]

chipi = int(input())
print(chapa(chipi))