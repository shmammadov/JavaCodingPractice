package replit;

import java.util.Scanner;

public class SMSmessage_74 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	    String message = scan.nextLine();
	    String sender;
	    String phoneNumber;
	    String messageBody;
	        sender = message.substring(message.indexOf("<")+1, message.indexOf(">"));
			    phoneNumber = message.substring(message.indexOf("[")+1, message.indexOf("]"));
			    messageBody = message.substring(message.indexOf("{")+1, message.indexOf("}"));
			    System.out.println("Sender: "+sender);
			    System.out.println("Phone Number: "+phoneNumber);
			    System.out.println("Message body: "+messageBody);


	}

}
