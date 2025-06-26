package Pack1;

public class LocalVariableTwoandThisKeyword {
	
	int a = 100;
	static int b = 200;
	
	public void nonStaticMethod1 ()
	{
		int a = 1000;
		
		//Question - If there are two variables in a code with same name, where one is local variable and another one a global variable, which one will be accessed?
		//Answer - In that case, since the local variable is nearest it will be accessed.
		System.out.println(a);
	}
	
	public static void staticMethod1 ()
	{
        int b = 2000;
		
		//Question - If there are two variables in a code with same name, where one is local variable and another one a global variable, which one will be accessed?
		//Answer - In that case, since the local variable is nearest it will be accessed.
		System.out.println(b);
	}
	
	public void nonStaticMethod2 ()
	{
		int a = 10;
		//Question - If there are two variables in a code with same name, where one is local variable and another one a global variable, how to access a global variable?
		//Answer 1 - By creating an object of the class.
		
		LocalVariableTwoandThisKeyword objectToCallGlobalVariable = new LocalVariableTwoandThisKeyword();
		System.out.println(objectToCallGlobalVariable.a);
				
		//Answer 2 - By using the "this" keyword.
		
		System.out.println(this.a);
	}
	
	public static void staticMethod2 ()
	{
		int b = 20;
		
		//Question - Can "this" keyword be used in static methods/ areas?
		//Answer - No, it throws error as "this" keyword is only used for non-static areas of the code.
		
		System.out.println(this.b);
	}
	
	public static void main(String[] args)
	{
		LocalVariableTwoandThisKeyword objectToCallNonStaticMethod = new LocalVariableTwoandThisKeyword();
		objectToCallNonStaticMethod.nonStaticMethod1();
		
		staticMethod1();
		objectToCallNonStaticMethod.nonStaticMethod2();
	}

}
