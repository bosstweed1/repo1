//Chapter 4 Exercise 4 Written By Andrew Beers 5/3/12

#include <iostream>
#include <string>

using namespace std;

int main()
{
	string first,last,together;
	
	cout << "Enter your first name: ";
	getline(cin,first);
	cout << "Enter your last name: ";
	getline(cin,last);
	
	together = last +", " + first;
	
	cout << "Here's the information in a single string: " << together << endl;
	
}