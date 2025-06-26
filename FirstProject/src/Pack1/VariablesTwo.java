package Pack1;

public class VariablesTwo {

	public static void main(String[] args) {
	
		System.out.println(VariablesOne.a); // static variable can be called outside the same class by simply "ClassName.VariableName".
	
		System.out.print("********");
		System.out.print(" Seperator ");
		System.out.println("********");
		
		VariablesOne ref2 = new VariablesOne();
		System.out.println(ref2.b);	// non-static variable can be called outside the same class by simply creating an object of the origin class.	
		
		System.out.print("********");
		System.out.print(" Seperator ");
		System.out.println("********");
		
		m3();
		
		System.out.print("********");
		System.out.print(" Seperator ");
		System.out.println("********"); 
		 
		VariablesTwo ref4 = new VariablesTwo();
		ref4.m4();
		
	}
	
	public static void m3 ()
	{
	    System.out.println(VariablesOne.a); // static variable can be called outside the same class in a static method by simply "ClassName.VariableName".
		
	    System.out.print("********");
		System.out.print(" Seperator ");
		System.out.println("********");
	    
	    VariablesOne ref2 = new VariablesOne();
		System.out.println(ref2.b); // non-static variable can be called outside the same class in a static method by simply creating the object of the origin class.
	}
	
	public void m4 ()
	{
		System.out.println(VariablesOne.a); // static variable can be called outside the same class in a non-static method by simply "ClassName.VariableName".
	
		System.out.print("********");
		System.out.print(" Seperator ");
		System.out.println("********");
		
		VariablesOne ref2 = new VariablesOne();
		System.out.println(ref2.b); // non-static variable can be called outside the same class in a non-static method by simply creating the object of the origin class.
	}
}
