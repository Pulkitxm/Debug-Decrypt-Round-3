#include <iostream>
#include <vector>
#include <string>

std::vector<int> fibonacci_sequence(int n) {
    std::vector<int> sequence = {0, 1};
    while (sequence.size() < n) {
        sequence.push_back(sequence[sequence.size() - 1] + sequence[sequence.size() - 2]);
    }
    return sequence;
}

std::string fibonacci_encoder(std::string text) {
    std::string encoded_text = "";
    std::vector<int> fibonacci_numbers = fibonacci_sequence(text.length());
    for (int i = 0; i < text.length(); i++) {
        char encoded_char = char((int(text[i]) + fibonacci_numbers[i]) % 128);
        encoded_text += encoded_char;
    }
    return encoded_text;
}

std::string fibonacci_decoder(std::string encoded_text) {
    std::string decoded_text = "";
    std::vector<int> fibonacci_numbers = fibonacci_sequence(encoded_text.length());
    for (int i = 0; i < encoded_text.length(); i++) {
        char decoded_char = char((int(encoded_text[i]) - fibonacci_numbers[i] + 128) % 128);
        decoded_text += decoded_char;
    }
    return decoded_text;
}

int main() {
    std::string text;
    std::getline(std::cin, text);
    std::string encoded_text = fibonacci_encoder(text);
    std::cout << "Encoded Text: " << encoded_text << std::endl;
    
    std::string decoded_text = fibonacci_decoder(encoded_text);
    std::cout << "Decoded Text: " << decoded_text << std::endl;
    
    return 0;
}