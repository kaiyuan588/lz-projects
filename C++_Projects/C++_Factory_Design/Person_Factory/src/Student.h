/*
 * Student.h
 *
 *  Created on: Feb 11, 2018
 *      Author: Ruby
 */

#ifndef STUDENT_H_
#define STUDENT_H_
#include "Person.h"

namespace edu {
namespace neu {
namespace csye6205 {

class Student : public Person{
private:
	double gpa;
public:
	Student(double gpa, string name, int age);
	void show();
	virtual ~Student();
};

} /* namespace csye6205 */
} /* namespace neu */
} /* namespace edu */

#endif /* STUDENT_H_ */
