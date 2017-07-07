import java.util.Scanner;

public class Employee
{
	public static void main(String[]args)
	{
		int employeeNumber = 0;
		/**String Name.*/
		String name = ""; 
		String address = " ";
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
        	System.out.println("Enter Employee Number:");
        	int employeeID = input.nextInt();
        		
        	System.out.println("Enter Employee First Name:");
        	String firstName = input.nextLine();
        		
        	System.out.println("Enter Employee Last Name:");
        	String lastName = input.nextLine();
        	
        	name = firstName + " " + lastName;
        		
        	System.out.println("Enter Street:");
        	String street = input.nextLine();
        		
        	System.out.println("Enter City:");
            String city = input.nextLine();
            	
            System.out.println("Enter State:");
            String state = input.nextLine();
            	
            System.out.println("Enter Zip Code:");
            String zip = input.nextLine();
            
            address = street + " " + city + " " + state + " " + zip;
            	
            System.out.println("Enter Hire Month Date (1-12):");
            int month = input.nextInt();
            	
            System.out.println("Enter Hire Day Date (1-31):");
            int day = input.nextInt();
            	
            System.out.println("Enter Hire Year Date (1900-2020):");
            int year = input.nextInt();
            
            
            	
            input.nextLine();
            }
        System.out.println("Employee #:" + "  "  + employeeNumber + 
        		"Employee Name: " + " " + name + "Address: " + " " + address);
	}
}

         	
            
        
        	
        	
        		
        	
        		
        	
        	
        	
        		
        	
        	

   