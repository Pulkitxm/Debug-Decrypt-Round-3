#include <iostream>
#include <string>

using namespace std;

string conversion(const string& str, const string& key) {
    string result;
    for (int i = 0; i < str.length(); i++) {
        int shift = key[i % key.length()] - '0';
        result.push_back(str[i] + shift);
    }
    return result;
}

int main() {
    string message, key;
    
    cout << "Enter the message: ";
    getline(cin, message);

    cout << "Enter the key: ";
    getline(cin, key);

    string text = conversion(message, key);
    string op = conversion(text, key);
    string result = conversion(message, key);

    cout << result << endl;

    return 0;
}
