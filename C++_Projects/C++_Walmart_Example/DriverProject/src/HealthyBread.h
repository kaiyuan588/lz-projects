/*
 * HealthyBread.h
 *
 *  Created on: Feb 28, 2018
 *      Author: Ruby
 */
#include "Item.h"
#include <iostream>
using namespace std;
#ifndef SRC_HEALTHYBREAD_H_
#define SRC_HEALTHYBREAD_H_

namespace edu {
namespace neu {
namespace csye6205 {

class HealthyBread : public Item {
private:
	double cal;
public:
	HealthyBread(int number,double price,double cal,string name);
	void show();
	virtual ~HealthyBread();
	double getCal() const;
	void setCal(double cal);
};

} /* namespace csye6205 */
} /* namespace neu */
} /* namespace edu */

#endif /* SRC_HEALTHYBREAD_H_ */
