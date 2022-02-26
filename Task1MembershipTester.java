public class Task1MembershipTester {
	public static void main(String[] args) {
		
		//creates a membership for John Doe
		//sets his name to "John Doe" and his visits to 5
		Membership JohnDoe = new Membership("John Doe", 5);
		System.out.println("A membership for John Doe has been created.\n" +
		"The name for this new membership is: " + JohnDoe.getName() + "\n" +
		"The number of remaining visits that this membership has are: " + JohnDoe.getRemainingVisits() + "\n");
		
		//creates a membership for Jane Doe
		//sets her name to "Jane Doe" and her visits to 0
		Membership JaneDoe = new Membership("Jane Doe", 0);
		System.out.println("A membership for Jane Doe has been created.\n" +
		"The name for this new membership is: " + JaneDoe.getName() + "\n" +
		"The number of remaning visits that this membership has are: " + JaneDoe.getRemainingVisits() + "\n");
		
		//shows whether or not John Doe's and Jane Doe's memberships are still valid
		System.out.println("John Doe's membership is still valid: " + JohnDoe.isValid());
		System.out.println("Jane Doe's membership is still valid: " + JaneDoe.isValid() + "\n");
		
		//top up John Doe's membership by 1
		System.out.println("John Doe's membership can be topped up: " + JohnDoe.topUp(1));
		System.out.println("John Doe's membership was topped up by 1");
		System.out.println("John Doe now has " + JohnDoe.getRemainingVisits() + " visits left \n");
		
		//Jane Doe's membership will not be topped up since a negative parameter is passed
		System.out.println("Jane Doe's membership can be topped up: " + JaneDoe.topUp(-1));
		System.out.println("Jane Doe's membership was not topped up because the topUp() method took a negative parameter \n");
		
		//check if the memberships can be charged
		System.out.println("John Doe's membership is valid: " + JohnDoe.isValid());
		System.out.println("John Doe's membership can be charged: " + JohnDoe.charge());
		System.out.println("John Doe's remaining visits are: " + JohnDoe.getRemainingVisits());
		System.out.println("Jane Doe's membership is valid: " + JaneDoe.isValid());
		System.out.println("Jane Doe's membership can be charged: " + JaneDoe.charge());
		System.out.println("Jane Doe's membership was not charged because it was not valid \n");
		
		//check if equipment and classes are allowed
		System.out.println("Equipment allowed for John Doe: " + JohnDoe.equipmentAllowed());
		System.out.println("Equiptment allowed for Jane Doe: " + JaneDoe.equipmentAllowed());
		System.out.println("Classes allowed for John Doe: " + JohnDoe.classesAllowed());
		System.out.println("Classes allowed for Jane Doe: " + JaneDoe.classesAllowed());
			
	}
}
