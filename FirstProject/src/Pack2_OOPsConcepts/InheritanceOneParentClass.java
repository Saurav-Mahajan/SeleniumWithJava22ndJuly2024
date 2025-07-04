package Pack2_OOPsConcepts;

public class InheritanceOneParentClass {
	
	public static void staticMethodOfParentClass ()
	{
		System.out.println("This is a static method of parent class");
	}
	
	public void nonStaticMethodOfParentClass ()
	{
		System.out.println("This is a non static method of a parent class");
	}
	
	public static void main(String[] args) 
	{
		staticMethodOfParentClass();
		
		InheritanceOneParentClass objectOne = new InheritanceOneParentClass();
		objectOne.nonStaticMethodOfParentClass();
		
	}

}
