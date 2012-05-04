//Chapter 4 Exercise 1 Written By Andrew Beers 5/3/12

#include <iostream>
using namespace std; //include input/output stream
const int size = 20;
char first[size];
char last[size];
char grade,realgrade;
int age;
int main()
{
	
	//input information
	cout << "What is your first name? ";
	cin >> first;
	cout << "What is your last name? ";
	cin >> last;
	cout << "What letter grade do you deserve? ";
	cin >> grade;
	cout << "What is your age? ";
	cin >> age;
	
	//grade conversion
	realgrade = grade +1;
	
	//output information
	cout << "Name: " << last << ", " << first << endl;
	cout << "Grade: " << realgrade << endl;
	cout << "Age: " << age << endl;
}
		
	