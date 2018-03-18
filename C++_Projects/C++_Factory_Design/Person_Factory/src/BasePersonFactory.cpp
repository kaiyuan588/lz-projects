/*
 * BasePersonFactory.cpp
 *
 *  Created on: Feb 12, 2018
 *      Author: Ruby
 */

#include "BasePersonFactory.h"
#include "Factory.h"
#include "EmployeeFactory.h"
#include "StudentFactory.h"
namespace edu {
namespace neu {
namespace csye6205 {

BasePersonFactory::BasePersonFactory() {
	// TODO Auto-generated constructor stub

}

Factory *BasePersonFactory::getFactory(int c){
	Factory *f = (Factory*)nullptr;
	switch(c){
		case 0:
			f = new EmployeeFactory();
			break;
		case 1:
			f = new StudentFactory();
			break;
	}
	return (f);
}

void BasePersonFactory::freeFactory(Factory *f) {
	delete f;
	return;
}

void BasePersonFactory::basePersonFactoryDemo(){
	Factory *f1 = nullptr;
	Factory *f2 = nullptr;
	BasePersonFactory bpf = BasePersonFactory();
	vector<Factory *> v = vector<Factory *>();
	f1 = bpf.getFactory(0);
	f2 = bpf.getFactory(1);
	v.push_back(f1);
	v.push_back(f2);
	for(Factory *f : v){
		f->info();
		f->create();
		f->show();
	}
	bpf.freeFactory(f1);
	bpf.freeFactory(f2);
}


BasePersonFactory::~BasePersonFactory() {
	// TODO Auto-generated destructor stub
}

} /* namespace csye6205 */
} /* namespace neu */
} /* namespace edu */
