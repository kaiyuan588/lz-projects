/*
 * PersonFactory.h
 *
 *  Created on: Feb 11, 2018
 *      Author: Ruby
 */

#ifndef SIMPLEPERSONFACTORY_H_
#define SIMPLEPERSONFACTORY_H_
#include "Person.h"
namespace edu {
namespace neu {
namespace csye6205 {

class PersonFactory {
public:
	PersonFactory();
	Person *getPerson(int c);
	void freePerson(Person *p);
	static void simplefactorydemo();
	virtual ~PersonFactory();
};

} /* namespace csye6205 */
} /* namespace neu */
} /* namespace edu */

#endif /* SIMPLEPERSONFACTORY_H_ */
