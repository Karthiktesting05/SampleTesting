package Loops;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*> = Greaterthan
		< = Lessthan*/
		
		//The do-while loop : This executes a statement at least for one time.
		int x = 1500;
		
		do{
			System.out.println("Value of X is :"+ x);
			
			x++;
			
			if(x == 1500){
				break;
			}
			
		} while(x<=1500);
				
		
	}
	

}
