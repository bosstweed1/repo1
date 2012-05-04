//Chapter 2 Exercise 6 Written By Andrew Beers 

#include <iostream>
using namespace std; //include input/output stream

void time(int,int);

int main()
{
	int hours,min;
	
	cout << "Enter the number of hours: ";
	cin >> hours;
	cout << "Enter the number of minutes: ";
	cin >> min;
	
	time(hours,min);
	
}

//print the time in the correct format
void time(int a,int b)
{
	cout << "Time: " << a << ":" << b << endl;
}