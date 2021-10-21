
/**
 * Residential class, subclass of Building
 *
 * @author		Larry Schoch
 * @version		1.0 
 * Construction Project
 * Fall/2021
 */

public class Residential extends Building {
	protected int numBedrooms; // Number of bedrooms in the building
	protected int numBathrooms; // Number of bathrooms in the building
	protected boolean laundryRoom; // Indicates whether a laundry room is
								   // available
	/**
	 * Empty argument constructor to initialize the instance variables
	 */
	public Residential() {
		super();
		this.numBedrooms = 0;
		this.numBathrooms = 0;
		this.laundryRoom = false;
	}//end empty-argument constructor
	
	/**
	 * Preferred constructor to initiate instance variables
	 * 
	 * @param projectName - the name of the building project
	 * @param completeAddress - complete address of the project
	 * @param totalSquareFeet - square footage of this mall
	 * @param occupancyGroup - occupancy group code
	 * @param subgroup - subgroup code
	 * @param numBedrooms - number of bedrooms in the apartment building
	 * @param numBathrooms - number of bathrooms in the apartment building
	 * @param laundryRoom - whether a laundry room is available
	 */
	public Residential(String projectName, String completeAddress,
		   double totalSquareFeet, String occupancyGroup, String subgroup,
		   int numBedrooms, int numBathrooms, boolean laundryRoom) {
		super(projectName, completeAddress, totalSquareFeet, 
				  occupancyGroup, subgroup);
		this.numBedrooms = numBedrooms;
		this.numBathrooms = numBathrooms;
		this.laundryRoom = laundryRoom;
	}//end preferred constructor
	
	/**
	 * @return the current value of numBedRooms
	 */
	public int getNumBedrooms() {
		return numBedrooms;
	}//end getNumBedrooms
	
	/**
	 * @param numBedrooms the value of numBedRooms to be set
	 */
	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}//end setNumBedrooms
	
	/**
	 * @return the current value of numBathrooms
	 */
	public int getNumBathrooms() {
		return numBathrooms;
	}//end getNumBathrooms
	
	/**
	 * @param numBathrooms the value of numBathrooms to be set
	 */
	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}//end setNumBathrooms
	
	/**
	 * @return the current value of laundryRoom
	 */
	public boolean isLaundryRoom() {
		return laundryRoom;
	}//end isLaundryRoom
	
	/**
	 * @param laundryRoom the value of laundryRoom to set
	 */
	public void setLaundryRoom(boolean laundryRoom) {
		this.laundryRoom = laundryRoom;
	}//end setLaundryRoom
	
	/**
	 * @return a formatted string containing the values of all instance
	 * variables
	 */
	@Override
	public String toString() {
		return "Residential [numBedrooms=" + numBedrooms + ", numBathrooms="
				+ numBathrooms + ", laundryRoom=" + laundryRoom
				+ ", projectName=" + projectName + ", completeAddress=" 
				+ completeAddress+ ", totalSquareFeet=" + totalSquareFeet + ","
				+ " occupancyGroup=" + occupancyGroup + ", subgroup="+ subgroup 
				+ "]";
	}//end toString

}//end class
