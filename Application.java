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
<<<<<<< HEAD
		// Test the getters/setters for Building class - confirms setters as well
		System.out.println("Testing getters/setters for Building class "
						   +"(setters were used for initiation):\n"
=======
		// Test the getters/setters for myBuilding - confirms setters as well
		System.out.println("Testing getters/setters for myBuilding (setters "
						   +"were used for initiation):\n"
>>>>>>> 2c18a0b211a851fea108dd2ce62aaa7424108893
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
		
<<<<<<< HEAD
		// Test draw method for Building class
		System.out.println();
		System.out.println("Testing draw method for Building class:");
		myBuilding.draw();
		
		// Test toString method for Building class
		System.out.println();
		System.out.println("Testing toString method for Building class:");
=======
		// Test draw method for myBuilding
		System.out.println();
		System.out.println("Testing draw method for myBuilding:");
		myBuilding.draw();
		
		// Test toString method for myBuilding
		System.out.println();
		System.out.println("Testing toString method for myBuilding:");
>>>>>>> 2c18a0b211a851fea108dd2ce62aaa7424108893
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
<<<<<<< HEAD
		// Test the getters for Business class - confirms setters as well
		System.out.println("Testing getters/setters for Business class "
				   			+"(setters were used for initiation):\n"
=======
		// Test the getters for myBusiness - confirms setters as well
		System.out.println("Testing getters/setters for myBusiness (setters "
				   			+"were used for initiation):\n"
>>>>>>> 2c18a0b211a851fea108dd2ce62aaa7424108893
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
<<<<<<< HEAD
		// Test the getters for Mall class - confirms setters as well
		System.out.println("Testing getters/setters for Mall class "
				   		    +"(setters were used for initiation):\n"
				   		    +"getProjectName returns: "
				   		    +myMall.getProjectName()+"\n"
=======
		// Test the getters for myMall - confirms setters as well
		System.out.println("Testing getters/setters for myBusiness (setters "
				   		    +"were used for initiation):\n"
				   		    +"getProjectName returns: "
>>>>>>> 2c18a0b211a851fea108dd2ce62aaa7424108893
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
<<<<<<< HEAD
				    		+"getNumRentedUnits returns: "
						    +myMall.getNumRentedUnits()+"\n"
						    +"getMedianUnitSize returns: "
						    +df.format(myMall.getMedianUnitSize())+"\n"
=======
						    +"getMedianUnitSize returns: "
						    +myMall.getNumRentedUnits()+"\n"
						    +"getMedianUnitSize returns: "
						    +myMall.getMedianUnitSize()+"\n"
>>>>>>> 2c18a0b211a851fea108dd2ce62aaa7424108893
						    +"getNumParkingSpaces returns: "
						    +myMall.getNumParkingSpaces()
						    );
		
<<<<<<< HEAD
		// Test draw method for Mall class
		System.out.println();
		System.out.println("Testing draw method for Mall class:");
		myMall.draw();
		
		// Test toString method for Mall class
		System.out.println();
		System.out.println("Testing toString method for Mall class:");
		System.out.println(myMall.toString());
=======
		// Test draw method for myMall
		System.out.println();
		System.out.println("\nTesting draw method for myMall:");
		myMall.draw();
		
		// Test toString method for myMall
		System.out.println();
		System.out.println("Testing toString method for myMall:");
		System.out.println(myMall.toString()+"\n");
>>>>>>> 2c18a0b211a851fea108dd2ce62aaa7424108893
		
		// Test the preferred constructor and the displayData method for
		// the Mall class
		Mall myMall2 = new Mall("myMall2",
<<<<<<< HEAD
				"124 Elm St. | Louisville, KY 40219",
				46000, "Business", "Group B", 20, 18, 2300, 200);
		System.out.println();
		System.out.println("Testing preferred constructor and displayData "
							+"method for Mall Class:");
		System.out.println(myMall2.displayData());
		
		// Create an object of the Residential class using the empty argument
		// constructor
		Residential myResidential = new Residential();
		// Use setters to set the instance variables of myResidential
		myResidential.setProjectName("myResidential");
		myResidential.setCompleteAddress("123 Second St. | Madison, IN 47250");
		myResidential.setTotalSquareFeet(3000);
		myResidential.setOccupancyGroup("Residential");
		myResidential.setSubgroup("Group R-1");
		myResidential.setNumBedrooms(4);
		myResidential.setNumBathrooms(3);
		myResidential.setLaundryRoom(true);
		
		System.out.println();
		System.out.println("-------------------------- Testing Residential class"
							+" --------------------------");
		// Test the getters for myResidential - confirms setters as well
		System.out.println("Testing getters/setters for Residential class "
				   			+"(setters were used for initiation):\n"
				   			+"getProjectName returns: "
							+myResidential.getProjectName()+"\n"
							+"getCompleteAddress returns: "
							+myResidential.getCompleteAddress()+"\n"
							+"getTotalSquareFeet returns: "
							+df.format(myResidential.getTotalSquareFeet())+"\n"
							+"getOccupancyGroup returns: "
							+myResidential.getOccupancyGroup()+"\n"
							+"getSubgroup returns: "
							+myResidential.getSubgroup()+"\n"
							+"getNumBedrooms returns: "
							+myResidential.getNumBedrooms()+"\n"
							+"getNumBathrooms returns: "
							+myResidential.getNumBathrooms()+"\n"
							+"isLaundryRoom returns: "
							+myResidential.isLaundryRoom());
		
		// Test the preferred constructor and the toString method for
		// the Residential class
		Residential myResidential2 = new Residential("myResidential2",
				"124 Second St. | Madison, IN 47250",
				4000, "Residential", "Group R-1", 5, 4, true);
		System.out.println();
		System.out.println("Testing preferred constructor and toString method "
							+"for Residential class:");
		System.out.println(myResidential2.toString());
		
		// Create an object of the Apartment class using the empty argument
		// constructor
		Apartment myApartment = new Apartment();
		// Use setters to set the instance variables of myApartment
		myApartment.setProjectName("myApartment");
		myApartment.setCompleteAddress("123 Third St. | Scottsburg, IN 47250");
		myApartment.setTotalSquareFeet(12000);
		myApartment.setOccupancyGroup("Residential");
		myApartment.setSubgroup("Group R-3");
		myApartment.setNumBedrooms(4);
		myApartment.setNumBathrooms(3);
		myApartment.setLaundryRoom(true);
		myApartment.setNumAvailableUnits(4);
		myApartment.setAvgUnitSize(3000);
		myApartment.setParkingAvailable(true);
		
		System.out.println();
		System.out.println("-------------------------- Testing Apartment class"
							+" --------------------------");
		// Test the getters for myApartment - confirms setters as well
		System.out.println("Testing getters/setters for Apartment class"
				   			+"(setters were used for initiation):\n"
				   			+"getProjectName returns: "
							+myApartment.getProjectName()+"\n"
							+"getCompleteAddress returns: "
							+myApartment.getCompleteAddress()+"\n"
							+"getTotalSquareFeet returns: "
							+df.format(myApartment.getTotalSquareFeet())+"\n"
							+"getOccupancyGroup returns: "
							+myApartment.getOccupancyGroup()+"\n"
							+"getSubgroup returns: "
							+myApartment.getSubgroup()+"\n"
							+"getNumBedrooms returns: "
							+myApartment.getNumBedrooms()+"\n"
							+"getNumBathrooms returns: "
							+myApartment.getNumBathrooms()+"\n"
							+"isLaundryRoom returns: "
							+myApartment.isLaundryRoom()+"\n"
							+"getNumAvailableUnits returns: "
							+myApartment.getNumAvailableUnits()+"\n"
							+"getNumAvgUnitSize returns: "
							+df.format(myApartment.getAvgUnitSize())+"\n"
							+"isParkingAvailable returns: "
							+myApartment.isParkingAvailable());
		
		// Test toString method for Apartment class
		System.out.println();
		System.out.println("Testing toString method for Apartment class:");
		System.out.println(myApartment.toString());
		
		// Test the preferred constructor and the displayData method for
		// the Apartment class
		Apartment myApartment2 = new Apartment("myApartment2",
				"124 Third St. | Scottsburg, IN 47250",
				13000, "Residential", "Group R-3", 5, 4, true, 4, 3250, true);
		System.out.println();
		System.out.println("Testing preferred constructor and displayData method "
							+"for Apartment class:");
		System.out.println(myApartment2.displayData());
=======
				"123 Elm St. | Louisville, KY 40219",
				46000, "Business", "Group B", 20, 18, 2300, 200);
		System.out.println();
		System.out.println("Testing preferred constructor and displayData "
							+"methodfor Mall Class:");
		System.out.println(myMall2.displayData());
>>>>>>> 2c18a0b211a851fea108dd2ce62aaa7424108893
		
	}//end main
	
}//end class
