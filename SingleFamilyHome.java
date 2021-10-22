import java.text.DecimalFormat;

/**
 * SingleFamilyHome class, a subclass of Residential
 *
 * @author		Larry Schoch
 * @version		1.0 
 * Construction Project
 * Fall/2021
 */

public class SingleFamilyHome extends Residential {
	private boolean garage; // True if the object has a garage, false if not.
	
	/**
	 * Empty argument constructor to initialize the instance variables
	 */
	public SingleFamilyHome() {
		super();
		this.garage = false;
	}//end empty-argument constructor
	
	/**
	 * Preferred constructor to initiate instance variables
	 * 
	 * @param projectName - the name of the home
	 * @param completeAddress - complete address of the home
	 * @param totalSquareFeet - square footage of the home
	 * @param occupancyGroup - occupancy group code
	 * @param subgroup - subgroup code
	 * @param numBedrooms - number of bedrooms in the home
	 * @param numBathrooms - number of bathrooms in the home
	 * @param laundryRoom - whether the home has a laundry room
	 * @param garage - indicates whether or not the home has a garage
	 */
	public SingleFamilyHome(String projectName, String completeAddress,
			   double totalSquareFeet, String occupancyGroup, String subgroup,
			   int numBedrooms, int numBathrooms, boolean laundryRoom,
			   boolean garage) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup,
			  subgroup, numBedrooms, numBathrooms, laundryRoom);
		this.garage = garage;
	}
	
	/**
	 * This method will draw the object to the screen
	 */
	@Override
	public void draw() {
    	System.out.println("Drawing code for class SingleFamilyHome");
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
		String strLR = laundryRoom?"Y":"N"; // Variable to hold string value for boolean laundryRoom variable.
		String strG = garage?"Y":"N"; // Variable to hold string value for boolean garage variable.
		DecimalFormat df = new DecimalFormat("#");
		str += "SingleFamilyHome\n"
				+"Project Name: "+"\t\t"+projectName+"\n"
				+"Address: "+"\t\t"+completeAddress+"\n"
				+"Square Feet: "+"\t\t"+df.format(totalSquareFeet)+"\n"
				+"Occupancy Group: "+"\t"+occupancyGroup+"\n"
				+"Occupancy Subgroup: "+"\t"+subgroup+"\n"
				+"Number of Bedrooms: "+"\t"+numBedrooms+"\n"
				+"Number of Bathrooms: "+"\t"+numBathrooms+"\n"
				+"Laundry Room: "+"\t\t"+strLR+"\n"
				+"Garage: "+"\t\t"+strG+"\n";
		return str;
	}//end displayData
    	
	/**
	 * 
	 * @return the current value of garage
	 */
	public boolean isGarage() {
		return garage;
	}//end isGarage

	/**
	 * 
	 * @param garage the value of garage to be set
	 */
	public void setGarage(boolean garage) {
		this.garage = garage;
	}//end setGarage

	/**
	 * @return a formatted string containing the values of all instance
	 * variables
	 */
	@Override
	public String toString() {
		return "SingleFamilyHome [garage=" + garage + ", numBedrooms="
				+ numBedrooms + ", numBathrooms=" + numBathrooms
				+ ", laundryRoom=" + laundryRoom + ", projectName="
				+ projectName + ", completeAddress=" + completeAddress
				+ ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup="
				+ occupancyGroup + ", subgroup=" + subgroup + "]";
	}//end toString
	
}//end class
