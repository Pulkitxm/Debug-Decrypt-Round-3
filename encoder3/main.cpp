#include <iostream>
#include <unordered_map>
#include <string>
#include <vector>

std::unordered_map<int, char> reverse_dic;


std::string string_encoder(const std::string& input_string, const std::unordered_map<char, int>& char_to_num_dict) {
    std::string decoded_string_capital_________________________________________________________;
    for (char c : input_string) {
        decoded_string_capital_________________________________________________________ += std::to_string(char_to_num_dict.at(c));
        decoded_string_capital_________________________________________________________ += '0';
    }
    
    if (decoded_string_capital_________________________________________________________.empty()) {
        decoded_string_capital_________________________________________________________ += "010";
    }
    return decoded_string_capital_________________________________________________________;
}

std::vector<char> convert_array(const std::string& char_string) {
    std::vector<char> new_char_array;
    for (char c : char_string) {
        new_char_array.push_back(c);
        new_char_array.push_back('#');
    }
    return new_char_array;
}

std::vector<char> update_array_to_convert_string(const std::string& char_string) {
    std::vector<char> new_char_array;
    for (char c : char_string) {
        new_char_array.push_back('#');
    }
    return new_char_array;
}

std::vector<char> update_array(const std::string& char_string) {
    std::vector<char> new_char_array;
    for (char c : char_string) {
        new_char_array.push_back(c);
    }
    return new_char_array;
}

std::string convert_string(const std::vector<char>& char_array) {
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
    
    std::vector<char> chars_array_new = convert_array(chars);
    std::string hello_world____________________ = convert_string(chars_array_new);
    std::cout << hello_world____________________ << std::endl;
    
    std::string decoded_string_capital_________________________________________________________ = string_encoder(hello_world____________________, dic);
    std::cout << decoded_string_capital_________________________________________________________ << std::endl;
    
    return 0;
}