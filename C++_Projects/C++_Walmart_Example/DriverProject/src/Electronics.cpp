/*
 * Electronics.cpp
 *
 *  Created on: Feb 28, 2018
 *      Author: Ruby
 */

#include "Electronics.h"

namespace edu {
namespace neu {
namespace csye6205 {

Electronics::Electronics(int number,double price,string name):Item(number,price,name) {
	// TODO Auto-generated constructor stub
	this->classname = "Electronics";

}


Electronics::~Electronics() {
	// TODO Auto-generated destructor stub
}

//const string& Electronics::getType() const{
//
//	return classname;
//}

} /* namespace csye6205 */
} /* namespace neu */
} /* namespace edu */
