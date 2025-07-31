package Pack2_OOPsConcepts;

public class ChildClassTwoForVariables extends ParentClassOneForVariables {
		
	int A = 1000;
	static int B = 2000;
	
	public void nonStaticMethodofChildClass()
	{
		System.out.println(super.A);
	}
	
	public static void main(String[] args) 
	{
		
	// Question - If child class and parent class both has static variables with same name of global/ class level, how to access variable of parent class?
	// Answer - By simply calling ParentClassName.staticVariabelName.
		
		System.out.println(ParentClassOneForVariables.B);
		  
	// Question - If child class and parent class both has non-static variables with same name of global/ class level, how to access variable of parent class?
	// Answer - By using "super" keyword. Create non-static method in child class and use super keyword in it. Then, call that non-static method in main method by creating an object of child class.

		ChildClassTwoForVariables varThree = new ChildClassTwoForVariables();
		varThree.nonStaticMethodofChildClass();
		
	// Question - If child class and parent class both has static variables with same name of global/ class level, how to access variable of child class?
	// Answer - By simply calling variableName;
		
		System.out.println(B);
		  
	// Question - If child class and parent class both has non-static variables with same name of global/ class level, how to access variable of child class?
	// Answer - By creating object of the child class.
		  
		System.out.println(varThree.A);
		
	}

}
