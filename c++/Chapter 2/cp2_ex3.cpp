//Chapter 2 Exercise 3 Written By Andrew Beers 5/2/12

#include <iostream>
using namespace std; //include input/output stream

void three();
void run();

int main()
{
	three();	// call three
	three();	// call three
	
	run();		// call run
	run();		// call run
	
}

//three function
void three()
{
	cout << "Three blind mice\n";
}

//run function
void run()
{
	cout << "See how they run\n";
}
