package day0525;

public class AdminUser extends SlackUser {

	int adminLevel;
	
	/*
	 * this.displayName = displayName; 
	    this.timeZone = timeZone; 
	    this.status = status;
	 */
	public AdminUser(String displayName, String status,int timeZone,int adminLevel) {
	super(displayName,timeZone,status);
	this.adminLevel = adminLevel;
	}
	
	  public void sendMessage(String message) {
		    System.out.println("override");
		    System.out.println("<"+displayName+"> is sending <" 
		            + message+">" );
		    
		  }
	public static void main(String[] args) {
		AdminUser a1 = new AdminUser ("B11","Online",5,4);
		//a1.sendMessage("j");
	}
	
	
}
