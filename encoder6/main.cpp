#include <iostream>
#include <vector>

std::vector<std::vector<char>> generateCipherTable() {
    std::vector<std::vector<char>> table(26, std::vector<char>(26));
    for (int i = 0; i < 26; i++) {
        for (int j = 0; j < 26; j++) {
            table[i][j] = ((i + j) % 26) + 65;
        }
    }
    return table;
}

std::string encoder(const std::string& str, const std::string& key) {
    std::string encoded_str;
    std::vector<std::vector<char>> table = generateCipherTable();
    for (size_t i = 0; i < str.length(); i++) {
        if (isalpha(str[i])) {
            encoded_str += table[toupper(key[i % key.length()]) - 65][toupper(str[i]) - 65];
        } else {
            encoded_str += str[i];
        }
    }
    return encoded_str;
}

int main() {
    std::string string, key;
    std::getline(std::cin, string);
    std::getline(std::cin, key);
    std::string encoded_str = encoder(string, key);
    std::cout << "Encoded string: " << encoded_str << std::endl;
    return 0;
}