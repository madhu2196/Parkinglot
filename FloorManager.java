
public class FloorManager {
	
	private  long floor_no;
	
	public FloorManager(long floor_no) {
		super();
		this.floor_no = floor_no;
	}
	public long getFloor_no() {
		return floor_no;
	}
	public void setFloor_no(long floor_no) {
		this.floor_no = floor_no;
	}
	
	public String send_to_row_column(long id)
	{
		Vehicle v = ParkingLotData.getId_Billing().get(id);
		String directions = new String();
		Slot s = ParkingLotData.getOccupied_Slots().get(v);
		long row_no = s.getRow_no();
		long colum_no = s.getColum_no();
		if(row_no == 0 && colum_no == 0)
		{
			directions = " park here ";
		}
		if(row_no != 0)
		{
			while(row_no != 0)
			{
				directions += " straight ";
				row_no--;
			}
		}
		int count = 0;
		if(colum_no != 0)
		{ 
			while(colum_no !=0)
			{
				if(count == 0)
				{
					directions += "turn right ";
					count = 1;
				}
			directions += "straight ";
			colum_no --;
		
			}	
		}
			return directions;	
	}

}
