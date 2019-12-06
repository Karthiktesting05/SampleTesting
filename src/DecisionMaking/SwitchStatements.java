package DecisionMaking;

public class SwitchStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ticketprice = 50;

		switch (ticketprice) {

		case 250:
			System.out.println("750 to 1000 seat Numbers are enabled");
			break;

		case 150:
			System.out.println("500 to 750 seat Numbers are enabled");
			break;

		case 100:
			System.out.println("250 to 500 seat Numbers are enabled");
			break;

		case 50:
			System.out.println("0 to 250 seat Numbers should be enabled");
			break;

		default:
			System.out.println("There should be a error in the ticket price");
			break;

		}

	}

}
