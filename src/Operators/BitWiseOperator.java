package Operators;

public class BitWiseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		//<< Left Shift Means Multiple value by 2
		//>> Right Shit Mean Divide value by 2.
		
		int x = 50;
		System.out.println("Before Left Shift :"+ x);
	
		int Results = x << 5; //40 output
		System.out.println("After Left Shift :"+ Results);
		
		Results = x >> 2; //2.5
		System.out.println("After Right  Shift :"+ Results);
		
		
	}
	
}
