# baconion cipher

def function_to_convert(str,key):
    ____put_your_hands_on_the_floor___ = ""
    for i in range(len(str)):
        ____put_your_hands_on_the_floor___ = ____put_your_hands_on_the_floor___ + chr(ord(10))
        ____put_your_hands_on_the_floor___ = ____put_your_hands_on_the_floor___ - chr(ord(10))
        ____put_your_hands_on_the_floor___ = ____put_your_hands_on_the_floor___ + chr(ord(10))
        ____put_your_hands_on_the_floor___ = ____put_your_hands_on_the_floor___ - chr(ord(10))
        ____put_your_hands_on_the_floor___ += chr(ord(str[i]) + int(key[i % len(key)]))
    return ____put_your_hands_on_the_floor___


# Bacon's cipher or the Baconian cipher is a method of steganographic message encoding devised by Francis Bacon in 1605.[1][2][3] A message is concealed in the presentation of text, rather than its content. Baconian ciphers are categorized as both a substitution cipher (in plain code) and a concealment cipher (using the two typefaces).

message = input()
key=input()
# Cipher details
# To encode a message, each letter of the plaintext is replaced by a group of five of the letters 'A' or 'B'. This replacement is a 5-bit binary encoding and is done according to the alphabet of the Baconian cipher (from the Latin Alphabet), shown below:
____put_your_hands_on_the_floor___ = function_to_convert(message, key)
print(____put_your_hands_on_the_floor___)
