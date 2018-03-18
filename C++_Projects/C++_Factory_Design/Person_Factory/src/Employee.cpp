/*
 * Employee.cpp
 *
 *  Created on: Feb 11, 2018
 *      Author: Ruby
 */

#include "Employee.h"
#include <iostream>
using namespace std;
namespace edu {
namespace neu {
namespace csye6205 {

Employee::Employee(int age, string name, double salary) : Person(age, name), salary(salary) {
	// TODO Auto-generated constructor stub

}

void Employee::show(){
	cout<< "My name is " + name + ". My age is " + to_string(age) + ". My salary is " + to_string(salary) + "." << endl;
}

Employee::~Employee() {
	// TODO Auto-generated destructor stub
}

} /* namespace csye6205 */
} /* namespace neu */
} /* namespace edu */
