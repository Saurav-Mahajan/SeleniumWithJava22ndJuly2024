package Pack1;

public class BasicMathematicalOperations 
{
public static void main(String[] args) 
{
	byte var1 = -128;
	byte var2 = 127;
	
	short var3 = -32768;
	short var4 = 32767;
	
	float var5 = - 45689.4585F;
	float var6 = 45689.4585F;
	
	double var7 = - 45689.4585;
	double var8 =  45689.4585;
	
	boolean var9 = true;
	boolean var10 = false;
	
	char var11 = '$'; //any one alphanumeric character. 
	
	int Addition = var1 + var2;
	
	long subtraction = var3 - var4;
	
	float multiplication = var5 * var6;
	
	double division = var7 / var8;
	
	int Modulus = var1 % var2;
	
	
	System.out.println(Addition);
	System.out.println(subtraction);
	System.out.println(multiplication);
	System.out.println(division);
	System.out.println(var9);
	System.out.println(var10);
	System.out.println(var11);
	System.out.println(Modulus);
}

}
