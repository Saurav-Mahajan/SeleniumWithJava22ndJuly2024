package Pack1;

public class LocalVariableOne {
	
	public static void staticMethod ()
	{
		int a = 100; // syntax of local variable. The scope of local variable is limited to the method it is declared originally.
		
		System.out.println(a); // local variables can be called within method in which they are declared by simply calling localVariableName();
	}
	
	public void nonStaticMethod ()
	{
        int b = 200;
		
		System.out.println(b);
	}
	
	public static void main(String[] args) 
	{
		int c = 300;
		
		System.out.println(c);
		
		staticMethod();
		
		LocalVariableOne objectToCallNonStaticMwthod = new LocalVariableOne();
		objectToCallNonStaticMwthod.nonStaticMethod();
	}

}
