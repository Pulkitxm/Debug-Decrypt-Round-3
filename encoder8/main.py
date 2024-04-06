def decode_string(mapping, encoded_result):
    decoded_str = ""
    while encoded_result > 0:
        index = encoded_result % 5
        for vowel, num in mapping.items():
            if num == index:
                decoded_str = vowel + decoded_str
                break
        encoded_result //= 5
    
    # Return the decoded string
    return decoded_str
    
vowel_mapping = {'a': 0, 'e': 1, 'i': 2, 'o': 3, 'u': 4}

# Example encoded result
number = int(input())

# Decode the encoded result using the provided mapping
decoded_result = decode_string(vowel_mapping, number)
print(decoded_result)