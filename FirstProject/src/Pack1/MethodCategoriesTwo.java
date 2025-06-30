package Pack1;

public class MethodCategoriesTwo {
	
	//Method Category Two - Method with argument and return type.
	
	public int nonStaticMethod (int a, int b) // Argument - input given to the method.
	{
		int subtraction = a - b;
		
		return subtraction;
	}
	
	public static void main(String[] args) {
		
		MethodCategoriesTwo objectToCallNonStaticMethod = new MethodCategoriesTwo();
		
		int varOne = objectToCallNonStaticMethod.nonStaticMethod(100, 20);
		System.out.println(varOne);
		
	}

}
