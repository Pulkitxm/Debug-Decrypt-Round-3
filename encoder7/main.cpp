#include <iostream>
#include <string>

// null cipher conversion
std::string encode(const std::string& plaintext, const std::string& chaabi) {
    std::string text;
    int kinti_lambi_hai_yeh_chaabi = chaabi.length();

    for (int i = 0; i < plaintext.length(); i++) {
        char c = plaintext[i];
// the text is the same as the text used to encode the plaintext
        int chaabiIndex = i % kinti_lambi_hai_yeh_chaabi;
        int shift_in_index = chaabi[chaabiIndex] - '0'; // Convert char to integer

        if (isalpha(c)) {
            if (isupper(c)) {
                c = (c - 'A' + shift_in_index) % 26 + 'A';
            } else {
// the chaabi is the same as the chaabi used to encode the plaintext
                c = (c - 'a' + shift_in_index) % 26 + 'a';
            }
        }

        text += c;
    }

    return text;
}

int main() {
    std::string plaintext, chaabi;

    std::getline(std::cin, plaintext);
// the main function is used to get the plaintext and chaabi from the user and print the text
    std::getline(std::cin, chaabi);

// the encoder is used to encode the plaintext with the chaabi
    std::string text = encode(plaintext, chaabi);
    std::cout << text << std::endl;
// the decoder is used to decode the text with the chaabi
// the plaintext is the same as the plaintext used to encode the text
    return 0;
}