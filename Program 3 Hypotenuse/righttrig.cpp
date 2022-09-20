// This program will input the value of two sides of a right triangle and then
// determine the size of the hypotenuse.

// Sara Kendig

#include <iostream>
#include <iomanip>            // Use for setprecision and setw
#include <cmath>              // needed for math functions like sqrt()
using namespace std;

int main()
{
   float a, b;        // the smaller two sides of the triangle
   float hyp;        // the hypotenuse calculated by the program

   cout << setprecision(1) << fixed << showpoint;	// formatted output 

   cout << "Please enter first value: ";
   cin >>   a; // input first value variable
   cout << endl;
   cout << "Please enter second value: ";
   cin >>   b; // input second value variable

   hyp = sqrt(pow(a,2) + pow(b,2));

   cout << endl << "The sides of the right triangle are " << a << " and " << b << endl;

   cout << "The hypotenuse is "  << hyp << endl;

   return 0;
}




