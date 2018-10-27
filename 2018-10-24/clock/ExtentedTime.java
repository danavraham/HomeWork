package Clock;

public class ExtentedTime extends SimpleTime {
	//---------------PROPERTIES------------------
	private boolean is24Hours;

	// -----------CTOR's------------
	// -----------Default CTOR------------
	
	public ExtentedTime() {
		super(0, 0, 0);
		this.is24Hours = true;
	}

	// -----------CTOR------------
	public ExtentedTime(int hour, int minute, int second, boolean is24Hours) {
		super(hour, minute, second);
		this.is24Hours = is24Hours;
	}

	// -----------G&S's------------
	public boolean isIs24Hours() {
		return is24Hours;
	}

	public void setIs24Hours(boolean is24Hours) {
		this.is24Hours = is24Hours;
	}

	// -----------------METHOD's------------
	@Override
	public String toString() {
		if(is24Hours) {
			return super.toString();
		}else {
			return ((getHour() < 12 ? +getHour() : getHour()-12) + ":" + (getMinute() > 9 ? getMinute() : "0" + getMinute()) + ":"
					+ (getSecond() > 9 ? getSecond() : "0" + getSecond()));
		}
		
	}
	
	
	
	
	
	
	

}
