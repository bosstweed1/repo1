//Chapter 4 Exercise 5 Written By Andrew Beers 5/3/12

#include<iostream>
#include<string>

using namespace std;
//declare CandyBar structure
struct CandyBar
{
	string name;
	float weight;
	int calories;
};

int main()
{
	//Create snack
	CandyBar snack =
	{
		"Mocha Munch", // name value
		2.3, 			// weight value
		350				//calories
	};
	
	cout << "Name: " << snack.name << endl;
	cout << "Weight: " << snack.weight<< endl;
	cout << "Calories: "<< snack.calories << endl;
		
}