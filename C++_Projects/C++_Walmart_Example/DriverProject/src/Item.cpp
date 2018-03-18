/*
 * Item.cpp
 *
 *  Created on: Feb 28, 2018
 *      Author: Ruby
 */

#include "Item.h"

namespace edu {
namespace neu {
namespace csye6205 {

Item::Item(int number, double price, string name):number(number),price(price),name(name) {
	// TODO Auto-generated constructor stub

}

void Item::show(){
	cout<<this->name<<" : $"<<this->price<<"; No: "<<this->number<<endl;
}

const string& Item::getName() const {
	return name;
}

const string& Item::getClassname() const {
	return classname;
}

void Item::setName(const string& name) {
	this->name = name;
}

int Item::getNumber() const {
	return number;
}

void Item::setNumber(int number) {
	this->number = number;
}

double Item::getPrice() const {
	return price;
}

void Item::setPrice(double price) {
	this->price = price;
}

Item::~Item() {
	// TODO Auto-generated destructor stub
}

} /* namespace csye6205 */
} /* namespace neu */
} /* namespace edu */
