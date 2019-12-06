package Variables;

public class InstanceVariable {

	
	/* Instance Variable 
	==========================

	1. Declared inside the class but outside the methods.
	2. Scope of variable is inside the class --- All methods, All constructors, All blocks.
	3. Memory is allocated when object is created  -- Object destroyed and memory is destroyed.
	4. Stored in heap memory.*/
	
	
	// Instance Variable
	public int  a= 100;
	int b = 200;
	protected int z = 30000;
	int x = 40;
	
		
	// Static Method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Static area
		InstanceVariable IV = new InstanceVariable();
		
		System.out.println(IV.a + IV.b);
		
		IV.Method1();
		IV.Method2();


	}
	
	
	// Instance Area
	void Method1(){
		
		System.out.println(a+b);
	}
	
	
	void Method2()
	{
		System.out.println(a*b);
	}
	
}
