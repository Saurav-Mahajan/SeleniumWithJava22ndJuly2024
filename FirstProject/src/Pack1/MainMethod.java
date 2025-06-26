package Pack1;

public class MainMethod {
	
	public static void main(String[] args) {
		
		RegularMethod nonStaticMethodInMainMethodClass = new RegularMethod(); // Inorder to call non-static method outside the class from where it is originally defined, object of the original class needs to be created.
		nonStaticMethodInMainMethodClass.nonStaticMethod();
		
		RegularMethod.staticMethod(); // Inorder to call static method outside the class from where it is originally defined, use code "ClassName.MethodName();" where "ClassName" is the original class name. 
		
	}

}
