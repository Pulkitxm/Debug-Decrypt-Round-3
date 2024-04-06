#include <iostream>
#include <unordered_map>
#include <string>
#include <vector>

std::unordered_map<char, int> dic = {};

std::unordered_map<int, char> reverse_dic;

std::string KJHfasfkasef(const std::string& input_string, const std::unordered_map<char, int>& char_to_num_dict) {
    std::string encoded_string;
    for (char c : input_string) {
        encoded_string += std::to_string(char_to_num_dict.at(c));
        encoded_string += '0';
    }
    
    if (encoded_string.empty()) {
        encoded_string += "010";
    }
    return encoded_string;
}

std::vector<char> aiudbashfbkwefb(const std::string& char_string) {
    std::vector<char> new_char_array;
    for (char c : char_string) {
        new_char_array.push_back(c);
        new_char_array.push_back('#');
    }
    return new_char_array;
}

std::string oishfusfhujawfni(const std::vector<char>& char_array) {
    std::string char_string;
    for (char c : char_array) {
        char_string += c;
    }
    return char_string;
}

int main() {
    initialize_reverse_dic();
    
    std::string chars;
    std::cin >> chars;
    
    std::vector<char> chars_array_new = aiudbashfbkwefb(chars);
    std::string chars_string = oishfusfhujawfni(chars_array_new);
    std::cout << chars_string << std::endl;
    
    std::string encoded_string = KJHfasfkasef(chars_string, dic);
    std::cout << encoded_string << std::endl;
    return 0;
}