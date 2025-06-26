package Pack1;

public class VariablesFour {
	
	public static void main(String[] args) 
	{
	//Question - How to call static variable in main method of another class?
	//Answer - By simply calling ClassName.variableName; where ClassName is name of the class in which the static variable is originally declared.
		
		System.out.println(VariablesThree.a);	
		
	//Question - How to call non-static variable in main method of another class?
	//Answer - By creating object of the class in which the non-static variable is declared originally.
	
		VariablesThree newObjectToCallNonStaticVariableOfVariablesThreeClass = new VariablesThree();
		System.out.println(newObjectToCallNonStaticVariableOfVariablesThreeClass.b);
		
	}

}
