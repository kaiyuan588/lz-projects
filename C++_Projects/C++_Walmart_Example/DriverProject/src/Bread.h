/*
 * Bread.h
 *
 *  Created on: Feb 28, 2018
 *      Author: Ruby
 */
#include "Item.h"
#include <iostream>
using namespace std;
#ifndef SRC_BREAD_H_
#define SRC_BREAD_H_

namespace edu {
namespace neu {
namespace csye6205 {

class Bread : public Item{
public:
	Bread(int number,double price,string name);
//	const string& getType() const;
	virtual ~Bread();
};

} /* namespace csye6205 */
} /* namespace neu */
} /* namespace edu */

#endif /* SRC_BREAD_H_ */
