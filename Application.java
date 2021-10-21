import java.text.DecimalFormat;

public class Application {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#");
		
		// Create an object of the Building class using the empty-argument
		// constructor
		Building myBuilding = new Building();
		// Use setters to set the instance variables of myBuilding
		myBuilding.setProjectName("Schoch Building");
		myBuilding.setCompleteAddress("123 Main St. | Louisville, KY 40219");
		myBuilding.setTotalSquareFeet(50000);
		myBuilding.setOccupancyGroup("Business");
		myBuilding.setSubgroup("Group B");
		
		System.out.println("--------------------------- Testing a new object "
				            +"---------------------------");
		// Test the getters for myBuilding - confirms setters as well
		System.out.println("Testing getters for myBuilding (confirms setters "+
						   "as well):\n"+"getProjectName returns: "
						   +myBuilding.getProjectName()+"\n"
						   +"getCompleteAddress returns: "
						   +myBuilding.getCompleteAddress()+"\n"
						   +"getTotalSquareFeet returns: "
						   +df.format(myBuilding.getTotalSquareFeet())+"\n"
						   +"getOccupancyGroup returns: "
						   +myBuilding.getOccupancyGroup()+"\n"
						   +"getSubgroup returns: "
						   +myBuilding.getSubgroup());
		
		// Test draw method for myBuilding
		System.out.println("\nTesting draw method for myBuilding:");
		myBuilding.draw();
		
		// Test displayData method for myBuilding
		System.out.println("\nTesting displayData method for myBuilding:");
		System.out.println(myBuilding.displayData());
		
		// Test toString method for myBuilding
		System.out.println("Testing toString method for myBuilding:");
		System.out.println(myBuilding.toString()+"\n");
		
		// Test the preferred constructor for the Building class
		Building myBuilding2 = new Building("Schoch Building2",
				"44 Harris St. | Kankakee, IL 00000",
				45000, "Business", "Group B");
		System.out.println("Testing preferred constructor for Building Class:");
		System.out.println(myBuilding2.displayData());
		
		// Create an object of the Business class using the empty argument
		// constructor
		Business myBusiness = new Business();
		// Use setters to set the instance variables of myBusiness
		myBusiness.setProjectName("myBusiness Building");
		myBusiness.setCompleteAddress("123 First St. | Lexington, KY 40219");
		myBusiness.setTotalSquareFeet(50000);
		myBusiness.setOccupancyGroup("Business");
		myBusiness.setSubgroup("Group B");
		myBusiness.setNumRentableUnits(20);
		
		System.out.println("--------------------------- Testing a new object "
							+"---------------------------");
		// Test the getters for myBusiness - confirms setters as well
		System.out.println("Testing getters for myBusiness (confirms setters "
							+"as well):\n"+"getProjectName returns: "
							+myBusiness.getProjectName()+"\n"
							+"getCompleteAddress returns: "
							+myBusiness.getCompleteAddress()+"\n"
							+"getTotalSquareFeet returns: "
							+df.format(myBusiness.getTotalSquareFeet())+"\n"
							+"getOccupancyGroup returns: "
							+myBusiness.getOccupancyGroup()+"\n"
							+"getSubgroup returns: "
							+myBusiness.getSubgroup()+"\n"
							+"getNumRentableUnits returns: "
							+myBusiness.getNumRentableUnits());
		
		// Test toString method for myBusiness
		System.out.println("Testing toString method for myBusiness:");
		System.out.println(myBusiness.toString()+"\n");
		
	}
	
}
