package DecisionMaking;

public class NestedIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Value = 4;
		
		int Results = 3;
		
		if(Value == 5){
			
			if(Results == 3){
				
				System.out.println("Balaji");
				
			} else {
				
				System.out.println("Bobby");
			}
						
		} else if (Value == 8){
			
			System.out.println("Jagadish");
			
		} else if(Value == 5){
			
			System.out.println("Karthik");
		} else if (Value == 4){
			
			if(Results == 3){
				
				System.out.println("Mohan");
				
			} else if (Results == 5){
				
				System.out.println("Karthik");
			}
			
			
		} else {
			
			System.out.println("No Match");
		}
		
	}

}
