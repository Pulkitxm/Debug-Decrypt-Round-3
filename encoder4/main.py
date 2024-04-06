def fibonacci_sequence(n):
    sequence = [0, 1]
    while len(sequence) < n:
        sequence.append(sequence[-1] + sequence[-2])
    return sequence

def fibonacci_encoder(text):
    encoded_text = ''
    fibonacci_numbers = fibonacci_sequence(len(text))
    for i, char in enumerate(text):
        encoded_char = chr((ord(char) + fibonacci_numbers[i]) % 128)
        encoded_text += encoded_char
    return encoded_text

def fibonacci_decoder(encoded_text):
    decoded_text = ''
    fibonacci_numbers = fibonacci_sequence(len(encoded_text))
    for i, char in enumerate(encoded_text):
        decoded_char = chr((ord(char) - fibonacci_numbers[i]) % 128)
        decoded_text += decoded_char
    return decoded_text

def main():
    text = input("Enter the text: ")
    choice = input("Enter 'e' for encoding or 'd' for decoding: ")
    if choice == 'e':
        encoded_text = fibonacci_encoder(text)
        print("Encoded text:", encoded_text)
    elif choice == 'd':
        decoded_text = fibonacci_decoder(text)
        print("Decoded text:", decoded_text)
    else:
        print("Invalid choice!")

if __name__ == "__main__":
    main()