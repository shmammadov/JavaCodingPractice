package day0518;

import java.util.ArrayList;

public class SlackAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SlackUser user1 = new SlackUser();

		System.out.println(user1);
		SlackUser user2 = new SlackUser("fatma","fatma@gmail.com",22);
		System.out.println(user2);
		SlackUser user3 = new SlackUser("white","white@gmail.com",23);
				
		ArrayList<SlackUser> userList = new ArrayList<>();
		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		 for (SlackUser each : userList) {
		      System.out.println(each);
		      each.sendMessage("general", "Good morning!" );
		    }

	}

}
