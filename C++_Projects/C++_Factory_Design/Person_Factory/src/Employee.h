/*
 * Employee.h
 *
 *  Created on: Feb 11, 2018
 *      Author: Ruby
 */

#ifndef EMPLOYEE_H_
#define EMPLOYEE_H_
#include "Person.h"
namespace edu {
namespace neu {
namespace csye6205 {

class Employee : public Person{
private:
	double salary;
public:
	Employee(int age, string name, double salary);
	void show();
	virtual ~Employee();
};

} /* namespace csye6205 */
} /* namespace neu */
} /* namespace edu */

#endif /* EMPLOYEE_H_ */
