public class Task2MembershipTester {
	public static void main(String[] args) {
		
		//creates a standard membership for John Doe
		//sets his name to "John Doe" and his visits to 5
		StandardMembership JohnDoe = new StandardMembership("John Doe", "Standard", 5);
		System.out.println("A Standard Membership for John Doe has been created.\n" +
		"The name for this new membership is: " + JohnDoe.getName() + "\n" +
		"The type of membership for John Doe is: + " + JohnDoe.getType() + "\n" +
		"The number of remaining visits that this membership has are: " + JohnDoe.getRemainingVisits() + "\n");
		
		//shows whether or not John Doe's and Jane Doe's memberships are still valid
		System.out.println("John Doe's membership is still valid: " + JohnDoe.isValid() + "\n");
		
		//top up John Doe's membership by 1
		System.out.println("John Doe's membership can be topped up: " + JohnDoe.topUp(1));
		System.out.println("John Doe's membership was topped up by 1");
		System.out.println("The number of remaining visits that this membership has are: " + JohnDoe.getRemainingVisits() + "\n");
		
		//John Doe's membership will not be topped up since a negative parameter is passed
		System.out.println("John Doe's membership can be topped up: " + JohnDoe.topUp(-1));
		System.out.println("John Doe's membership was not topped up because the topUp() method took a negative parameter \n");
		
		//check if the memberships can be charged
		System.out.println("John Doe's membership is valid: " + JohnDoe.isValid());
		System.out.println("John Doe's membership can be charged: " + JohnDoe.charge());
		System.out.println("John Doe's remaining visits are: " + JohnDoe.getRemainingVisits() + "\n");
		
		//creates a standard membership for John Doe
		//sets his name to "Jane Doe" and his visits to 0
		StandardMembership JaneDoe = new StandardMembership("Jane Doe", "Standard", 0);
		System.out.println("A Standard Membership for Jane Doe has been created.\n" +
		"The name for this new membership is: " + JaneDoe.getName() + "\n" +
		"The type of membership for Jane Doe is: " + JaneDoe.getType() + "\n" +
		"The number of remaining visits that this membership has are: " + JaneDoe.getRemainingVisits() + "\n");	
		//check if the memberships can be charged
		System.out.println("Jane Doe's membership is valid: " + JaneDoe.isValid());
		System.out.println("Jane Doe's membership can be charged: " + JaneDoe.charge());
		System.out.println("Jane Doe's membership was not charged because it was not valid \n");
		
		//check if equipment and classes are allowed
		System.out.println("Equipment allowed for John Doe: " + JohnDoe.equipmentAllowed());
		System.out.println("Equiptment allowed for Jane Doe: " + JaneDoe.equipmentAllowed());
		System.out.println("Classes allowed for John Doe: " + JohnDoe.classesAllowed());
		System.out.println("Classes allowed for Jane Doe: " + JaneDoe.classesAllowed() + "\n");
		
		//creates a standard membership for John Doe
		//sets his name to "Bob Doe" and his start date to Jan 1st 2022
		PremiumMembership BobDoe = new PremiumMembership("Bob Doe", "2022-01-1");
		System.out.println("A Premium Membership for Bob Doe has been created.\n" +
		"The name of this new membership is: " + BobDoe.getName() + "\n" +
		"The type of this start date of this membership is: " + BobDoe.getType() +"\n");
		
		//checks if Bob Doe's premium membership is valid
		System.out.println("Bob Doe's Membership is valid: " + BobDoe.isValid());
		System.out.println("Bob Doe's membership is still valid because it was made less than 1 year from the current date \n");
		
		//creates a standard membership for Ben Doe
		//sets his name to "Ben Doe" and his start date to jan 1st 2015
		PremiumMembership BenDoe = new PremiumMembership("Ben Doe", "2022-02-25");
		System.out.println("A Premium Membership for Ben Doe has been created.\n" +
		"The name of this new membership is: " + BenDoe.getName() + "\n" +
		"The type of this start date of this membership is: " + BenDoe.getType() +"\n");
		
		//checks if Ben Doe's premium membership is valid
		System.out.println("Ben Doe's Membership is valid: " + BenDoe.isValid());
		System.out.println("Ben Doe's membership is still valid because it was made more than 1 year from the current date \n");
		
		System.out.println("Equipment allowed for Bob Doe: " + BobDoe.equipmentAllowed());
		System.out.println("Classes allowed for Bob Doe: " + BobDoe.classesAllowed());
		System.out.println("Classes are not allowed for Bob Doe because he has a premium membership, which do not allow classes");
		System.out.println("Pool allowed for Bob Doe: " + BobDoe.poolAllowed());
		System.out.println("Pool allowed for Bob Doe because he has a premium membership, which allows the pool\n");
		
	}
}
