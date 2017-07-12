/** This class represents the Date object for the employee project
 *  
 * @author joshuapeterson
 *
 */


public class Date 
{
	/** Instance variables that live inside the Date object.*/
	private int hireMonth;
	private int hireDay;
	private int hireYear;

/** This is a two argument constructor that initializes the instance variables
 * inside the new Date object.
 * @param newhireMonth
 * @param newhireDay
 * @param newhireYear
 */
public Date (int newhireMonth, int newhireDay,int newhireYear)
{
	hireMonth = newhireMonth;
	hireDay = newhireDay;
	hireYear = newhireYear;
}

/** This is a copy constructor that constructs a new Date object that is a
 * copy of the existing Date object.  The Date object is passed as an argument.
 */
public Date (Date otherDate)
{
	hireMonth = otherDate.hireMonth;
	hireDay = otherDate.hireDay;
	hireYear = otherDate.hireYear;
	}

public Date ()
{
	hireMonth = 0;
	hireDay = 0;
	hireYear = 0;
}


/**Implementing Getter method which provides public, indirect access to values
 * inside the private instance variables.
 */
public int getHireMonth()
{
	return hireMonth;
}

public int getHireDay()
{
	return hireDay;
}

public int getHireYear()
{
	return hireYear;
}


/**Implementing Setter method which allows the user the set new values for each of
 * the instance variables.
 */

public boolean setHireMonth(int newHireMonth)
{
	if (hireMonth>=1 || hireMonth<=12)
	{
		hireMonth = newHireMonth;
		return true;
	}
	return false;
}

public boolean setHireDay(int newHireDay)
{
	if (hireDay>=1 || hireDay<=31)
	{
		hireDay = newHireDay;
		return true;
	}
	return false;
}

public boolean setHireYear(int newHireYear)
{
	if (hireYear>=1900 || hireYear<=2020)
	{
		hireYear = newHireYear;
		return true;
	}
	return false;
	}

public String toString()
{
		return "Month:" + " " + hireMonth + "Day:" + " " + hireDay
				+ " Year:" + " " + hireYear;
		}
}



	

