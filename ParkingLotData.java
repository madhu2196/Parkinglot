
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;


public class ParkingLotData {
	  

	private static HashMap<Vehicle,Slot> Occupied_Slots;
	private static Queue<Slot> Available_Slots;
	private static HashMap<Long,Vehicle> Id_Billing;
	
	static 
	{
		
		Occupied_Slots = new HashMap<Vehicle,Slot>();
		Available_Slots = new LinkedList<Slot>();
		for(int i = 0; i<constants.floors;i++)
		{
			for(int j=0; j<constants.rows; j++)
			{
				for(int k =0; k<constants.columns; k++)
				{
					Slot s = new Slot(i,j,k);
					Available_Slots.add(s);
				}
			}
		}
		Id_Billing = new HashMap<Long,Vehicle>();
	}
	public  static void addVehicle(Vehicle v,long id)
	{
		Slot current = Available_Slots.remove();
		v.setInTime(System.currentTimeMillis());
		Occupied_Slots.put(v, current);
		Id_Billing.put(id,v);
		
	}
	
	
	public static void setId_Billing(HashMap<Long, Vehicle> id_Billing) {
		Id_Billing = id_Billing;
	}

	public static long getIDbyVehicleNumber(String vehicle_number)
	{
		for(long id : Id_Billing.keySet())
		{
			if(Id_Billing.get(id).getVehicle_number().compareTo(vehicle_number)==0)
			{
				return id;
			}
			
		}return -1;
	}
	public static Vehicle RemoveVehicle(long id)
	{
		Vehicle v = Id_Billing.get(id);
		if(v == null) return null;
		v.setOutTime(System.currentTimeMillis());
		Slot current = Occupied_Slots.get(v);
		Occupied_Slots.remove(v);
		Id_Billing.remove(id);
		Available_Slots.add(current);
		return v;
	}
	
	public static void setOccupied_Slots(HashMap<Vehicle, Slot> occupied_Slots) {
		Occupied_Slots = occupied_Slots;
	}

	public static void setAvailable_Slots(Queue<Slot> available_Slots) {
		Available_Slots = available_Slots;
	}

	public static HashMap<Vehicle, Slot> getOccupied_Slots() {
		return Occupied_Slots;
	}

	public static Queue<Slot> getAvailable_Slots() {
		return Available_Slots;
	}

	public static HashMap<Long, Vehicle> getId_Billing() {
		return Id_Billing;
	}
	

}
