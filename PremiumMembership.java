import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PremiumMembership extends BaseMembership {
	
	String startDateString;
	/**
	 *Constructor to set the name date of when their
	 *membership started
	 */
	public PremiumMembership(String name, String startDateString) {
		super(name, startDateString);
		this.startDateString = startDateString;
	}
	
	/**
	 *Method to convert a string type date to a date type
	 *@param(dateString, the converted string date to a Date type)
	 *@return(Date object type of dateString)
	 */	
	private static Date stringToDate(String dateString) {
		DateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date= f.parse(dateString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	
	/**
	 *Checks if membership is still valid
	 *Membership is valid if startDate is after current time
	 *and before the valid time (valid time is 1 year after current time)
	 *@param(startDateString, a string type variable that represents the date
	 *of the membership)
	 *@return(true if valid, false if not valid)
	 */	
	public boolean isValid() {
		Date memberTime = stringToDate(startDateString);
		Date validTime = new Date();
		Date currentTime = new Date();
		validTime.setYear(validTime.getYear()+1);
		if (memberTime.after(currentTime) && memberTime.before(validTime)) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 *Checks if equipment is allowed for this membership
	 *@return(returns true)
	 *returns false if membership is not valid)
	 */
	 public boolean equipmentAllowed() {
		 return true;
	 }
	 
	/**
	*Checks if classes are allowed for this membership
	*@return(returns false)
	*/	 
	 public boolean classesAllowed() {
		 return false;
	 }

	/**
	*Checks if pool is allowed for this membership
	*@return(returns true)
	*/
	 public boolean poolAllowed() {
		 return true;
	 }

}
