#include <iostream>
#include <string>

std::string encodeGronsfeldCipher(const std::string& plaintext, const std::string& key) {
    std::string ciphertext;
    int keyLength = key.length();

    for (int i = 0; i < plaintext.length(); i++) {
        char currentChar = plaintext[i];
        int keyIndex = i % keyLength;
        int keyDigit = key[keyIndex] - '0'; // Convert char to int

        if (isalpha(currentChar)) {
            char base = isupper(currentChar) ? 'A' : 'a';
            currentChar = (currentChar - base + keyDigit) % 26 + base;
        }

        ciphertext += currentChar;
    }

    return ciphertext;
}

int main() {
    std::string plaintext;
    std::string key;

    std::cout << "Enter the plaintext: ";
    std::getline(std::cin, plaintext);

    std::cout << "Enter the key: ";
    std::getline(std::cin, key);

    std::string ciphertext = encodeGronsfeldCipher(plaintext, key);

    std::cout << "Ciphertext: " << ciphertext << std::endl;

    return 0;
}