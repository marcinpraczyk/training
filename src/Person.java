public class Person {

	private String name;
	private Date birthday;
	private static int members;
	
	public Person (String n, Date b)
	{
		name = n;
		birthday = b;
		members++;
		System.out.println(this);
	}
	
	public String toString()
	{
		return String.format("Hi %s! Your birthday is on %s. There are %d members in the club.", name, birthday, members);
	}
	
	public String getName()
	{
		return name;
	}

	public Date getBirthday()
	{
		return birthday;
	}
	
	public static int getMembers()
	{
		return members;
	}
	
}
