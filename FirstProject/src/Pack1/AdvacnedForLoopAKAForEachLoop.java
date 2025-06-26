package Pack1;

public class AdvacnedForLoopAKAForEachLoop {
	
	/* Syntax
	
	for (dataType variableName: dataStructure)
	{
	     code to be repeated;
	}
	
	 */
	
	public static void main(String[] args) 
	{
		System.out.println("Before For Each Loop");
		
		int [] arrayOne = {100,80,60,40,20,0};
		
		for (int a : arrayOne)
		{
			System.out.println("For Each Loop Executed : " +a);
		}
	
		System.out.println("After For Each Loop");
		
	}

}
