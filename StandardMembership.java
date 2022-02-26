public class StandardMembership extends BaseMembership {

	int visits;
	/**
	 *Constructor to set the name, type, and number of visits
	 */
	public StandardMembership(String name, String type, int visits) {
		super(name, type);
		this.visits = visits;
	}

	/**
	 *Checks if membership is still valid
	 *if remaining visits are greater than 0, then valid
	 *else membership will be false
	 *@returns(returns true if visits >0,
	 *returns false if visits is negative)
	 */
	public boolean isValid() {
		if (visits > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 *An accessor to return the number
	 *of remaining visits.
	 *@return(visits)
	 */
	public int getRemainingVisits() {
		return visits;
	}

	/**
	 *Checks if membership can be topped up
	 *@param(additionalVisits, represnts the additional visits to be
	 *added to the remaning visits)
	 *@return(returns true if the additionalVisits parameter,
	 *returns false if additionalVisits is a negative number.)
	 */
	public boolean topUp (int additionalVisits) {
		if (additionalVisits >= 0) {
			visits = visits + additionalVisits;
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 *checks if membership can be charged
	 *decreases visits by 1
	 *@return(returns true if membership is still valid,
	 *returns false if membership is not valid)
	 */	
	public boolean charge() {
		if (isValid() == true) {
			visits = visits - 1;
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
	 *@return(returns true)
	 */		
	public boolean classesAllowed() {
		return true;
	}
	
}
