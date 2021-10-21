
/**
 * Business class, subclass of Building
 *
 * @author		Larry Schoch
 * @version		1.0 
 * Construction Project
 * Fall/2021
 */

public class Business extends Building {
	protected int numRentableUnits; // Number of units in the building that
			// can be rented
	
	/**
	 * Empty argument constructor to initialize the instance variables
	 */
	public Business() {
		super();
		this.numRentableUnits = 0;
	}//end empty-argument constructor
	
	/**
	 * Preferred constructor to initiate instance variables
	 * 
	 * * @param projectName - the name of the building project
	 * @param completeAddress - complete address of the project
	 * @param totalSquareFeet - square footage of this building
	 * @param occupancyGroup - occupancy group code
	 * @param subgroup - subgroup code
	 * @param numRentableUnits - number of units in this building that can be
	 * 		rented
	 */
	public Business(String projectName, String completeAddress, 
					double totalSquareFeet, String occupancyGroup, 
					String subgroup, int numRentableUnits) {
		super(projectName, completeAddress, totalSquareFeet, 
			  occupancyGroup, subgroup);
		this.numRentableUnits = numRentableUnits;
	}//end preferred constructor
	
	/**
	 * @return the current value of numRentableUnits
	 */
	public int getNumRentableUnits() {
		return numRentableUnits;
	}//end getNumRentableUnits
	
	/**
	 * @param numRentableUnits the value of numRentableUnits to be set
	 */
	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}//end setNumRentableUnits
	
	/**
	 * @return a formatted string containing the values of all instance
	 * variables
	 */
	@Override
	public String toString() {
		return "Business [numRentableUnits=" + numRentableUnits
				+ ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", totalSquareFeet=" + totalSquareFeet
				+ ", occupancyGroup=" + occupancyGroup + ", subgroup="
				+ subgroup + "]";
	}
	
}//end class
