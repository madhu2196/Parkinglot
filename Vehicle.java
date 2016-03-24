import java.sql.Time;
import java.util.Calendar;

public class Vehicle {

	private String owner_name;
	private String vehicle_number;
	private String owner_contact;
	private long inTime;
	

	public String getOwner_name() {
		return owner_name;
	}

	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}

	public String getVehicle_number() {
		return vehicle_number;
	}

	public void setVehicle_number(String vehicle_number) {
		this.vehicle_number = vehicle_number;
	}

	public String getOwner_contact() {
		return owner_contact;
	}

	public void setOwner_contact(String owner_contact) {
		this.owner_contact = owner_contact;
	}

	public long getInTime() {
		return inTime;
	}

	

	public long getOutTime() {
		return outTime;
	}

	public void setOutTime(long outTime) {
		this.outTime = outTime;
	}
	
	public void setInTime(long inTime) {
		this.inTime = inTime;
	}

	public long outTime;
	
	public Vehicle(String owner_name, String vehicle_number,
			String owner_contact, long inTime) 
	{
		super();
		this.owner_name = owner_name;
		this.vehicle_number = vehicle_number;
		this.owner_contact = owner_contact;
		this.inTime = inTime;
		this.outTime = 0;
		
	}


}
