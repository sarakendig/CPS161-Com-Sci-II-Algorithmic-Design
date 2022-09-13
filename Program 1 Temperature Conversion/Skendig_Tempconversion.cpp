/* Sara Kendig, 9/6/22, CPS 161
This program converts fahrenheit to celsius */

#include <iostream>
using namespace std;

int main() {

    int farenheit;
    int celsius;

    cout << "Enter the temperature in Farenheit: ";
    cin >> farenheit;

    celsius = 5.0/9.0 * (farenheit-32);
    cout << "The temperature in Farenheit is " << farenheit 
    << " degrees Farenheit.\n" << "The temperature in Celsius is " 
    << celsius << " degrees Celsius." << endl;
    return 0;
}