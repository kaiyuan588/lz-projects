/*
 * HealthyBread.cpp
 *
 *  Created on: Feb 28, 2018
 *      Author: Ruby
 */

#include "HealthyBread.h"

namespace edu {
namespace neu {
namespace csye6205 {

HealthyBread::HealthyBread(int number,double price,double cal,string name): Item(number,price,name),cal(cal) {
	// TODO Auto-generated constructor stub
	this->classname = "HealthyBread";
}
void HealthyBread::show(){
	cout<<this->getName()<<" : $"<<this->getPrice()<<"; No: "<<this->getNumber()<<" Cal: "<<this->cal<<endl;
}



double HealthyBread::getCal() const {
	return cal;
}

void HealthyBread::setCal(double cal) {
	this->cal = cal;
}

HealthyBread::~HealthyBread() {
	// TODO Auto-generated destructor stub
}

} /* namespace csye6205 */
} /* namespace neu */
} /* namespace edu */
