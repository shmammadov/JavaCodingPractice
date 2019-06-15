package day0326;

import java.util.Scanner;

public class WarmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	    String message = scan.nextLine();
	    String sender;
	    String phoneNumber;
	    String messageBody;
	    
	   // char ch = message.charAt(0);
	    
	    
	    int nameR = message.indexOf("<");
	    int nameL = message.indexOf('>');
	    int phoneR = message.indexOf("[");
	    int phoneL = message.indexOf(']');
	    int mbodyR = message.indexOf("{");
	    int mbodyL = message.indexOf('}');
	    
	    
	    
	   // System.out.println(ch);
	    sender=message.substring(nameR+1,nameL);
	    phoneNumber=message.substring(phoneR+1,phoneL);
	    messageBody=message.substring(mbodyR+1,mbodyL);
	    System.out.println(sender + phoneNumber + messageBody);
	   //01234567890123456
//Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}

//Variables are already declared:
//
//sender, phoneNumber, message
//- by using String methods:
//retrieve related information from SMSmessage string and assign to those 3 variables.
//-print each variable in separate line
//
//Sender: Mike Smith
//Phone Number: 202-123-3456
//Message body: I love programing and problem solving
	    
	    

	}

}
