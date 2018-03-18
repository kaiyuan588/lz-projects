/*
 * Factory.h
 *
 *  Created on: Feb 12, 2018
 *      Author: Ruby
 */

#ifndef FACTORY_H_
#define FACTORY_H_

namespace edu {
namespace neu {
namespace csye6205 {

class Factory {
public:
	Factory();
	virtual ~Factory();
	virtual void create() = 0;
	virtual void show() = 0;
	virtual void info() = 0;
};

} /* namespace csye6205 */
} /* namespace neu */
} /* namespace edu */

#endif /* FACTORY_H_ */
