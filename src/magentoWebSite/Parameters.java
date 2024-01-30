package magentoWebSite;

import java.util.Random;

public class Parameters {
	Random rand = new Random();
	String[] firstNames = {"Alice", "Bob", "Charlie", "David", "Eva", "Frank", "Grace", "Harry", "Ivy", "Jack"};
	String [] lastNames= {"Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor"};
	String commonPassword= "Hello1999*";
	int randomIndex =rand.nextInt(10);
	int randEmailId=rand.nextInt(9999);
	
	

}
