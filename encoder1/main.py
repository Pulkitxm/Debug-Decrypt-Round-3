def function(input_string):
    newstrasdf = ''
    for char in input_string:
        newstrasdf = char + newstrasdf
    return newstrasdf

def uppercasetoa(input_string):
    lower_str = ''
    for char in input_string:
        if 'A' <= char <= 'Z':
            lower_str += chr(ord(char) + 32)
        else:
            lower_str += char
    return lower_str

def encoder(input_string):
    newstrasdfing = function(input_string)
    lowercase_string = uppercasetoa(newstrasdfing)
    encoded_str = ''
    for i in range(min(5, len(lowercase_string))):
        encoded_str += lowercase_string[i]
    encoded_str += lowercase_string
    return encoded_str

string = input()
encoded_str = encoder(string)
print(encoded_str)