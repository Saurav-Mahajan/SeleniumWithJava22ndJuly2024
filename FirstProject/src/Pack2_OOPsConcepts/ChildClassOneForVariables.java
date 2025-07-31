package Pack2_OOPsConcepts;

public class ChildClassOneForVariables extends ParentClassOneForVariables {
	
	/* Question - How to access global/ class variables of parent class in child class?
	   Answer -
	   1. Static variable in parent class of global/ class level can be accessed using ParentClassName.variableName.
	   2. Non-static variable in parent class of global/class level can be accessed by creating object of the child class.
	*/
	
	public static void main(String[] args) 
	{
		System.out.println(ParentClassOneForVariables.B);
		
		ChildClassOneForVariables varTwo = new ChildClassOneForVariables();
		System.out.println(varTwo.A);
	}

}
