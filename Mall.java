import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Mall class, subclass of Business
 *
 * @author		Larry Schoch
 * @version		1.0 
 * Construction Project
 * Fall/2021
 */

public class Mall extends Business {
	private int numRentedUnits; // Number of this mall's units that are rented
	private double medianUnitSize; // This mall's median unit size
	private int numParkingSpaces; // Number of parking spaces available at this
								  // mall
	/**
	 * Empty argument constructor to initialize the instance variables
	 */
	public Mall() {
		super();
		this.numRentedUnits = 0;
		this.medianUnitSize = 0.0;
		this.numParkingSpaces = 0;
	}//end empty-argument constructor
	
	/**
	 * Preferred constructor to initiate instance variables
	 * 
	 * @param projectName - the name of the building project
	 * @param completeAddress - complete address of the project
	 * @param totalSquareFeet - square footage of this mall
	 * @param occupancyGroup - occupancy group code
	 * @param subgroup - subgroup code
	 * @param numRentableUnits - number of units in this mall that can be
	 *                           rented
	 * @param numRentedUnits - number of units in this mall that are 
	 *                         currently being rented
	 * @param medianUnitSize - median of all of the unit sizes
	 * @param numParkingSpaces - total number of parking spaces around the mall
	 */
	public Mall(String projectName, String completeAddress, 
				double totalSquareFeet, String occupancyGroup, String subgroup,
				int numRentableUnits, int numRentedUnits, double medianUnitSize,
				int numParkingSpaces) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup,
			  subgroup, numRentableUnits);
		this.numRentedUnits = numRentedUnits;
		this.medianUnitSize = medianUnitSize;
		this.numParkingSpaces = numParkingSpaces;
	}//end preferred constructor

	/**
	 * This method will draw the object to the screen
	 */
	@Override
	public void draw() {
    	System.out.println("Drawing code for <<Object Type>>");
    }//end draw
    
	/**
	 * This method returns a formatted String that displays the values of all 
	 * instance variables for this object.
	 * 
	 * @return the formatted String
	 */
	@Override
    public String displayData() {
		String str = ""; // Variable to hold the return value.
		DecimalFormat df = new DecimalFormat("#");
		str += "Mall\n"
				+"Project Name: "+"\t\t\t"+projectName+"\n"
				+"Address: "+"\t\t\t"+completeAddress+"\n"
				+"Square Feet: "+"\t\t\t"+df.format(totalSquareFeet)+"\n"
				+"Occupancy Group: "+"\t\t"+occupancyGroup+"\n"
				+"Occupancy Subgroup: "+"\t\t"+subgroup+"\n"
				+"Number of Rentable Units: "+"\t"+numRentableUnits+"\n"
				+"Number of Rented Units: "+"\t"+numRentedUnits+"\n"
				+"Median Unit Size: "+"\t\t"+df.format(medianUnitSize)+"\n"
				+"Number of Parking Spaces: "+"\t"+numParkingSpaces;
		return str;
	}//end displayData
	
	/**
	 * @return the current value of numRentedUnits.
	 */
	public int getNumRentedUnits() {
		return numRentedUnits;
	}//end getNumRentedUnits
	
	/**
	 * @param numRentedUnits the value of numRentedUnits to be set
	 */
	public void setNumRentedUnits(int numRentedUnits) {
		this.numRentedUnits = numRentedUnits;
	}//end setNumRentedUnits

	/**
	 * @return the current value of medUnitSize
	 */
	public double getMedianUnitSize() {
		return medianUnitSize;
	}//end getMedianUnitSize
	
	/**
	 * @param medianUnitSize the value of numRentedUnits to be set
	 */
	public void setMedianUnitSize(double medianUnitSize) {
		this.medianUnitSize = medianUnitSize;
	}//end setMedianUnitSize
	
	/**
	 * @return the current value of numParkingSpaces
	 */
	public int getNumParkingSpaces() {
		return numParkingSpaces;
	}//end getNumParkingSpaces
	
	/**
	 * @param numParkingSpaces the value of numParkingSpaces to set
	 */
	public void setNumParkingSpaces(int numParkingSpaces) {
		this.numParkingSpaces = numParkingSpaces;
	}//end setNumParkingSpaces
	
	/**
	 * @return a formatted string containing the values of all instance
	 * variables
	 */
	@Override
	public String toString() {
		return "Mall [numRentedUnits=" + numRentedUnits + ", medianUnitSize="
				+ medianUnitSize + ", numParkingSpaces=" + numParkingSpaces
				+ ", numRentableUnits=" + numRentableUnits + ", projectName="
				+ projectName + ", completeAddress=" + completeAddress + ","
				+ " totalSquareFeet=" + totalSquareFeet + ", occupancyGroup="
				+ occupancyGroup + ", subgroup=" + subgroup + "]";
	}//end toString

}//end class
