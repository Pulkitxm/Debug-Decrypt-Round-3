dic = {}
def asjdghaljsdglkjasd(input_string, char_to_num_dict):
    asdhfasdjfksd = ""
    for char in input_string:
        asdhfasdjfksd += str(char_to_num_dict.get(char, char))
        asdhfasdjfksd += '0'
        
    if len(asdhfasdjfksd) == 0:
        asdhfasdjfksd += '010'
    return asdhfasdjfksd

def asdjflksd(char_string):
    stringhaiyeh = []
    for i, char in enumerate(char_string):
        stringhaiyeh.append(char)
        stringhaiyeh.append('#')
    return stringhaiyeh

def convert_string(char_array):
    char_string = ""
    for i in char_array:
        char_string += i
    return char_string

chars = input().strip()
chars_array_new = asdjflksd(chars)
chars_string = convert_string(chars_array_new)
print(chars_string)
asdhfasdjfksd = asjdghaljsdglkjasd(chars_string, dic)
print(asdhfasdjfksd)