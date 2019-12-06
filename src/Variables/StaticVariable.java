package Variables;

public class StaticVariable {

	
	/* Static Variable

	1. Declared inside the class and Outside the method with Static Modifier.
	2. Scope is within the class
	3. .class loading memory allocated ------------ .class unloading memory destoyed.
	4. Stored non-heap.*/
	
	// Static Variable
	static int a = 5;
	static int b = 10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Static Area
		
		StaticVariable SV = new StaticVariable();
		

		System.out.println(a); // Way 1 - Directly
		System.out.println(b);
		
		
		System.out.println(StaticVariable.a); // Way 2 - Using ClassName
		System.out.println(StaticVariable.b);
		
		System.out.println(SV.a); // Way 3 - Using Object
		System.out.println(SV.b);
		
		SV.Method1();
		
	}

	void Method1(){
	// Instance Area
		
		System.out.println(StaticVariable.a); // Way 2
		System.out.println(StaticVariable.b);
		
		System.out.println(a);
		System.out.println(b);
	}
	
}
