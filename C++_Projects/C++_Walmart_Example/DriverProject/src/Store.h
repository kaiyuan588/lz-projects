/*
 * Store.h
 *
 *  Created on: Feb 28, 2018
 *      Author: Ruby
 */
#include <iostream>
#include <vector>
using namespace std;
#include "AbstractStore.h"
#ifndef SRC_STORE_H_
#define SRC_STORE_H_

namespace edu {
namespace neu {
namespace csye6205 {

class Store : public AbstractStore{
private:
	string name;
protected:
	vector <Item *> inventory;
public:
	Store();
	void showInventory();
	virtual ~Store();
	void addItem(Item *item);
	vector<Item*>& getInventory();
	void setInventory(const vector<Item*>& inventory);
	const string& getName() const;
	void setName(const string& name);
};

} /* namespace csye6205 */
} /* namespace neu */
} /* namespace edu */

#endif /* SRC_STORE_H_ */
