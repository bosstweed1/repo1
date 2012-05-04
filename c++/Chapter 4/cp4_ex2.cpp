//Chapter 4 Exercise 2 Written By Andrew Beers 5/3/12

#include <iostream>
#include <string>	//include string class
using namespace std; //include input/output stream


// using the string class
int main()
{
	string name,dessert;
	
	cout << "Enter your name: ";
	getline(cin,name);
	cout << "Enter your favorite dessert: ";
	getline(cin,dessert);
	
	cout << "I have some delicious " << dessert << " for you, " << name << endl;

}