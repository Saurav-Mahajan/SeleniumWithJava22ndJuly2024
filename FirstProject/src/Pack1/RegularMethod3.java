package Pack1;

public class RegularMethod3 {
	
	public static void main(String[] args) 
	{
		// Question - How to call non-static method in main method of different class?
		// Answer - By creating object of the class in which non-static method is created.
		
		RegularMethod2 objectForNonStaticMethodOfRegularMethod2Class = new RegularMethod2(); // syntax of object creation i.e. className variableName = new className;
		objectForNonStaticMethodOfRegularMethod2Class.nonStaticMethod();
		
		// Question - How to call static method in main method of different class?
		// Answer - By using syntax i.e. className.mthodName(); where, className is the name of the class in which static method is defined originally.
				
		RegularMethod2.staticMethod();
	}

}
