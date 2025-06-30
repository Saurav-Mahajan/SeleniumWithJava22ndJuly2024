package Pack1;

public class MethodCategoriesOne {
	
	//Method Category One - Method with argument.
	
	public void nonStaticMethod (int a, int b, int c) // Argument - input given to the method.
	{
		int addition = a + b + c;
		System.out.println(addition);
	}
	
	public static void main(String[] args) {
		
		MethodCategoriesOne objectToCallNonStaticMethod = new MethodCategoriesOne();
		
		objectToCallNonStaticMethod.nonStaticMethod(50, 90, 30);
		
	}

}
