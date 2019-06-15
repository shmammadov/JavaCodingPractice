package day0413;

import java.util.Arrays;

public class WarmUp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		// Optional : Reverse each word in sentence
//		your output should be 
//		ketrebyC hctaB natrapS si tsom gnikrowdrah hctaB reve 
		
		String str = "Cybertek Batch Spartan is most hardworking Batch ever";
		String[] cyberTek = str.split(" ");
		
		//String revString ="";
		String one = "Cybertek";
		char [] wordChars = one.toCharArray();
		int lastIndex = wordChars.length-1;
		
		for (int i = 0; i < wordChars.length/2; i++) {
			char temp = wordChars[i];
			wordChars[i] = wordChars[lastIndex-i];
			wordChars[lastIndex-i] = temp;
		}
		
		System.out.println(Arrays.toString(wordChars));
		String reversed  = new String(wordChars);
		System.out.println(reversed);
	}

}
