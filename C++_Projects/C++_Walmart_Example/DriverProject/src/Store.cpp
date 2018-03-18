/*
 * Store.cpp
 *
 *  Created on: Feb 28, 2018
 *      Author: Ruby
 */

#include "Store.h"
#include <iostream>
using namespace std;
namespace edu {
namespace neu {
namespace csye6205 {

Store::Store() {
	// TODO Auto-generated constructor stub

}

void Store::showInventory() {
    cout << this->inventory.size() << " items in " << this->getName() << " Inventory" << endl;
    for (Item *itemPtr : this->inventory) {
        itemPtr->show();
    }
}

void Store::addItem(Item *item){
	this->inventory.push_back(item);
}

 vector<Item*>& Store::getInventory(){
	return inventory;
}

void Store::setInventory(const vector<Item*>& inventory) {
	this->inventory = inventory;
}

const string& Store::getName() const {
	return name;
}

void Store::setName(const string& name) {
	this->name = name;
}

Store::~Store() {
	// TODO Auto-generated destructor stub
}

} /* namespace csye6205 */
} /* namespace neu */
} /* namespace edu */
