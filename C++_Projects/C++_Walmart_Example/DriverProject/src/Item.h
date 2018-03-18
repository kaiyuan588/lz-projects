/*
 * Item.h
 *
 *  Created on: Feb 28, 2018
 *      Author: Ruby
 */

#include <iostream>
using namespace std;
#ifndef SRC_ITEM_H_
#define SRC_ITEM_H_

namespace edu {
namespace neu {
namespace csye6205 {

class Item {
private:
	string name;
	double price;
	int number;
protected:
	string classname;
public:
	Item(int number, double price, string name);
	virtual ~Item();
	virtual void show();
//	virtual void getClassName()=0;
	const string& getName() const;
	const string& getClassname() const;
	void setName(const string& name);

	int getNumber() const;

	void setNumber(int number);

	double getPrice() const;

	void setPrice(double price);
};

} /* namespace csye6205 */
} /* namespace neu */
} /* namespace edu */

#endif /* SRC_ITEM_H_ */
