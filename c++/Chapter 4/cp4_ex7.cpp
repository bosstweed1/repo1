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
	string company;
	float d,w;
	
	cout << "Enter the name of the pizza company: ";
	getline(cin,company);
	cout << "Enter the diameter of the pizza: ";
	cin >> d;
	cout << "Enter the weight of the pizza: ";
	cin >> w;

	
	//create pizza structure
	Pizza data =
	{
		company,d,w
	};
	
	cout << "The pizza company is " << data.name << endl;
	cout << "The diameter of the pizza is " << data.diameter << endl;
	cout << "The weight of the pizza is " << data.weight << endl;
}