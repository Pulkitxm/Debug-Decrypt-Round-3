#include <iostream>
#include <vector>
#include <algorithm>

std::vector<int> hghdbhbdhbhbhb(int n) {
    std::vector<int> ahhsdbhsbhsbfhsf;
    int snnfuabfbsdjfb = 2;

    while (n > 1) {
        while (n % snnfuabfbsdjfb == 0) {
            ahhsdbhsbhsbfhsf.push_back(snnfuabfbsdjfb);
            n /= snnfuabfbsdjfb;
        }
        snnfuabfbsdjfb++;
    }

    return ahhsdbhsbhsbfhsf;
}

void shdfiuwhfiuwr(std::vector<int> arr) {
    for (int i = 0; i < arr.size(); i++) {
        std::cout << arr[i] << " ";
    }
    std::cout << std::endl;
}

int main() {
    std::string s;
    std::getline(std::cin, s);
    std::reverse(s.begin(), s.end());

    std::vector<int> ans;
    std::vector<int> space = {2, 2, 2, 2, 2};

    for (char c : s) {
        if (c == ' ') {
            ans.insert(ans.end(), space.begin(), space.end());
        } else {
            std::vector<int> hghdbhbdhbhbhb_result = hghdbhbdhbhbhb(static_cast<int>(c));
            ans.insert(ans.end(), hghdbhbdhbhbhb_result.begin(), hghdbhbdhbhbhb_result.end());
        }
    }

    std::cout << ans.size() << std::endl;
    shdfiuwhfiuwr(ans);

    return 0;
}