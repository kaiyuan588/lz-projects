/*
 * Person.cpp
 *
 *  Created on: Feb 11, 2018
 *      Author: Ruby
 */

#include "Person.h"
#include <iostream>
using namespace std;
namespace edu {
namespace neu {
namespace csye6205 {

Person::Person(int age, string name) : age(age), name(name){
	// TODO Auto-generated constructor stub

}

Person::~Person() {
	// TODO Auto-generated destructor stub
}

void Person::show(){
	cout<< "My name is " + name + ". My age is " + to_string(age) + "." << endl;
}

} /* namespace csye6205 */
} /* namespace neu */
} /* namespace edu */
