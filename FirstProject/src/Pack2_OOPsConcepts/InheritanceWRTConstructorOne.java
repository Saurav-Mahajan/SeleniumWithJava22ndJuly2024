package Pack2_OOPsConcepts;

public class InheritanceWRTConstructorOne {
	
//	public InheritanceWRTConstructorOne()
//	{
//		System.out.println("This is a zero argument constructor of parent class");
//	}
	
	public InheritanceWRTConstructorOne(int a)
	{
		System.out.println("This is a one argument constructor of the parent class");
	}
	
	public static void main(String[] args) 
	{
		InheritanceWRTConstructorOne varOne = new InheritanceWRTConstructorOne();
		InheritanceWRTConstructorOne varTwo = new InheritanceWRTConstructorOne(5);
	}

}
