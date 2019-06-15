package day0420;

public class ArrayParamether {

	public static void main(String[] args) {
		// TODO Auto-generated method stub1
		
	int [] arrObject = {1,2,4,5};
//		for (int each : arrObject) {
//			System.out.print(each + "-");
//		}
//		System.out.println();
		
		arrayPrint(arrObject);

	}
	public static void arrayPrint (int [] multipleItems) {
		for (int each : multipleItems) {
			System.out.print(each + "-");
		}
		System.out.println();
	}

}
