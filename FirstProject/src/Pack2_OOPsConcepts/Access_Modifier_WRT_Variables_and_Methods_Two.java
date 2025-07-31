package Pack2_OOPsConcepts;

import Access_Modifiers.Access_Modifier_WRT_Variables_and_Methods_One;

public class Access_Modifier_WRT_Variables_and_Methods_Two extends Access_Modifier_WRT_Variables_and_Methods_One {
	
	/*
	Notes - Access Modifier W.R.T. Variables and Methods -
	
	A. Public - When an variable or method is declared as "public" that simply means that the entity 
	is accessible throughout the project i.e. within different packages as well. 
	
	B. <default> - 
	1. When an variable or method has no access modifier type mentioned explicitly, 
	it is considered to be <default> type.  
	2. When an variable or method is declared as "<default>" that simply means that the 
	entity is accessible within the same package only.
	
	C. Private - When an variable or method is declared as "private" that simply means that the entity 
	is only accessible within the same class.
	
	D. Protected - 
	1. When an variable or method is declared as "protected" that simply means that the 
	entity is accessible within the same package only (same scope as <default>).
	2. However, if user wants to access such kind of variable or method, it can be accessed via
	inheritance i.e. by creating child class of the class in which protected entities are originally
	declared.
	3. Protected entities will only be accessible in child class via object of child class only. 
	
	*/
	
	public static void main(String[] args) 
	{
		System.out.println(Access_Modifier_WRT_Variables_and_Methods_One.a);
		
		Access_Modifier_WRT_Variables_and_Methods_One.MethodOne();
		
		Access_Modifier_WRT_Variables_and_Methods_Two ObjectOne = new Access_Modifier_WRT_Variables_and_Methods_Two();
		System.out.println(ObjectOne.d);
		
		ObjectOne.MethodFour();
	}

}
