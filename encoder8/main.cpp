#include <iostream>
#include <unordered_map>
#include <string>

std::string decode_string(const std::unordered_map<char, int>& mapping, int encoded_result) {
    std::string decoded_str = "";
    while (encoded_result > 0) {
        int index = encoded_result % 5;
        for (const auto& pair : mapping) {
            if (pair.second == index) {
                decoded_str = pair.first + decoded_str;
                break;
            }
        }
        encoded_result /= 5;
    }
    return decoded_str;
}

int main() {
    std::unordered_map<char, int> vowel_mapping = {{'a', 0}, {'e', 1}, {'i', 2}, {'o', 3}, {'u', 4}};

    // Example encoded result
    int number;
    std::cin >> number;

    // Decode the encoded result using the provided mapping
    std::string decoded_result = decode_string(vowel_mapping, number);
    std::cout << decoded_result << std::endl;

    return 0;
}