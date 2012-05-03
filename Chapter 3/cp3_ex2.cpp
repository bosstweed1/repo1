//Chapter 3 Exercise 2 Written By Andrew Beers 5/3/12

#include <iostream>
using namespace std; //include input/output stream
const int InchToFoot=12;
const double InchToMeter=.0254;
const double PoundsToKg=2.2;

int main()
{
	int feet,inch,pounds;
	double height, weight,bmi,heightsq;
	
	cout << "Please enter your height(In foot/inch form(i.e. 6ft 2in)):\nFeet Component: ";
	cin >> feet;	//input feet component
	cout << "Inch Component: ";
	cin >> inch;	//input inch component
	cout << "Please enter your weight in pounds: ";
	cin >> pounds;	//input weight
	inch = inch + feet*InchToFoot;	//get height in inches
	height = inch*InchToMeter;	//get height in meters
	weight = pounds/PoundsToKg;	//get weight in kilograms
	heightsq = height*height;	//get height squared for bmi conversion
	bmi = weight/heightsq;	// bmi conversion
	
	cout << "Your BMI is " << bmi << endl;
}

	