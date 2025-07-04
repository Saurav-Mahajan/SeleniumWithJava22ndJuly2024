package Pack2_OOPsConcepts;

public class InheritanceTwoChildClassOne extends InheritanceOneParentClass {
	
	// "extends" - This keyword is used to inherit properties of the parent class
	
	public static void main(String[] args) 
	{
		// Question - Since, subclass has inherited properties of the parent class, how to call static method in subclass? 
		// Answer - simply call static method in parent class using method name.
		
		staticMethodOfParentClass();
		
		// Question - Since, subclass has inherited properties of the parent class, how to call non static method in subclass? 
		// Answer - Using object of the class. Here, no need to create object of the parent class, it can be called using object of the child class.
		
		InheritanceTwoChildClassOne objectTwo = new InheritanceTwoChildClassOne();
		objectTwo.nonStaticMethodOfParentClass();
		
	}

}
