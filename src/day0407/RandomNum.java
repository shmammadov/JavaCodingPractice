package day0407;

import java.util.Random;

public class RandomNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		for (int r = 0; r<10;r++) {
		int i = rand.nextInt(100);
		System.out.println(i);
		}

	}

}
