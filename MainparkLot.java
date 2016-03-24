import java.util.Calendar;

public class MainparkLot {

	public static void main(String[] args) {
		
		
		for(long i = 0; i< constants.floors;i++)
		{
			FloorManager floorManager = new FloorManager(i);
		}
		
	    Gate gate = new Gate();
		Gate.CheckIn("Madhu1", "TN1578", "8805217832");
		gate.CheckIn("madhu2", "KS1234", "7895637485");
		
		gate.CheckIn("madhu3", "kdfdg", "56477123844");
		gate.CheckIn("madhu4", "kdfdg", "56477123844");
		gate.CheckIn("madhu5", "kdfdg", "56477123844");
		gate.CheckIn("madhu6", "kdfdg", "56477123844");
		
		long interval = Gate.Checkout(3); System.out.println("int" + interval);
		gate.Checkout(5);
	}
}
