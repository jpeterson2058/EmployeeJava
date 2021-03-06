import java.util.Scanner;

public class Employee
{
    protected Address address;
    protected Name name;
    protected Date date;
 
    public Employee(Name myName, Address myAddress, Date myDate)
    {
        name    = myName;
        address = myAddress;
        date    = myDate;
    }

    public Employee() {};

    public static void main(String[]args)
	{
		int employeeNumber = 0;
		/**String Name.*/
		String name = ""; 
		int hireMonth = 0;
		int hireDay = 0;
		int hireYear = 0;			
		
		Scanner input = new Scanner(System.in);
    	
		/**Prompt user to enter the number of employee records.*/
        System.out.println("Enter Number of Records to Create:");
        int numofEmployees = input.nextInt();
        Employee[] employees = new Employee[numofEmployees];
        	
        /**Read in the data from each of the employees.*/
        for(int i = 0; i <numofEmployees; i++)
        {
            employees[i] = new Employee();

        	System.out.println("Enter Employee Number:");
        	int employeeID = input.nextInt();
        	input.nextLine();
        		
        	System.out.println("Enter Employee First Name:");
        	String firstName = input.nextLine();
        		
        	System.out.println("Enter Employee Last Name:");
        	String lastName = input.nextLine();
        	
        	employees[i].name = new Name(firstName,lastName);

        	System.out.println("Enter Street:");
        	String street = input.nextLine();

        	System.out.println("Enter City:");
            String city = input.nextLine();
            	
            System.out.println("Enter State:");
            String state = input.nextLine();
            	
            System.out.println("Enter Zip Code:");
            int zip = input.nextInt();
            
            employees[i].address = new Address(street, city, state, zip);
            // address = street + " " + city + " " + state + " " + zip;
            	
            System.out.println("Enter Hire Month Date (1-12):");
            int month = input.nextInt();
            	
            System.out.println("Enter Hire Day Date (1-31):");
            int day = input.nextInt();
            	
            System.out.println("Enter Hire Year Date (1900-2020):");
            int year = input.nextInt();
            
            employees[i].date = new Date(month, day, year);
            
            
            	
            input.nextLine();
            }

            /*System.out.println("Employee #:" + "  "  + employeeNumber + 
        		"Employee Name: " + " " + name + "Address: " + " " + address.toString());*/

        for(int i = 0; i <numofEmployees; i++)
        {
            System.out.println( employees[i].name.toString() + " " +
            employees[i].address.toString() + " " + employees[i].date.toString());
        }

	}
}
         	
            
        
        	
        	
        		
        	
        		
        	
        	
        	
        		
        	
        	

   
