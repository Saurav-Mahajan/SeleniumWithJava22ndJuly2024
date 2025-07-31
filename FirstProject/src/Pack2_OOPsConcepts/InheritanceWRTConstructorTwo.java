package Pack2_OOPsConcepts;

public class InheritanceWRTConstructorTwo extends InheritanceWRTConstructorOne {
	
	public InheritanceWRTConstructorTwo()
	{
		super(1);
		System.out.println("This is a zero argument constructor of child class");
	}
	
	/*Notes - 
	  A. Constructor of child class will always by default gives a call to only zero argument constructor of the parent class.
	  B. If zero argument constructor is not present in the parent class, then child class constructor gives a call to default constructor of parent class.
	  C. If zero argument constructor is not present in the parent class. then we must explicitly give a call to constructor with argument using "super" keyword.
	 
	  Super Keyword - 
	  A. It is used to call parent class constructor with argument in child class.
	  B. It can not be used if there is no inheritance present between parent and a child.
	  
	  Syntax - Super(Argument of the constructor);
	*/
	
	public static void main(String[] args) 
	{
		InheritanceWRTConstructorTwo varOne = new InheritanceWRTConstructorTwo();
	}

}
