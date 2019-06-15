package day0427;

public class VarArg {
	public static void sum(int a, int b) {
		System.out.println(a+b);
		
		
	}
	public static void addManyNum(int[] manyNums) {
		int sum = 0;
		for (int eachNum : manyNums) {
			sum+=eachNum;
		}
		System.out.println(sum);
		
	}
	
	public static void addManyNumsWArgs (int ... manyNums) {
		   
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Vararg --> variable number of arguments
		// we are passing 2 external data to a method
		// we are passing 2 arguments to a method
		// varArgs is used to create a method that can take variable 
		//--numbers of argument of same type when being called
		sum(2,5);
		
		addManyNum(new int [] {1,4,5,3,6,10,7});
		
		
	}


}
