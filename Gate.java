import java.util.Calendar;


public class Gate {

   private static long id = 0;
  

   public static long CheckIn(String owner_name,String vehicle_number,String owner_contact)
	{
	  if(owner_name.isEmpty() || vehicle_number.isEmpty() || owner_contact.isEmpty() || owner_contact.length()!=10 
				|| owner_name.length() > 20 || vehicle_number.length()!= 6) return 0;
		else
		{
			
			id ++;
		Vehicle v = new Vehicle(owner_name,vehicle_number,owner_contact,System.currentTimeMillis());
		ParkingLotData.addVehicle(v,id);
		System.out.println(v.getOwner_name() + " " + v.getOwner_contact() + " " +  v.getVehicle_number());
		
		
		System.out.println("current time "+ v.getInTime());
		return id;}
	}
   
   public static String send_to_floor(long idn)
   {
	   
	   return MainManager.send_to_floor(idn);
   }
   
   public static String send_to_row_column(long idn) {
	   
	   return MainManager.getfloormanager(idn).send_to_row_column(idn);
	
}
   
   public static long Checkout(long id)
   {
	  Vehicle leaving_vehicle = ParkingLotData.RemoveVehicle(id);
	  if(leaving_vehicle == null) return -1;
	  long t = (leaving_vehicle.getOutTime() - leaving_vehicle.getInTime())/1000;
	  
	  return t;
   }
   

	public static long getId() {
		return id;
	}

	public static void setId(long id) {
		Gate.id = id;
	}

}
