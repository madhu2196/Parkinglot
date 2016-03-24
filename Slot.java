
public class Slot {

	private long floor_no;
	public long getFloor_no() {
		return floor_no;
	}
	public void setFloor_no(long floor_no) {
		this.floor_no = floor_no;
	}
	public long getRow_no() {
		return row_no;
	}
	public void setRow_no(long row_no) {
		this.row_no = row_no;
	}
	public long getColum_no() {
		return colum_no;
	}
	public void setColum_no(long colum_no) {
		this.colum_no = colum_no;
	}
	private long row_no;
	private long colum_no;
	public Slot(long floor_no, long row_no, long colum_no) {
		super();
		this.floor_no = floor_no;
		this.row_no = row_no;
		this.colum_no = colum_no;
	}
	
	
}
