/** This class represents the name object for the employee project
 *  
 * @author joshuapeterson
 *
 */


public class Name 
{
	/** Instance variables that live inside the Name object.*/
	private String lastName;
	private String firstName;


/** This is a two argument constructor that initializes the instance variables
 * inside the new Name object.
 * @param newLastName
 * @param newFirstName
 */
public Name (String newLastName, String newFirstName)
{
	firstName = newFirstName;
	lastName = newLastName;
	
}

/** This is a copy constructor that constructs a new Name object that is a
 * copy of the existing Name object.  The Name object is passed as an argument.
 */
public Name (Name otherName)
{
	lastName = otherName.lastName;
	firstName = otherName.firstName;
	}

/**Implementing Getter method which provides public, indirect access to values
 * inside the private instance variables.
 */
public String getLastName()
{
	return lastName;
}

public String getFirstName()
{
	return firstName;
}

/**Implementing Setter method which allows the user the set new values for each of
 * the instance variables.
 */

public boolean setLastName(String newLastName)
{
	if(!isAllLetters(newLastName))
	{
		return false;
	}
	lastName = newLastName;
	return true;
}
private boolean isAllLetters(String newLastName) {
	
	return false;
}

public boolean setFirstName(String newFirstName)
{
	if(!isAllLetters(newFirstName))
	{
		return false;
	}
	firstName = newFirstName;
	return true;
	}

public String toString()
{
	return "First Name:" + " " + firstName + "Last Name:" + " " + lastName; 
}
}

	
