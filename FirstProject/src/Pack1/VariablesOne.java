package Pack1;

public class VariablesOne {
	
	static int a = 10; // static variable.
	int b = 100; // non-static variable.
	
	
	public static void main(String[] args) {
		
	System.out.println(a); // static variable can be called within the same class by simply its name.
	
	VariablesOne ref1 = new VariablesOne();
	System.out.println(ref1.a); // static variable can be called within the same class by creating an object of the class but it is not recommended.
	
	System.out.print("********");
	System.out.print(" Seperator ");
	System.out.println("********");
	
	System.out.println(ref1.b); // non-static variable is called within the same class by simply creating an object of the origin class.
	
	System.out.print("********");
	System.out.print(" Seperator ");
	System.out.println("********");
	
	m1();
	
	System.out.print("********");
	System.out.print(" Seperator ");
	System.out.println("********");
	
	ref1.m2();
	
	}

	public static void m1 ()
	{
		System.out.println(a); // static variable calling in static method of the same class.
		
		System.out.print("********");
		System.out.print(" Seperator ");
		System.out.println("********");  
		
		VariablesOne ref2 = new VariablesOne(); // non-static variable can be called within the same class in a static method by simply creating an object of the origin class.
		System.out.println(ref2.b);
	}
	
	public void m2()
	{
		System.out.println(a); // static variable calling in non-static method of the same class.
		
		System.out.print("********");
		System.out.print(" Seperator ");
		System.out.println("********");  
		
		System.out.println(b); // non-static variable can be called within the same class in a non-static method by simply calling "variableName".
	}
	
}
