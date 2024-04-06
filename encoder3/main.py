def yeh_karta_hai_string_ko_decode__________________(input_string, yeh_hai_ek_phool_phool_ki_khusbhoo_hoti_hai_achiiii______________):
    decoded_string = ""
    for char in input_string:
        decoded_string += str(yeh_hai_ek_phool_phool_ki_khusbhoo_hoti_hai_achiiii______________.get(char, char))
        decoded_string += '0'
        
    if len(decoded_string) == 0:
        decoded_string += '010'
    return decoded_string

def update_char_array_to_add_hash_______(char_string):
    new_char_array = []
    for i, char in enumerate(char_string):
        new_char_array.append(char)
        new_char_array.append('#')
    return new_char_array

def change_array(char_string):
    new_char_array = []
    for i, char in enumerate(char_string):
        new_char_array.append(char)
    return new_char_array

def update(char_string):
    new_char_array = []
    for i, char in enumerate(char_string):
        new_char_array.append('#')
    return new_char_array

def convert_string(char_array):
    char_string = ""
    for i in char_array:
        char_string += i
    return char_string

yeh_hai_input_which_is_used_to_store_number = input().strip()
yeh_hai_input_which_is_used_to_store_number_array_new = update_char_array_to_add_hash_______(yeh_hai_input_which_is_used_to_store_number)
yeh_hai_input_which_is_used_to_store_number_string = convert_string(yeh_hai_input_which_is_used_to_store_number_array_new)
print(yeh_hai_input_which_is_used_to_store_number_string)
decoded_string = yeh_karta_hai_string_ko_decode__________________(yeh_hai_input_which_is_used_to_store_number_string, dic)
print(decoded_string)
