//Chapter 3 Exercise 5 Written By Andrew Beers 5/3/12

#include <iostream>
using namespace std; //include input/output stream

int main()
{

	double miles,gallons,mpg;
	
	cout << "Enter the number of miles you have driven: ";
	cin >> miles;
	cout << "Enter the number of gallons you have used: ";
	cin >> gallons;
	
	mpg = miles/gallons;
	
	cout  <<"The gas milage your vehicle gets is "<< mpg << " miles per gallon. \n";
	
}