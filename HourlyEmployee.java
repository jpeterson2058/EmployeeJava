
class HourlyEmployee extends Employee 
{
	/**Constructor
	 * 
	 * @param hourlyRate the employee's hourly pay rate
	 */

	private double wage; //establishes wage/hour
	private double hours;//establishes hours worked/week
	
	public HourlyEmployee(String firstName, String lastName, 
			double hourlyRate, double hoursWorked) 
	{
		super();
		setWage(hourlyRate); 
		setHours(hoursWorked); 
	}
	/** Setter & getter function for wages*/
	public void setWage(double hourlyWage)
	{
		wage = (hourlyWage<0.0) ? 0.0 : hourlyWage;
	}
	
	public double getWage()
	{
		return wage;
	}
	
	/** Setter & getter function for hours*/
	public void setHours(double hoursWorked)
	{
		hours = (hoursWorked) >=0.0 && (hoursWorked<=168.0) ?
				hoursWorked:0.0;
	}
	
	public double getHours()
	{
		return hours;
	}
	
	/**Calculate earnings.*/
	
	public double earnings()
	{
		if(getHours() <=40)
			return getWage() * getHours();
		else
			return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
	}
	
	public String toString()
	{
		return String.format("hourly employee: %s\n%s: $%,.2f; %s: %,.2f",
				super.toString(), "hourly wage" , getWage(),
				"hours worked", getHours());
	}

}
