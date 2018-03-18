/*
 * StudentFactory.cpp
 *
 *  Created on: Feb 12, 2018
 *      Author: Ruby
 */

#include "StudentFactory.h"
#include "Student.h"
#include <iostream>
namespace edu {
namespace neu {
namespace csye6205 {
using namespace std;
StudentFactory::StudentFactory() {
	// TODO Auto-generated constructor stub

}

void StudentFactory::info(){
	cout<<"This is Student Factory"<<endl;
}

void StudentFactory::create(){
	Student *e1 = new Student(4.0, "Shiying Kong--Student", 21);
	v.push_back(e1);
	Student *e2 = new Student(3.9, "Shiyun Dong --Student", 22);
	v.push_back(e2);
}

void StudentFactory::show(){
	for(Student *e : v){
		e->show();
		delete e;
	}
}

StudentFactory::~StudentFactory() {
	// TODO Auto-generated destructor stub
}

} /* namespace csye6205 */
} /* namespace neu */
} /* namespace edu */
