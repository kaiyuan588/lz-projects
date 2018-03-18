/*
 * Bread.cpp
 *
 *  Created on: Feb 28, 2018
 *      Author: Ruby
 */

#include "Bread.h"

namespace edu {
namespace neu {
namespace csye6205 {

Bread::Bread(int number,double price,string name):Item(number,price,name){
	// TODO Auto-generated constructor stub
	this->classname = "Bread";
}

Bread::~Bread() {
	// TODO Auto-generated destructor stub
}

//const string& Bread::getType() const{
//	return "Bread";
//}

} /* namespace csye6205 */
} /* namespace neu */
} /* namespace edu */
