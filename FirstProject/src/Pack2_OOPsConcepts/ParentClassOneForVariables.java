package Pack2_OOPsConcepts;

public class ParentClassOneForVariables {
	
	int A = 100;
	static int B = 200;
	
	public static void main(String[] args) 
	{
		System.out.println(B);
		
		ParentClassOneForVariables varOne = new ParentClassOneForVariables();
		System.out.println(varOne.A);
	}

}
