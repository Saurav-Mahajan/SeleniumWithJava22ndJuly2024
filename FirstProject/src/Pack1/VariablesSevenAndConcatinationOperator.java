package Pack1;

public class VariablesSevenAndConcatinationOperator {
	
	int a = 100;
	static int b = 200;
	
	public static void main(String[] args) 
	{
		VariablesSevenAndConcatinationOperator objectOne = new VariablesSevenAndConcatinationOperator();
		System.out.println("value of non-static variable a is : " + objectOne.a); // Here "+" is used as a concatenation operator to append the value of the given variable.
		
		//Question - If the value of non-static variable "a" is changed from 100 to 1000 with respect to the object created, which value would be printed as final output?
		//Answer - 1000 will be printed as final output as value of non-static variable "a" has been changed from 100 to 1000 with respect to object created.

		objectOne.a = 1000;
		System.out.println("Updated value of non-static variable a is : " + objectOne.a);
		
		//Question - What if a new object is created to access non static variable "a", will it print 100 or 1000? 
		//Answer - It will print 100 as the newly created object is referring to initial value of non-static variable "a" i.e. 100 and 1000 refers to changed value of variable "a" with respect to object1 created.
	
		VariablesSevenAndConcatinationOperator objectTwo = new VariablesSevenAndConcatinationOperator();
		System.out.println("value of non-static variable a with object 2 is : " + objectTwo.a);
		
		//Question - If the value of static variable "b" is changed from 200 to 2000 with respect to the object created, which value would be printed as final output?
		//Answer - 2000 will be printed as final output as value of static variable "b" has been changed from 200 to 2000 with respect to object created.

		objectOne.b = 2000;
		System.out.println("value of static variable b is : " + objectOne.b);
		
		//Question - What if a new object is created to access static variable "b", will it print 200 or 2000? 
		//Answer - It will still print 2000 as static variables share memory with all other objects in a class. 
		
		System.out.println("Updated value of static variable b with object 2 is : " + objectTwo.b);
			
		
		//Notes - A. Static variables share the memory with all other objects in the class.
		//        B. Non-static variables do not share memory with any other object in a class. 
	}

}
