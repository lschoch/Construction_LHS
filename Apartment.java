import java.text.DecimalFormat;

/**
 * Apartment class, subclass of Residential
 *
 * @author		Larry Schoch
 * @version		1.0 
 * Construction Project
 * Fall/2021
 */

public class Apartment extends Residential {
	private int numAvailableUnits; // Number of apartments that can be rented
	private double avgUnitSize; // Average apartment size
	private boolean parkingAvailable; // Indicates whether parking is available
	
	/**
	 * Empty argument constructor to initialize the instance variables
	 */
	public Apartment() {
		super();
		this.numAvailableUnits = 0;
		this.avgUnitSize = 0.0;
		this.parkingAvailable = false;
	}//end empty-argument constructor
	
	/**
	 * Preferred constructor to initiate instance variables
	 * 
	 * @param projectName - the name of the apartment building
	 * @param completeAddress - complete address of the apartment building
	 * @param totalSquareFeet - square footage of the apartment building
	 * @param occupancyGroup - occupancy group code
	 * @param subgroup - subgroup code
	 * @param numBedrooms - number of bedrooms in the apartment building
	 * @param numBathrooms - number of bathrooms in the apartment building
	 * @param laundryRoom - whether a laundry room is available
	 * @param numUnitsAvailable - the number of apartments that can be rented
	 * @param avgUnitSize - the average size of the apartments in the building
	 * @param parkingAvailable - indicates whether on-site parking is available
	 *  for this building
	 */
	public Apartment(String projectName, String completeAddress,
		   double totalSquareFeet, String occupancyGroup, String subgroup,
		   int numBedrooms, int numBathrooms, boolean laundryRoom,
		   int numAvailableUnits, double avgUnitSize,
		   boolean parkingAvailable) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup,
			  subgroup, numBedrooms, numBathrooms, laundryRoom);
		this.numAvailableUnits = numAvailableUnits;
		this.avgUnitSize = avgUnitSize;
		this.parkingAvailable = parkingAvailable;
	}//end preferred constructor
	
	/**
	 * This method will draw the object to the screen
	 */
	@Override
	public void draw() {
    	System.out.println("Drawing code for class Apartment");
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
		String strLR = laundryRoom?"Y":"N"; // Variable to hold string value
				// for boolean laundryRoom variable.
		String strPA = parkingAvailable?"Y":"N"; // Variable to hold string
				// value for boolean parkingAvailable variable.
		DecimalFormat df = new DecimalFormat("#");
		str += "Apartment\n"
				+"Project Name: "+"\t\t\t"+projectName+"\n"
				+"Address: "+"\t\t\t"+completeAddress+"\n"
				+"Square Feet: "+"\t\t\t"+df.format(totalSquareFeet)+"\n"
				+"Occupancy Group: "+"\t\t"+occupancyGroup+"\n"
				+"Occupancy Subgroup: "+"\t\t"+subgroup+"\n"
				+"Number of Bedrooms: "+"\t\t"+numBedrooms+"\n"
				+"Number of Bathrooms: "+"\t\t"+numBathrooms+"\n"
				+"Number of Units Available: "+"\t"+numAvailableUnits+"\n"
				+"Average Unit Size: "+"\t\t"+df.format(avgUnitSize)+"\n"
				+"Laundry Room: "+"\t\t\t"+strLR+"\n"
				+"Parking Available: "+"\t\t"+strPA+"\n";
		return str;
    }//end displayData
	
	/**
	 * @return current value of numAvailableUnits
	 */
	public int getNumAvailableUnits() {
		return numAvailableUnits;
	}//end getNumAvailableUnits
	
	/**
	 * @param numAvailableUnits the value of numAvailaibleUnits to be set
	 */
	public void setNumAvailableUnits(int numAvailableUnits) {
		this.numAvailableUnits = numAvailableUnits;
	}//end setNumAvailableUnits
	
	/**
	 * @return the current value of avgUnitSize
	 */
	public double getAvgUnitSize() {
		return avgUnitSize;
	}//end getAvgUnitSize
	
	/**
	 * @param avgUnitSize the value of avgUnitSize to be set
	 */
	public void setAvgUnitSize(double avgUnitSize) {
		this.avgUnitSize = avgUnitSize;
	}//end setAvgUnitSize
	
	/**
	 * @return the current value of parkingAvailable
	 */
	public boolean isParkingAvailable() {
		return parkingAvailable;
	}//end isParkingAvailable
	
	/**
	 * @param parkingAvailable the value of parkingAvailable to be set
	 */
	public void setParkingAvailable(boolean parkingAvailable) {
		this.parkingAvailable = parkingAvailable;
	}//end setParkingAvailable
	
	/**
	 * @return a formatted string containing the values of all instance
	 * variables
	 */
	@Override
	public String toString() {
		return "Apartment [numAvailableUnits=" + numAvailableUnits
				+ ", avgUnitSize=" + avgUnitSize + ", parkingAvailable="
				+ parkingAvailable + ", numBedrooms=" + numBedrooms
				+ ", numBathrooms=" + numBathrooms + ", laundryRoom="
				+ laundryRoom + ", projectName=" + projectName
				+ ", completeAddress=" + completeAddress + ", totalSquareFeet="
				+ totalSquareFeet + ", occupancyGroup=" + occupancyGroup
				+ ", subgroup=" + subgroup + "]";
	}//end toString
	
}//end class
