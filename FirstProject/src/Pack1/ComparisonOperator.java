package Pack1;

public class ComparisonOperator {

	public static void main(String[] args) {
		
		int a = 5; // Assignment Operator " = ". Used to assign a value to a variable. 
		int b = 5;
		
		boolean greaterThanOperator = (a > b);
		System.out.println(greaterThanOperator);
		
		boolean lessThanOperator = (a < b);
		System.out.println(lessThanOperator);
		
		boolean greaterThanOrEqualToOperator = (a >= b);
		System.out.println(greaterThanOrEqualToOperator);
		
		boolean lessThanOrEqualToOperator = (a <= b);
		System.out.println(lessThanOrEqualToOperator);
		
		boolean equalToOperator  = (a == b);
		System.out.println(equalToOperator);
		
		boolean notEqualYoOperator = (a != b);
		System.out.println(notEqualYoOperator);
		
		boolean logicalANDOperator = (greaterThanOrEqualToOperator) && (lessThanOperator);
		System.out.println(logicalANDOperator);
		
		boolean logicalOROperator = (greaterThanOrEqualToOperator) || (lessThanOperator);
		System.out.println(logicalOROperator);
		
	}
}
