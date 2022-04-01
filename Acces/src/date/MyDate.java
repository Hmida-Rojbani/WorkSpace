package date;

public class MyDate {
	
	public byte day;
	private byte month;
	private byte year;
	private String monthName;
	public MyDate(int day, int month, int year) {
		super();
		setDay(day);
		setMonth(month);
		this.year = (byte) year;
	}
	@Override
	public String toString() {
		return "MyDate [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		if(day > 31 || day < 1)// Guard Condition
			this.day = 1;
		else
			this.day = (byte)day;
	}
	
	public void setMonth(int month) {
		if(month > 12 || month < 1 )
			this.month = 1;
		else 
			this.month = (byte) month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = (byte) year;
	}
	public int getMonth() {
		return month;
	}
	
	
}
