//Chapter 4 Exercise 7 Written By Andrew Beers 5/3/12

#include <iostream>
#include <string>
using namespace std;

struct Pizza
{
	string name;
	float diameter;
	float weight;
};

int main()
{
	Pizza data;
	string company;
	float d,w;
	
	cout << "Enter the diameter of the pizza: ";
	cin >> d;
	cout << "Enter the name of the pizza company: ";
	getline(cin,company);
	cout << "Enter the weight of the pizza: ";
	cin >> w;
	
	data.name = company;
	data.diameter = d;
	data.weight = w;
	
	Pizza *demo = &data;
	new(demo) Pizza;
	
	
	
	cout << "The pizza company is " << data.name << endl;
	cout << "The diameter of the pizza is " << data.diameter << endl;
	cout << "The weight of the pizza is " << data.weight << endl;
}




//******This doesn't completely function, working out the kinks with the use of new and pointer syntax, have example 7 working fine
