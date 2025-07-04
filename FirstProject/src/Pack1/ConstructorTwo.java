package Pack1;

public class ConstructorTwo {
	
	/*
	 Properties of an constructor - 
	 
	 A. Constructor name should be same as class name. 
	 B. Constructor can accept argument/ parameter.
	 C. Constructor does not have return type as it does not return any values like a method.
	 D. A class can have multiple constructors created but the number of arguments and/or the type of argument should be different for each constructor.
	 E. A constructor can be called in another constructor using "this()" keyword.
	 F. One can not call more than one constructor in another constructor.
	 G. "this()" keyword should be the very first line in a constructor body if a constructor wants to call another constructor.
	 H. You can call multiple constructors in another constructor using object of the class.
	 
	 Note - Here, "this()" keyword refer to the 0 argument constructor in a class. If you want to call a constructor with argument simply use "this(value of argument)".
	 
	 */
	
	public ConstructorTwo()
	{
		System.out.println("This is a user-defined construtor without any argument.");
	}
	
	public ConstructorTwo (int a)
	{
		this();
		System.out.println("This is a user-defined construtor with 1 argument of type int.");
	}
	
	public ConstructorTwo (int a, int b)
	{
		this(4);
		System.out.println("This is a user-defined construtor with 2 arguments of type int");
	}
	
	public ConstructorTwo (String a)
	{
		this(2, 2);
		System.out.println("This is a user-defined construtor with 1 argument of type string.");
	}
	
	public ConstructorTwo(int a, int b, int c)
	{
		this("Z");
		ConstructorTwo varOne = new ConstructorTwo();
		ConstructorTwo varTwo = new ConstructorTwo(1);
		ConstructorTwo varThree = new ConstructorTwo(1, 2);
		ConstructorTwo varFour = new ConstructorTwo("P");
	}
	
	public static void main(String[] args) 
	{
		ConstructorTwo refVarOne = new ConstructorTwo(); // 0 argument constructor calling.
		
		ConstructorTwo refVarTwo = new ConstructorTwo(5); // 1 argument constructor with argument of integer type.
		
        ConstructorTwo refVarThree = new ConstructorTwo(1, 10); // 2 argument constructor with argument of integer type.
		
		ConstructorTwo refVarFour = new ConstructorTwo("A"); // 1 argument constructor with argument of string type.
		
		ConstructorTwo refVarFive = new ConstructorTwo(1, 2, 3); // 3 argument constructor with argument of integer type.
	}

}
