package Access_Modifiers;

class Access_Modifier_default {
	
	/* Note -
	 
	 A. When any class has no access modifier type mentioned explicitly, it is considered to be 
	 <default> type.
	 B. <default> access modifier w.r.t. class simply means that, the class will only be accessible
	 throughout the same package in which the class resides and not throughout the entire project or
	 with different packages of the project.
	 C. If tried to access such class outside the package an error will be thrown.
	 
	 */
	
	public static void main(String[] args) 
	{
			System.out.println("This is the <default> access modifier type w.r.t. class");
	}

}
