public enum Battle
{
	
	Legnica ("1241", "Polska", "Mongolia"),
	Grunwald ("1410", "Polska", "Zakon Krzyzacki"),
	Kircholm ("1605", "Polska", "Szwecja"),
	Kluszyn ("1610", "Polska", "Rosja"),
	Chocim ("1673", "Polska", "Imperium Ottomanskie"),
	Wieden ("1683", "Polska", "Imperium Ottomanskie");
	
	private final String year;
	private final String fighter1;
	private final String fighter2;
	
	Battle(String y, String f1, String f2)
	{
		year = y;
		fighter1 = f1;
		fighter2 = f2;
	}
	
	public String getYear()
	{
		return year;
	}
	
	public String getFighter1()
	{
		return fighter1;
	}
	
	public String getFighter2()
	{
		return fighter2;
	}
	
	public String toString()
	{
		return String.format("Miejsce: %s,\trok: %s\tstrona #1: %s,\tstrona #2: %s\n", this.name(), getYear(), getFighter1(), getFighter2());
	}
	
}
