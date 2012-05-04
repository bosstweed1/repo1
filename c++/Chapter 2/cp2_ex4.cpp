//Chapter 2 Exercise 4 Written By Andrew Beers 5/2/12

#include <iostream>
using namespace std; //include input/output stream

double convert(double);

int main()
{
	double temp,newtemp;
	
	cout << "Please enter a Celsius value: ";
	cin >> temp;
	newtemp = convert(temp);
	cout << temp << " degrees Celsius is " << newtemp << " degrees Fahrenheit.\n";
	
}

//converts degrees celsius to fahrenheit
double convert(double a)
{
	return(1.8*a + 32);
}