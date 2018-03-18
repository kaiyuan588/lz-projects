/*
 * AbstractPersonAPI.h
 *
 *  Created on: Feb 10, 2018
 *      Author: Ruby
 */

#ifndef ABSTRACTPERSONAPI_H_
#define ABSTRACTPERSONAPI_H_

namespace edu {
namespace neu {
namespace csye6205 {

class AbstractPersonAPI {
public:
	AbstractPersonAPI();
	virtual ~AbstractPersonAPI();
	virtual void show() = 0;
};

} /* namespace csye6205 */
} /* namespace neu */
} /* namespace edu */

#endif /* ABSTRACTPERSONAPI_H_ */
