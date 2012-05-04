//Chapter 2 Exercise 2 Written By Andrew Beers 5/2/12

#include<iostream>
using namespace std; //include input/output stream

int main()
{
	int convert;

	cout << "Enter your distance in furlongs: ";	//get distance in furlongs
	cin >> convert;
	cout << "The distance in yards is "<< 220*convert << endl;	//output conversion

}