//Chapter 3 Exercise 6 Written By Andrew Beers 5/3/12

#include <iostream>
using namespace std; //include input/output stream

const double MilesToKm = .6214;
const double GallonsToLiters = 3.875;

int main()
{
	double mpg,lpkm;
	
	cout << "Enter the gas consumption figure of your vehicle in miles per gallon: ";
	cin >> mpg;
	
	//conversions
	lpkm = 100*GallonsToLiters/(mpg/MilesToKm);
	
	cout << "Your gas consumption is also " << lpkm << " l/100km.\n";
	
}

//*******I get somewhat different answers to this one, my conversion may not be exact***