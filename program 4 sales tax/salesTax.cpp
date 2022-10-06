// sara kendig 
// this program calculates the sales and local tax in pennsylvania 
// and gives the final sales for the month

#include<iostream>
#include<iomanip>
using namespace std;

int main() {
	float sales;                 // amount to be taxed
	float state_tax, local_tax;  // tax rates
    double stateFinal;           // final state total
    double localFinal;           // final local total
    double finalSales;           // finals sales
    
	
    state_tax = .0307;
    local_tax = .06;
    
     	// gather our input information
	cout << "Please input the total sales for the month" << endl;
	cin >> sales;
	
	// calculate
    stateFinal = state_tax * sales;

    localFinal = local_tax * sales;

    finalSales = stateFinal + localFinal + sales;

	// output the tax amounts
	cout << fixed << showpoint << setprecision(2)
	     << "The total sales for the month is $" << sales << endl;
	cout << "The state tax for the month is $" << stateFinal << endl;
	cout << "The local tax for the month is $" << localFinal << endl;
    cout << "The total sales plus tax for the month is $" << finalSales << endl;
	
	return 0;
}