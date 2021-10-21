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
		
		System.out.println("-------------------------- Testing Building class"
				            +" -------------------------");
		// Test the getters/setters for myBuilding - confirms setters as well
		System.out.println("Testing getters/setters for myBuilding (setters "
						   +"were used for initiation):\n"
						   +"getProjectName returns: "
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
		System.out.println();
		System.out.println("Testing draw method for myBuilding:");
		myBuilding.draw();
		
		// Test toString method for myBuilding
		System.out.println();
		System.out.println("Testing toString method for myBuilding:");
		System.out.println(myBuilding.toString());
		
		// Test the preferred constructor and displayData method for the Building class
		Building myBuilding2 = new Building("Schoch Building2",
				"44 Harris St. | Kankakee, IL 00000",
				45000, "Business", "Group B");
		System.out.println();
		System.out.println("Testing preferred constructor and displayData "
							+"method for Building Class:");
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
		
		System.out.println();
		System.out.println("-------------------------- Testing Business class"
							+" --------------------------");
		// Test the getters for myBusiness - confirms setters as well
		System.out.println("Testing getters/setters for myBusiness (setters "
				   			+"were used for initiation):\n"
				   			+"getProjectName returns: "
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
		
		// Test the preferred constructor and the toString method for
		// the Business class
		Business myBusiness2 = new Business("myBusiness2",
				"123 First St. | Lexington, KY 40219",
				50000, "Business", "Group B", 20);
		System.out.println();
		System.out.println("Testing preferred constructor and toString method "
							+"for Business class:");
		System.out.println(myBusiness2.toString());
		
		// Create an object of the Mall class using the empty-argument
		// constructor
		Mall myMall = new Mall();
		// Use setters to set the instance variables of myMall
		myMall.setProjectName("myMall");
		myMall.setCompleteAddress("123 Elm St. | Louisville, KY 40219");
		myMall.setTotalSquareFeet(46000);
		myMall.setOccupancyGroup("Business");
		myMall.setSubgroup("Group B");
		myMall.setNumRentableUnits(20);
		myMall.setNumRentedUnits(18);
		myMall.setMedianUnitSize(2300);
		myMall.setNumParkingSpaces(200);
		
		System.out.println();
		System.out.println("-------------------------- Testing Mall class"
				            +" -------------------------");
		// Test the getters for myMall - confirms setters as well
		System.out.println("Testing getters/setters for myBusiness (setters "
				   		    +"were used for initiation):\n"
				   		    +"getProjectName returns: "
						    +"getCompleteAddress returns: "
						    +myMall.getCompleteAddress()+"\n"
						    +"getTotalSquareFeet returns: "
						    +df.format(myMall.getTotalSquareFeet())+"\n"
						    +"getOccupancyGroup returns: "
						    +myMall.getOccupancyGroup()+"\n"
						    +"getSubgroup returns: "
						    +myMall.getSubgroup()+"\n"
						    +"getNumRentableUnits returns: "
						    +myMall.getNumRentableUnits()+"\n"
						    +"getMedianUnitSize returns: "
						    +myMall.getNumRentedUnits()+"\n"
						    +"getMedianUnitSize returns: "
						    +myMall.getMedianUnitSize()+"\n"
						    +"getNumParkingSpaces returns: "
						    +myMall.getNumParkingSpaces()
						    );
		
		// Test draw method for myMall
		System.out.println();
		System.out.println("\nTesting draw method for myMall:");
		myMall.draw();
		
		// Test toString method for myMall
		System.out.println();
		System.out.println("Testing toString method for myMall:");
		System.out.println(myMall.toString()+"\n");
		
		// Test the preferred constructor and the displayData method for
		// the Mall class
		Mall myMall2 = new Mall("myMall2",
				"123 Elm St. | Louisville, KY 40219",
				46000, "Business", "Group B", 20, 18, 2300, 200);
		System.out.println();
		System.out.println("Testing preferred constructor and displayData "
							+"methodfor Mall Class:");
		System.out.println(myMall2.displayData());
		
	}//end main
	
}//end class