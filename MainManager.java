
public class MainManager {

	
	
	public static FloorManager[] floorManager = new FloorManager[(int) constants.floors];
	static
	{
		for(int i = 0 ; i<constants.floors; i++)
		{
			floorManager[i] = new FloorManager(i);
		}
	}
	
	public static String send_to_floor(long id)
	{
		Vehicle v = ParkingLotData.getId_Billing().get(id);
		String directions = new String();
		Slot s = ParkingLotData.getOccupied_Slots().get(v);
		long floor_no = s.getFloor_no();
		if(floor_no == 0)
		{
			directions = "Stay on this floor ";
		}
		else if(floor_no != 0)
		{
			directions = "Go to " + floor_no + " floor number " ;
		}
		return directions;
	}
	 public static FloorManager getfloormanager(long id)
	 {
		 
		 Vehicle v = ParkingLotData.getId_Billing().get(id);
		 Slot s = ParkingLotData.getOccupied_Slots().get(v);
		 long floor_no = s.getFloor_no();
		 return floorManager[(int) floor_no];
		 
	 }
	

}
