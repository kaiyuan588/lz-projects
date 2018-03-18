/*
 * Walmart.h
 *
 *  Created on: Feb 28, 2018
 *      Author: Ruby
 */
#include "Store.h"
#include <iostream>
#include "HealthyBread.h"
using namespace std;
#ifndef SRC_WALMART_H_
#define SRC_WALMART_H_

namespace edu {
namespace neu {
namespace csye6205 {

class Walmart : public Store{
private:
	string name;

public:
	Walmart(string name);
	void sortInventory();
	static bool sortbyprice(Item *i1, Item *i2);
	static bool sortbynum(Item *i1, Item *i2);
	static bool sortbycal(Item *i1, Item *i2);
	static void demo();
	virtual ~Walmart();
};

} /* namespace csye6205 */
} /* namespace neu */
} /* namespace edu */

#endif /* SRC_WALMART_H_ */
