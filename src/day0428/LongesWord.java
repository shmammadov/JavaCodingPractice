package day0428;

public class LongesWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String words = findLongestWord("Fatma", "Shah", "Alp", "Mr White", "Jesse");
		System.out.println(words);
	}

	public static String findLongestWord(String... word) {

		String longestWord = word[0];
		for (int i = 0; i < word.length; i++) {

			if (word[i].length() > longestWord.length()) {

				longestWord = word[i];
			}
		}
		return longestWord;

	}

}
