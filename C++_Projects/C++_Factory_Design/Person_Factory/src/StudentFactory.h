/*
 * StudentFactory.h
 *
 *  Created on: Feb 12, 2018
 *      Author: Ruby
 */

#ifndef STUDENTFACTORY_H_
#define STUDENTFACTORY_H_
#include "Factory.h"
#include "Student.h"
#include <vector>
namespace edu {
namespace neu {
namespace csye6205 {

class StudentFactory : public Factory{
private:
	vector<Student *> v;
public:
	StudentFactory();
	void show();
	void info();
	void create();
	virtual ~StudentFactory();
};

} /* namespace csye6205 */
} /* namespace neu */
} /* namespace edu */

#endif /* STUDENTFACTORY_H_ */
