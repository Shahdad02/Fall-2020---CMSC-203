
public class Employee {
	
	private String name;
	private int idNumber;
	private String department;
	private String position;
	
	public Employee (String n, int id, String dept, String pos)
	{
		name = n;
		idNumber = id;
		department = dept;
		position = pos;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getIdNumber()
	{
		return idNumber;
	}
	
	public String getDepartment()
	{
		return department;
	}
	
	public String getPosition()
	{
		return position;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	public void setIdNumber(int id)
	{
		idNumber = id;
	}
	
	public void setDepartment(String dept)
	{
		department = dept;
	}
	
	public void setPosition(String p)
	{
		position = p;
	}
	
	public String toString()
	{
		return "Name: " + name + "\nID Number: " + idNumber + "\nDepartment: " + department + "\nPosition: " + position;
	}

}
