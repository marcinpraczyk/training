
public class Time {
	private int hour;
	private int minute;
	private int second;
	
	public void setTime (int h, int m, int s)
	{
		hour = ( (h >= 0) && (h <= 23) ? h : 0);
		minute = ( (m >= 0) && (m <= 59) ? m : 0);
		second = ( (s >= 0) && (s <= 59) ? s : 0);
	}
	
	public String toString()
	{
		return String.format("%02d:%02d:%02d", hour, minute, second) ;
	}
	
	public String getMilitaryTime()
	{
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	
	public String toAmericanTime()
	{
		return String.format("%02d:%02d:%02d %s", ( (hour==0 || hour==12) ? 12 : hour%12 ) , minute , second , ( (hour<12) ? "AM" : "PM" ) );
	}
	
}
