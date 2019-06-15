package replit;

import java.util.Scanner;

public class ifBlackJackHand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
		    
		    
		    int house = s.nextInt();
		    int player = s.nextInt();
		    
		     	if (player >21) {
		     		System.out.println("bust");
		     	}else if(player<house) {
		     		System.out.println("player lost");
		     	}else if(player==house) {
		     		System.out.println("it's a tie");
		     	}else if(player>house) {
		     		System.out.println("player won");
		     	}
	}

}
