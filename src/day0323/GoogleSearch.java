package day0323;

public class GoogleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// test to see a search 
		
		String search = " About 813,00,000 results (0.56 seconds)";
		//if (search.indexOf("About")==0)
		if(search.substring(0,5).equals("About") && search.contains("result")) {
			System.out.println("it pass");
		}else {
			
			if(!search.substring(0,5).equals("About")) {
				System.out.println("about did not start at the begining");
			}else if(!search.contains("result")) {
				System.out.println("about did exist");

			}
				
			System.out.println("it faild");
		}

	}

}
