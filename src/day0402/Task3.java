package day0402;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 1; i<50;i+=2) {
			System.out.print("odd " + i +"|");
		}
		for (int j = 1; j<50;j++) {
			if (j%2==0) {
				continue; 
			}
			System.out.print("");
			System.out.println("odd way two " + j);
		}
		
		// Task 3.2
		
		for (int j = 1; j < 50 ; j++) {
			if (j%4==0) {
				count++;
			}
	    //     if (j%4 !=0){
	    //      continue;
		//    }
		//      count ++;
			
			
		}
		
		System.out.print("count is"+count);
			
		}

	}


