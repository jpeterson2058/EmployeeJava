
public class EmployeePayTest 
{
	public static void main(String[] args) 
	{
		SalaryEmployee salaryEmployee = 
				new SalaryEmployee(new Name("Tony", "Starks"), new Address(), new Date(), 5000);
        /*		
        HourlyEmployee hourlyEmployee = 
				new HourlyEmployee("Johnny", "Blaze", null, 20, 40);
		HourlyEmployee hourlyEmployeeO = 
				new HourlyEmployee("Bobby", "Digital", null, 50,60);
        */

		System.out.println("Employee Data and Pay:");
		
		System.out.printf(salaryEmployee.name.toString() + " earned $%.2f\n\n", 
				salaryEmployee.earnings());
		/*
        System.out.printf("$%,. 2f\n\n", hourlyEmployee, "earned",
				hourlyEmployee.earnings());
		System.out.printf("$%,. 2f\n\n", hourlyEmployee, "earned",
				hourlyEmployee.earnings());
		Employee employees[] = new Employee[3];
	
		employees[0] = salaryEmployee;
		employees[1] = hourlyEmployee;
		employees[2] = hourlyEmployee;
		
		System.out.println("Employee Payment Processing:");
		
		for(Employee currentEmployee : employees)
		{
			System.out.println(currentEmployee);
		}
		
	
	for(int j = 0; j< employees.length; j++)
		System.out.printf("Employee %d", j, employees[j].getClass().getName());

    */
	}
}
