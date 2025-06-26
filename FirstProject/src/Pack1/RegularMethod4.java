package Pack1;

public class RegularMethod4 {
	
	public void nonStaticMethod1 ()
	{
		System.out.println("This is first non-static method of RegularMethod4 class");
	}
	
	public static void staticMethod1 ()
	{
		System.out.println("This is first static method of RegularMethod4 class");
	}
	
	public void nonStaticMethod2 ()
	{
	//Question - How to call a static method in non-static method of same class? 
	//Answer - By simply calling methodName();
		staticMethod1();
	}
	
	public static void staticMethod2 ()
	{
	//Question - How to call a non-static method in static method of same class? 
	//Answer - 	By creating a object of the class in which non-static method is defined originally.
		RegularMethod4 variableToAccessNonStaticMethodOfSameClass = new RegularMethod4();
		variableToAccessNonStaticMethodOfSameClass.nonStaticMethod1();
	}
	
	public static void main(String[] args) 
	{
		RegularMethod4 variableToAccessNonStaticMethod = new RegularMethod4();
		variableToAccessNonStaticMethod.nonStaticMethod2(); // to access non-static method one.
		
		staticMethod2();
	}

}
