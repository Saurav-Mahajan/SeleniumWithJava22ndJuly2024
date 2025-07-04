package Pack2_OOPsConcepts;

public class InheritanceTwoChildClassTwo extends InheritanceTwoChildClassOne {
	
	public static void main(String[] args) 
	{
		staticMethodOfParentClass();
		
		InheritanceTwoChildClassTwo objectThree = new InheritanceTwoChildClassTwo();
		objectThree.nonStaticMethodOfParentClass();
	}

}
