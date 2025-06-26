package Pack1;

public class VariablesSix {

	public static void staticMethod ()
	{
	//Question - How to call static variable in static method of another class?
	//Answer - By simply calling ClassName.variableName; where ClassName is the name of the class in which static variable is declared originally.
			
		System.out.println(VariablesFive.staticVariable);
		
	//Question - How to call non-static variable in static method of another class?
	//Answer - By creating object of the class in which non-static variable is declared originally.
		
		VariablesFive objectToCallNonStaticVariableOfVariablesFiveClass1 = new VariablesFive();
		System.out.println(objectToCallNonStaticVariableOfVariablesFiveClass1.nonStaticVariable);
	}
	
	public void nonStaticMethod ()
	{
	//Question - How to call static variable in non-static method of another class?
	//Answer - By simply calling ClassName.variableName; where ClassName is the name of the class in which static variable is declared originally.
		
		System.out.println(VariablesFive.staticVariable);
		
	//Question - How to call non-static variable in non-static method of another class?
	//Answer - By creating object of the class in which non-static variable is declared originally.
		
		VariablesFive objectToCallNonStaticVariableOfVariablesFiveClass2 = new VariablesFive();
		System.out.println(objectToCallNonStaticVariableOfVariablesFiveClass2.nonStaticVariable);
	}
	
	public static void main(String[] args) 
	{
		staticMethod();
		
		VariablesSix objectToCallNonStaticMethodOfVariablesSixClass = new VariablesSix();
		objectToCallNonStaticMethodOfVariablesSixClass.nonStaticMethod();
	}

}
