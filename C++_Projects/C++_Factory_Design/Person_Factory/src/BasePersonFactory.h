/*
 * BasePersonFactory.h
 *
 *  Created on: Feb 12, 2018
 *      Author: Ruby
 */

#ifndef BASEPERSONFACTORY_H_
#define BASEPERSONFACTORY_H_
#include "Factory.h"
namespace edu {
namespace neu {
namespace csye6205 {

class BasePersonFactory {
public:
	BasePersonFactory();
	Factory * getFactory(int c);
	void freeFactory(Factory *f);
	static void basePersonFactoryDemo();
	virtual ~BasePersonFactory();
};

} /* namespace csye6205 */
} /* namespace neu */
} /* namespace edu */

#endif /* BASEPERSONFACTORY_H_ */
