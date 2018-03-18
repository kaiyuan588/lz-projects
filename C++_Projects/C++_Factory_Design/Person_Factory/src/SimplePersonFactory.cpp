/*
 * PersonFactory.cpp
 *
 *  Created on: Feb 11, 2018
 *      Author: Ruby
 */

#include "SimplePersonFactory.h"

#include "Student.h";
#include "Employee.h";
#include "Person.h";
#include <vector>
namespace edu {
namespace neu {
namespace csye6205 {

PersonFactory::PersonFactory() {
	// TODO Auto-generated constructor stub

}

Person *PersonFactory::getPerson(int criteria) {
	Person *p = (Person*) nullptr;
	switch (criteria) {
	case 0:		// person
		p = new Person(24, "luiny");
		break;
	case 1:		// student
		p = new Student(4.0, "Evon", 24);
		break;
	case 2:		// employee
		p = new Employee(24, "Lai", 400);
		break;
	}
	return (p);
}

void PersonFactory::freePerson(Person *p) {
	delete p;
	return;
}

void PersonFactory::simplefactorydemo(){
	Person *p1 = nullptr;
	Person *p2 = nullptr;
	PersonFactory pFactory = PersonFactory();
	vector<Person *> v = vector<Person *>();
	p1 = pFactory.getPerson(0);
	v.push_back(p1);
	p2 = pFactory.getPerson(1);
	v.push_back(p2);
	for (Person *p : v) {
		p->show();
	}
	pFactory.freePerson(p1);
	pFactory.freePerson(p2);
}

PersonFactory::~PersonFactory() {
	// TODO Auto-generated destructor stub
}

} /* namespace csye6205 */
} /* namespace neu */
} /* namespace edu */
