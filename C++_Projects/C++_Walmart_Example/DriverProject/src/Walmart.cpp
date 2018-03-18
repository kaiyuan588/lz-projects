/*
 * Walmart.cpp
 *
 *  Created on: Feb 28, 2018
 *      Author: Ruby
 */
#include <typeinfo>
#include "Walmart.h"
#include "Electronics.h"
#include "Bread.h"
#include "HealthyBread.h"
#include <iostream>
#include <algorithm>
using namespace std;
namespace edu {
namespace neu {
namespace csye6205 {


Walmart::Walmart(string name) {
	// TODO Auto-generated constructor stub

}

void Walmart::sortInventory(){
	if(this->getInventory()[0]->getClassname().compare("Electronics") == 0){
		sort(this->getInventory().begin(),this->getInventory().end(),sortbyprice);
	}
	if(this->getInventory()[0]->getClassname().compare("Bread") == 0){
			sort(this->getInventory().begin(),this->getInventory().end(),sortbynum);
	}
	if(this->getInventory()[0]->getClassname().compare("HealthyBread") == 0){
			sort(this->getInventory().begin(),this->getInventory().end(),sortbycal);
	}
}



bool Walmart::sortbyprice(Item *i1, Item *i2){
	return i1->getPrice() < i2->getPrice();
}

bool Walmart::sortbynum(Item *i1, Item *i2){
	return i1->getNumber()<i2->getNumber();
}

bool Walmart::sortbycal(Item *i1, Item *i2){
	HealthyBread *hb1 = static_cast<HealthyBread *>(i1);
	HealthyBread *hb2 = static_cast<HealthyBread *>(i2);
	return hb1->getCal()<hb2->getCal();
}

void Walmart::demo() {
     cout << "\n\t Walmart::demo() starting ..." <<  endl;

    {
        Walmart obj("Walmart");
         cout << "\n Electronic items for sale at Walmart (sorted by price)"
                <<  endl;
        Electronics sharpTv(100, 899.99, "Sharp Flat Screen TV");
        Electronics appleIpad(101, 499.99, "Apple Ipad mini");
        Electronics blueRay(102, 99.99, "BlueRay player");
        Electronics hpLaptop(103, 399.99, "HP Laptop");
        obj.addItem(&sharpTv);
        obj.addItem(&appleIpad);
        obj.addItem(&blueRay);
        obj.addItem(&hpLaptop);
        obj.sortInventory();
        obj.showInventory();
    }

    {
        Walmart obj("Walmart");
         cout
                << "\n Bread items for sale at Walmart (sorted by item number)"
                <<  endl;
        Bread pretzel(3, 0.49, "Pretzel");
        Bread bagel(1, 0.89, "Bagel");
        Bread frenchBaguette(2, 2.59, "French Baguette");
        Bread dinnerRoll(4, 1.89, "Dinner Roll");
        obj.addItem(&pretzel);
        obj.addItem(&bagel);
        obj.addItem(&frenchBaguette);
        obj.addItem(&dinnerRoll);

        obj.sortInventory();
        obj.showInventory();
    }

    {
        Walmart obj("Walmart");
         cout
                << "\n Healthy Bread items for sale at Walmart (sorted by calories)"
                <<  endl;

        HealthyBread pretzelHealthy(30, 0.49, 230.0, "Pretzel");
        HealthyBread bagelHealthy(10, 0.89, 280.0, "Bagel");
        HealthyBread frenchBaguetteHealthy(20, 2.59, 150.0, "French Baguette");
        HealthyBread dinnerRollHealthy(40, 1.89, 80.0, "Dinner Roll");
        obj.addItem(&pretzelHealthy);
        obj.addItem(&bagelHealthy);
        obj.addItem(&frenchBaguetteHealthy);
        obj.addItem(&dinnerRollHealthy);

        obj.sortInventory();
        obj.showInventory();
    }
     cout << "\n Walmart::demo() done!" <<  endl;
}


Walmart::~Walmart() {
	// TODO Auto-generated destructor stub
}

} /* namespace csye6205 */
} /* namespace neu */
} /* namespace edu */
