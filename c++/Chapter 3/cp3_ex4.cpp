//Chapter 3 Exercise 4 Written By Andrew Beers 5/3/12

#include <iostream>
using namespace std; //include input/output stream

const int DayToSec = 24*60*60;
const int HourToSec= 60*60;
const int MinToSec = 60;

int main()
{
	int seconds, min, days,sec;
	
	cout << "Enter the number of seconds: ";
	cin >> seconds;
	
	//conversions
	days = seconds/DayToSec;
	min = seconds%HourToSec/60;
	sec = seconds%MinToSec;
	
	cout << seconds << " seconds = " << days << " days, " << min << " minutes, " << sec << " seconds.\n";
	
}
	