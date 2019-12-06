package Operators;

import Variables.InstanceVariable;

public class ArithmeticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 25;
		int b = 20;
		
		int Results = a+b;
		System.out.println("A + B = "+ Results);
		
		
		Results = a-b;
		System.out.println("A - B = "+ Results);
		
		
		Results = a*b;
		System.out.println("A x B = "+ Results);
		
		
		Results = b/a;
		System.out.println("B / A = "+ Results);
		
		
		Results = a%10;
		System.out.println("A % 10 ="+ Results);
		
	}

}