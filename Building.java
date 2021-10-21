import java.text.DecimalFormat;

/**
 * Superclass for all objects in the Project.
 *
 * @author		Larry Schoch
 * @version		1.0 
 * Construction Project
 * Fall/2021
 */

public class Building {
	protected String projectName;
	protected String completeAddress;
	protected double totalSquareFeet;
	protected String occupancyGroup;
	protected String subgroup;
   
	public Building() {
		this.projectName = "";
		this.completeAddress = "";
		this.totalSquareFeet = 0.0;
		this.occupancyGroup = "";
		this.subgroup = "";
	}//end empty-argument constructor
	
    public Building(String projectName, String completeAddress, 
    				double totalSquareFeet, String occupancyGroup, 
    				String subgroup) {
    	this.projectName = projectName;
    	this.completeAddress = completeAddress;
    	this.totalSquareFeet = totalSquareFeet;
    	this.occupancyGroup = occupancyGroup;
    	this.subgroup = subgroup;
	}//end preferred constructor
    
    /**
	 * This method will draw the object to the screen
	 */
	public void draw() {
    	System.out.println("Drawing code for <<Object Type>>");
    }//end draw
	
	/**
	 * This method returns a formatted String that displays the values of all 
	 * instance variables for this object.
	 * 
	 * @return the formatted String
	 */
	public String displayData() {
		String str = ""; // Variable to hold the return value.
				// value for boolean parkingAvailable variable.
		DecimalFormat df = new DecimalFormat("#");
		str += "Building\n"
				+"Project Name: "+"\t\t"+projectName+"\n"
				+"Address: "+"\t\t"+completeAddress+"\n"
				+"Square Feet: "+"\t\t"+df.format(totalSquareFeet)+"\n"
				+"Occupancy Group: "+"\t"+occupancyGroup+"\n"
				+"Occupancy Subgroup: "+"\t"+subgroup+"\n";
		return str;
    }//end displayData
    
	/**
	 * @return the current value of projectName
	 */
    public String getProjectName() {
		return projectName;
	}//end getProjectName
    
    /**
     * @param projectName the value of projectName to be set
     */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}//end setProjectName
	
	/**
	 * @return the current value of completeAddress
	 */
	public String getCompleteAddress() {
		return completeAddress;
	}//end getCompleteAddress
	
	/**
	 * @param completeAddress the value of completeAddress to be set
	 */
	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}//end setCompleteAddress
	
	/**
	 * @return the current value of totalSquareFeet
	 */
	public double getTotalSquareFeet() {
		return totalSquareFeet;
	}//end getTotalSquareFeet
	
	/**
	 * @param totalSquareFeet the value of totalSquareFeet to be set
	 */
	public void setTotalSquareFeet(double totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
	}//end setTotalSquareFeet
	
	/**
	 * @return the current value of occupancyGroup
	 */
	public String getOccupancyGroup() {
		return occupancyGroup;
	}//end getOccupancyGroup
	
	/** 
	 * @param occupancyGroup the value of occupancyGroup to be set
	 */
	public void setOccupancyGroup(String occupancyGroup) {
		this.occupancyGroup = occupancyGroup;
	}//end setOccupancyGroup
	
	/**
	 * @return the current value of subgroup
	 */
	public String getSubgroup() {
		return subgroup;
	}//end getSubgroup
	
	/**
	 * @param subgroup the value of subgroup to be set
	 */
	public void setSubgroup(String subgroup) {
		this.subgroup = subgroup;
	}//end setSubgroup
	
	/**
	 * @return a formatted string containing the values of all instance
	 * variables
	 */
	@Override
	public String toString() {
		return "Building [projectName=" + projectName + ", completeAddress=" 
				+ completeAddress + ", totalSquareFeet=" + totalSquareFeet
				+ ", occupancyGroup=" + occupancyGroup + ", subgroup="
				+ subgroup + "]";
	}//end toString

}//end class
