import string

def generate_cipher_table(shift_value):
    table = []
    alphabet = string.ascii_uppercase
    for i in range(26):
        table.append([])
        shifted_alphabet = alphabet[i:] + alphabet[:i]
        for j in range(26):
            table[i].append(shifted_alphabet[j])
    return table
def encode(plaintext, key):
    plaintext = plaintext.upper()
    key = key.upper()
    ciphertext = ""
    table = generate_cipher_table(0)
    for i in range(len(plaintext)):
        if plaintext[i].isalpha():
            key_index = i % len(key)
            row = ord(key[key_index]) - 65
            col = ord(plaintext[i]) - 65
            ciphertext += table[row][col]
        else:
            ciphertext += plaintext[i]
    return ciphertext
message = input()
key = input()
encoded_message = encode(message, key)
print(encoded_message)
