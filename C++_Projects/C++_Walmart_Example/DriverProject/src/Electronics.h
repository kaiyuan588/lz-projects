/*
 * Electronics.h
 *
 *  Created on: Feb 28, 2018
 *      Author: Ruby
 */
#include "Item.h"
#include <iostream>
using namespace std;
#ifndef SRC_ELECTRONICS_H_
#define SRC_ELECTRONICS_H_

namespace edu {
namespace neu {
namespace csye6205 {

class Electronics : public Item{

public:
	Electronics(int number,double price,string name);

	virtual ~Electronics();
};

} /* namespace csye6205 */
} /* namespace neu */
} /* namespace edu */

#endif /* SRC_ELECTRONICS_H_ */
