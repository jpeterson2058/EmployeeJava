/** This class represents the Address object for the employee project
 *  
 * @author joshuapeterson
 *
 */


public class Address 
{
	/** Instance variables that live inside the Address object.*/
	private String streetAddress;
	private String cityAddress;
	private String stateAddress;
	private int zipAddress;


/** This is a two argument constructor that initializes the instance variables
 * inside the new Address object.
 * @param newstreetAddress
 * @param newcityAddress
 * @param newstateAddress
 * @param newzipAddress
 */
public Address (String newstreetAddress, String newcityAddress,String newstateAddress,
		int newzipAddress)
{
	streetAddress = newstreetAddress;
	cityAddress = newcityAddress;
	stateAddress = newstateAddress;
	zipAddress = newzipAddress;
}

/** This is a copy constructor that constructs a new Address object that is a
 * copy of the existing Address object.  The Address object is passed as an argument.
 */
public Address (Address otherAddress)
{
	streetAddress = otherAddress.streetAddress;
	cityAddress = otherAddress.cityAddress;
	stateAddress = otherAddress.stateAddress;
	zipAddress = otherAddress.zipAddress;
	}

/**Implementing Getter method which provides public, indirect access to values
 * inside the private instance variables.
 */
public String getStreetAddress()
{
	return streetAddress;
}

public String getCityAddress()
{
	return cityAddress;
}

public String getStateAddress()
{
	return stateAddress;
}

public int getZipAddress()
{
	return zipAddress;
}


/**Implementing Setter method which allows the user the set new values for each of
 * the instance variables.
 */

public boolean setStreetAddress(String newStreetAddress)
{
	if(!isAllLetters(newStreetAddress))
	{
		return false;
	}
	streetAddress = newStreetAddress;
	return true;
}

private boolean isAllLetters(String newStreetAddress) {
	
	return false;
}

public boolean setCityAddress(String newCityAddress)
{
	if(!isAllLetters(newCityAddress))
	{
		return false;
	}
	cityAddress = newCityAddress;
	return true;
	}

public boolean setStateAddress(String newStateAddress)
{
	if(!isAllLetters(newStateAddress))
	{
		return false;
	}
	stateAddress = newStateAddress;
	return true;
	}

public String toString()
{
		return "Street Address:" + " " + streetAddress + "City:" + " " + cityAddress
				+ " State:" + " " + stateAddress + "Zip Code:" + " " + zipAddress;
		}
}

	
