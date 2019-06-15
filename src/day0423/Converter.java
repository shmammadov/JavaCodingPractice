package day0423;

public class Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int meter = 2;
		System.out.println(meterToCM(meter));
		int feet = 2;
		System.out.println(feetToInch(feet));
		double fah = fToC(89);

		System.out.println(fah);

		int cel = (int) fToC(89);

		System.out.println(cel);
	}

	public static int meterToCM(int m) {
		int cm = m * 100;
		return cm;

	}

	public static int feetToInch(int i) {
		int inch = i * 12;
		return inch;

	}

	public static double fToC(double f) {
		double fah = (f - 32) * 5 / 9;
		return fah;
	}

}
