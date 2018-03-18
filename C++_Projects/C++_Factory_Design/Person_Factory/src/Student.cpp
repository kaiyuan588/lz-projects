/*
 * Student.cpp
 *
 *  Created on: Feb 11, 2018
 *      Author: Ruby
 */

#include "Student.h"
#include <iostream>
using namespace std;
namespace edu {
namespace neu {
namespace csye6205 {

Student::Student(double gpa, string name, int age) : Person(age, name), gpa(gpa) {
	// TODO Auto-generated constructor stub

}

void Student::show(){
	cout<< "My name is " + name + ". My age is " + to_string(age) + ". My gpa is " + to_string(gpa) + "." << endl;
}

Student::~Student() {
	// TODO Auto-generated destructor stub

}

} /* namespace csye6205 */
} /* namespace neu */
} /* namespace edu */
