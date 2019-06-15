package day0330;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y = 1;
		int x = 100;
		do {
			System.out.print(y++ +" ");
		}while (y<100);
	
		do {
			System.out.print(x-- +" ");
			
		}while (x>1);
	}

}
