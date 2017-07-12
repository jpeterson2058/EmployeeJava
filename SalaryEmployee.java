

public class SalaryEmployee extends Employee 
{
	/**Constructor
	 * 
	 * @param hourlyRate the employee's weekly salary
	 */
	private double weeklySalary; //Establishes weekly salary

	public SalaryEmployee(Name name, Address address, Date date, double salary) 
	{
		super(name, address, date);
		setWeeklySalary(salary);
	}
	

	/** Setter & getter function for salary*/
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
		return "salaried employee:" + super.toString();
	}

}
