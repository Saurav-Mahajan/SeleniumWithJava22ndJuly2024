package Pack1;

public class VariablesFive {
	
	static int staticVariable = 100;
	int nonStaticVariable = 200;
	
	public static void staticMethod ()
	{
	//Question - How to call static variable in static method?
	//Answer - By simply calling variableName;
		
		System.out.println(staticVariable);
		
	//Question - How to call non-static variable in static method?
	//Answer - By creating object of the class in which the non-static variable is declared originally.
		
		VariablesFive objectToCallNonStaticVariable = new VariablesFive();
		System.out.println(objectToCallNonStaticVariable.nonStaticVariable);
	}
	
	public void nonStaticMethod ()
	{
	//Question - How to call static variable in non-static method?
	//Answer - By simply calling variableName;
		
		System.out.println(staticVariable);
			
	//Question - How to call non-static variable in non-static method?
	//Answer - By simply calling variableName;
		
		System.out.println(nonStaticVariable);
		
	}
	
	public static void main(String[] args) 
	{
		staticMethod();
		
		VariablesFive objectToCallNonStaticMethod = new VariablesFive();
		objectToCallNonStaticMethod.nonStaticMethod();
	}

}
