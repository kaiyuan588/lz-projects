/*
 * Person.h
 *
 *  Created on: Feb 11, 2018
 *      Author: Ruby
 */

#ifndef PERSON_H_
#define PERSON_H_
#include "AbstractPersonAPI.h"
#include <iostream>
using namespace std;
namespace edu {
namespace neu {
namespace csye6205 {

class Person : public AbstractPersonAPI {
protected:
	string name;
	int age;

public:
	Person(int age, string name);
	virtual void show();
	virtual ~Person();

};

} /* namespace csye6205 */
} /* namespace neu */
} /* namespace edu */

#endif /* PERSON_H_ */
