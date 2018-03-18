/*
 * EmployeeFactory.cpp
 *
 *  Created on: Feb 12, 2018
 *      Author: Ruby
 */

#include "EmployeeFactory.h"
#include "Employee.h"
#include <vector>
namespace edu {
namespace neu {
namespace csye6205 {

EmployeeFactory::EmployeeFactory() {
	// TODO Auto-generated constructor stub

}

void EmployeeFactory::info(){
	cout<<"This is Employee Factory"<<endl;
}

void EmployeeFactory::create(){
	Employee *e1 = new Employee(25, "Lai Zhang--Employee", 1600);
	v.push_back(e1);
	Employee *e2 = new Employee(22, "Tianchen Zhang--Employee", 3200);
	v.push_back(e2);
}

void EmployeeFactory::show(){
	for(Employee *e : v){
		e->show();
		delete e;
	}
}

EmployeeFactory::~EmployeeFactory() {
	// TODO Auto-generated destructor stub
}

} /* namespace csye6205 */
} /* namespace neu */
} /* namespace edu */
