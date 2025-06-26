package Pack1;

public class RegularMethod {
	
	public void nonStaticMethod ()
	{
		System.out.println("This is a non static method!");
	}

	public static void staticMethod ()
	{
		System.out.println("This is a static method!");
	}
	
	public void nonStaticMethod2 ()
	{
		staticMethod(); // Calling of static method in another non-static method of the same class.
	}
	
	public static void staticMethod2 ()
	{
		RegularMethod refVariableOne = new RegularMethod();
		refVariableOne.nonStaticMethod();
	}
	
	public static void main(String[] args) {
		
		RegularMethod refOne = new RegularMethod(); // In order to call a non-static method in main method, object of the class in which non-static method is defined, needs to be created.
		refOne.nonStaticMethod();
		
		staticMethod(); // Static method can be called in the main method by simply calling the method name. The only condition is that it should be in the same class. 
	
		refOne.nonStaticMethod2(); // calling of a non-static method in main method
		
		staticMethod2();// calling of a static method in main method
	}
	
}
