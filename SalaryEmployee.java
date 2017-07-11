import java.util.Set;

public class SalaryEmployee extends Employee 
{
	private double weeklySalary;

	public SalaryEmployee(String firstName, String lastName, double salary) 
	{
		super ();
		setWeeklySalary(salary);
	}
	
	public void setWeeklySalary(double salary) 
	{
		weeklySalary = salary <0.0 ? 0.0 : salary;
	}
	public double getWeeklySalary()
	{
		return weeklySalary;
	}
	
	public double earnings()
	{
		return getWeeklySalary();
	}
	
	public String toString()
	{
		return String.format("salaried employee: %s\n%s: $%,. 2f",
				super.toString(), "weekly salary", getWeeklySalary() );
	}

}
