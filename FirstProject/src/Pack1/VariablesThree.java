package Pack1;

public class VariablesThree {
	
	static int a = 10; // Static Variables. These are class level variables and are declared within class but outside of the main method!	
	
	int b = 20; // non-static variable. These are class level variables as well and are declared within class but outside of the main method!
	
	public static void main(String[] args) 
	{
	//Question - How to call static variable in main method of the same class?
	//Answer - By simply calling variableName;
		
		System.out.println(a);
		
	//Question - Can you call static variable in main method by creating an object of the class?
	//Answer - Yes it can be called, but is not recommended as it is a unnecessary consumption of memory.\
	
		VariablesThree objectToCallStaticVariable = new VariablesThree();
	    System.out.println(objectToCallStaticVariable.a);

	//Question - How to call non-static variable in main method of the same class?
	//Answer - By creating object of the class in which the non-static variable is declared originally.   
	    
	    VariablesThree objectToCallNonStaticVariable = new VariablesThree();
	    System.out.println(objectToCallNonStaticVariable.b);
	    
	}

}
