/*
 * EmployeeFactory.h
 *
 *  Created on: Feb 12, 2018
 *      Author: Ruby
 */

#ifndef EMPLOYEEFACTORY_H_
#define EMPLOYEEFACTORY_H_
#include "Factory.h"
#include "Employee.h"
#include <vector>
namespace edu {
namespace neu {
namespace csye6205 {

class EmployeeFactory : public Factory {
private:
	vector<Employee *> v;
public:
	EmployeeFactory();
	virtual ~EmployeeFactory();
	void create();
	void show();
	void info();
};

} /* namespace csye6205 */
} /* namespace neu */
} /* namespace edu */

#endif /* EMPLOYEEFACTORY_H_ */
