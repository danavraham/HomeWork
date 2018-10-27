package Clock;

public class SimpleTime {

	// -------------PROPERTIES-------------
	private int hour;
	private int minute;
	private int second;

	// -----------CTOR's------------
	// -----------Default CTOR------------
	public SimpleTime() {

		this.hour = 0;
		this.minute = 0;
		this.second = 0;
	}

	// -----------CTOR------------
	public SimpleTime(int hour, int minute, int second) {
		super();
		this.hour = setHour(hour);
		;
		this.minute = setMinute(minute);
		this.second = setSecond(second);
	}

	// -----------G&S's------------

	public int getHour() {
		return hour;
	}

	public int setHour(int hour) {
		this.hour = (hour >= 0 && hour <= 23) ? hour : 0;
		return this.hour;
	}

	public int getMinute() {
		return minute;
	}

	public int setMinute(int minute) {
		this.minute = (minute >= 0 && minute <= 59) ? minute : 0;
		return this.minute;
	}

	public int getSecond() {
		return second;
	}

	public int setSecond(int second) {
		this.second = (second >= 0 && second <= 59) ? second : 0;
		return this.second;
	}

	// -----------------METHOD's

	public void setTime(int setHour, int setMinute, int setSecond) {
		this.hour = setHour(setHour);
		this.minute = setMinute(setMinute);
		this.second = setSecond(setSecond);
//		System.out.println("Time is now set to: " + toString());
	}

	public int addHour(int addHour) {
		if (getHour() + addHour > 23) {
			setHour(getHour() + addHour - 24);
		} else {
			setHour(getHour() + addHour);
		}
//		System.out.println("Time is now set to: " + toString());
		return getHour();
	}

	public int addMinute(int addMinute) {
		if (getMinute() + addMinute > 59) {
			addHour((getMinute() + addMinute) / 60);
			setMinute((getMinute() + addMinute) % 60);
		} else {
			setMinute(getMinute() + addMinute);
		}
//		System.out.println("Time is now set to: " + toString());
		return getMinute();
	}

	public int addSecond(int addSecond) {
		if (getSecond() + addSecond > 59) {
			addMinute((getSecond() + addSecond) / 60);
			setSecond((getSecond() + addSecond) % 60);
		} else {
			setSecond(getSecond() + addSecond);
		}
//		System.out.println("Time is now set to: " + toString());
		return getSecond();
	}

	public void tick() {
		addSecond(1);
	}

	public void add(SimpleTime addTime) {
		System.out.println("----------------\nTime was: " + toString());
		setHour(addHour(addTime.hour));
		setMinute(addMinute(addTime.minute));
		setSecond(addSecond(addTime.second));
		System.out.println("Time is now set to: " + toString()+"\n----------------");
	}

	public boolean isEquals(SimpleTime isEqual) {
	
		return (isEqual.hour==getHour() && isEqual.minute==getMinute() && isEqual.second==getSecond());

	}

	@Override
	public String toString() {

		return ((hour > 9 ? hour : "0" + hour) + ":" + (minute > 9 ? minute : "0" + minute) + ":"
				+ (second > 9 ? second : "0" + second));
	}

}
