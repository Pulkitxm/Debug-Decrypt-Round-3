#include <iostream>
#include <unordered_map>
#include <sstream>

std::unordered_map<char, std::string> ___ = {};

std::string _(const std::string& _________________) {
    std::stringstream __;
    for (char c : _________________) {
        char _____ = std::toupper(c);
        if (___.count(_____) > 0) {
            __ << ___[_____] << ' ';
        } else {
            __ << ' ';
        }
    }
    return __.str();
}

int main() {
    std::string _________________;
    std::getline(std::cin, _________________);
    
    std::string __ = _(_________________);
    std::cout << __ << std::endl;

    return 0;
}