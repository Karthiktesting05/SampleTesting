package Variables;

public class LocalVariable {

	   /* Local Variable:
		================================
		1. Declared inside the method or construtor or blocks.
		2. Scope of variable is with in the method
		3. Stored in the Stack
		4. Example:*/

	
	// Static Method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalVariable obj = new LocalVariable();
		
		obj.Method1();
		obj.Method2();
		
	}

	// Memory allocated when method starts
	 void Method1(){ 
		// Local Variable
		int a = 100;
		int b = 2000;
		System.out.println(a + b); // Possible
	}
	
	//Memory Released when method ends
	void Method2(){
		int a = 20;
		int b = 40;
		System.out.println(a + b); // Possible
	}
	
}
