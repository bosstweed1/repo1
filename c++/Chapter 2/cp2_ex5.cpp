//Chapter 2 Exercise 5 Written By Andrew Beers 5/2/12

#include <iostream>
using namespace std; //include input/output stream

double convert(double);

int main()
{
	double distance,newdistance;
	
	cout << "Enter the number of light years: ";
	cin >> distance;
	
	newdistance = convert(distance);
	
	cout << distance << " light years = " << newdistance << " astronomical units.\n";
	
}

//conversion to astronomical units
double convert (double a)
{
	return(63240*a);
}