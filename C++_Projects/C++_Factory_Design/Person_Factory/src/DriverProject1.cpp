//============================================================================
// Name        : Person_Factory.cpp
// Author      : Ruby
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================


#include "Person.h"
#include <vector>
#include <iostream>

#include "SimplePersonFactory.h"
#include "BasePersonFactory.h"
#include "Student.h"
#include "Employee.h"
using namespace std;
using namespace edu::neu::csye6205;

int main() {
	//1. No Factory design pattern, using class constructor calls.
	Student s(3.5, "Yilin Yuan", 23);
	s.show();
	Employee e(20,"Cheng Feng", 1600);
	e.show();

	//2. No direct calls to class constructors for derived target object instantiation, using Simple Factory pattern.
	PersonFactory::simplefactorydemo();

	//3. No direct calls to class constructors for derived target object instantiation, using GoF Factory pattern.
	BasePersonFactory::basePersonFactoryDemo();

	return 0;
}








//void DesignPatternDemo::useFactoryPattern() {
//	Person *p1 = nullptr;
//	Person *p2 = nullptr;
//	PersonFactory pFactory = PersonFactory();
//	vector<Person *> v = vector<Person *>();
//
//	p1 = pFactory.getPerson(0);
//	v.push_back(p1);
//	p2 = pFactory.getPerson(1);
//	v.push_back(p2);
//
//	for (Person *p : v) {
//		cout << p->speak() << endl;
//	}
//	pFactory.freePerson(p1);
//	pFactory.freePerson(p2);
//
//	return;
//}

