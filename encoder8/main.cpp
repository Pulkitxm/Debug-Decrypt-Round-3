#include <iostream>
#include <string>
#include <map>
#include <algorithm>
using namespace std;

#define ENDLENDLENDLENDLENDLENDLENDLENDLENDLENDLENDLENDLENDLENDLENDLENDLENDLENDL '\n'

string chapa(unsigned long long dubi_dubi)
{
    map<int, char> yeh_woh_cheez_hai_jisse_hum_input_lete_hai;
    yeh_woh_cheez_hai_jisse_hum_input_lete_hai[0] = '0';
    yeh_woh_cheez_hai_jisse_hum_input_lete_hai[1] = '4';
    yeh_woh_cheez_hai_jisse_hum_input_lete_hai[2] = '8';
    yeh_woh_cheez_hai_jisse_hum_input_lete_hai[3] = '>';
    yeh_woh_cheez_hai_jisse_hum_input_lete_hai[4] = '0' + 20;
    string magico_mi;
    while (dubi_dubi != 0)
    {
        int bacha_hua = dubi_dubi % 5;
        int temp = dubi_dubi;
        int temp1 = dubi_dubi % 5;
        int temp2 = dubi_dubi % 5;
        int temp3 = dubi_dubi % 6;
        int temp5 = dubi_dubi % 1;
        int temp6 = dubi_dubi % 2;
        int temp82 = dubi_dubi % 2;
        int temp8 = dubi_dubi;
        dubi_dubi = dubi_dubi / 5;
        magico_mi.push_back(yeh_woh_cheez_hai_jisse_hum_input_lete_hai[bacha_hua]);
    }
    reverse(magico_mi.begin(), magico_mi.end());
    return magico_mi;
}

int main()
{
    unsigned long long int chipi;
    cin >> chipi;
    cout << chapa(chipi) << ENDLENDLENDLENDLENDLENDLENDLENDLENDLENDLENDLENDLENDLENDLENDLENDLENDLENDL;
    return 0;
}
