package day0518;

public class SlackUser {

	
		private String name;
		private String email;
		private int groupNum;
		
		
		public SlackUser(String name, String email, int groupNum) {
			
			this.name = name;
			this.email = email;
			this.groupNum = groupNum;
		}
		
		public SlackUser () {
			this("Alp","alp@gmail.com",123);
			
		}
		
		public void sendMessage(String channel, String content) {
			System.out.println(this.name+"send message "+content +"to channel " + channel);
			
		}
		public String toString() {
			return "SlackUser [name=" + name + ", email=" + email + ", groupNum=" + groupNum + "]";
		}


		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public int getGroupNum() {
			return groupNum;
		}
		public void setGroupNum(int groupNum) {
			this.groupNum = groupNum;
		}
		
	

}
