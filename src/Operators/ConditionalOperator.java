package Operators;

public class ConditionalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 10;
		int y = 20;
		
		// AND && Both condition to be true = True
		
		// OR || either any condition to be true = True
		
		//NOT ! = Reverse the value
	
		//AND OPerator
		
		if ((x > 9) && (y > 8))	{
			
			System.out.println("Both X and Y Values are greater than 8");
		} 
		
		
		if ((x > 25) || (y < 30))	{
			
			System.out.println("Either X and Y Values are greater than 10");
		}

		
		boolean OK = false;
		
		System.out.println(OK);
		
		System.out.println(!OK);
		
		
		
	}

}
