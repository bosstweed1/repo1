//Chapter 3 Exercise 3 Written By Andrew Beers 5/3/12

#include <iostream>
using namespace std; // include input/output stream

//conversions
const int SecToDeg =60*60;	
const int MinToDeg =60;

int main()
{
	double degree,min,sec;
	double lat,min_component, sec_component;
	
	cout << "Please enter the latitude in degree, minutes, and seconds components:\nEnter Degree Component: ";
	cin >> degree;
	cout << "Enter Minute Component: ";
	cin >> min;
	cout << "Enter Second Component: ";
	cin >> sec;
	min_component = min/MinToDeg;
	sec_component = sec/SecToDeg;
	lat = degree + min_component + sec_component;
	cout << degree << " degrees, " << min << " minutes, " << sec << " seconds = " << lat << " degrees \n";
	
	
	
}


