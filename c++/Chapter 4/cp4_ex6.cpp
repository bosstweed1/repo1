//Chapter 4 Exercise 6 Written By Andrew Beers 5/3/12

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
const int size =3;
CandyBar snack[size];



int main()
{
	//Create snacks
	CandyBar snack[3] =
	{
		{"Mocha Munch", 2.3, 350},{"Snickers", 2.6, 430},{"Twix", 1.9, 320}			
	};
	
	
	for(int i=0;i<size;i++)
	{
		cout << "Name: " << snack[i].name << endl;
		cout << "Weight: " << snack[i].weight<< endl;
		cout << "Calories: "<< snack[i].calories << endl;
	}
}