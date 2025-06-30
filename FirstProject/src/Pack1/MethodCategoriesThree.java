package Pack1;

public class MethodCategoriesThree {
	
	//Method Category Three - Method with return type.
	
	public int nonStaticMethod ()
	{
		int Multipication = 100 * 10;
		
		return Multipication;
	}
	
	public static void main(String[] args) {
		
		MethodCategoriesThree objectToCallNonStaticMethod = new MethodCategoriesThree();
		
		int varOne = objectToCallNonStaticMethod.nonStaticMethod();
		System.out.println(varOne);
		
	}

}
