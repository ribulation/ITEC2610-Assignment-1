public abstract class BaseMembership {
	
	String name;
	String type;
	
	/**
	 *Constructor to set the name and type
	 */
	public BaseMembership(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	/**
	 *Accessor to return the member's name
	 *@return(name)
	 */
	public String getName() {
		return name;
	}
	
	/**
	 *Accessor to return the membership type
	 *@return(type)
	 */
	 public String getType() {
		 return type;
	 }
	 
	/**
	*Abstract method to be overridden in subclasses
	*/	 
	 public abstract boolean isValid();
	 
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
