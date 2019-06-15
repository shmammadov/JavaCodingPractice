package day0413;

import java.util.Arrays;

public class WarmpUp31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		// Optional : Reverse each word in sentence
//		your output should be 
//		ketrebyC hctaB natrapS si tsom gnikrowdrah hctaB reve 
		
		String str = "Cybertek Batch Spartan is most hardworking Batch ever";
		String[] words = str.split(" ");
		
		String reversedSentence="";
		
		
		
		
		
		for (int j = 0; j < words.length; j++) {
			
			String one = words[j];
			char [] wordChars = one.toCharArray();
			int lastIndex = wordChars.length-1;
			
			for (int i = 0; i < wordChars.length/2; i++) {
				char temp = wordChars[i];
				wordChars[i] = wordChars[lastIndex-i];
				wordChars[lastIndex-i] = temp;
			}
			
			//System.out.println(Arrays.toString(wordChars));
			String reversed  = new String(wordChars);
			
			reversedSentence = reversedSentence + reversed +" ";
			
			//System.out.println(reversed);
			
			
		}
		System.out.println(reversedSentence);
		
	
	}
		
	}


