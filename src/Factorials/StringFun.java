package Factorials;

public class StringFun {
	public static String capitalize(String str) {
		char[][] letters = StringFun.to2dCharArray(str);
		for(int i = 0; i < letters.length; i ++) {
			String s = String.valueOf(letters[i][0]);
			String j = s.toUpperCase();
			letters[i][0] = j.toCharArray()[0];
		}	
		return StringFun.toString(letters);
	}
	
	public static String toString(char[][] arr) {
		String[] reconstructedWords = new String[arr.length];
		for(int i = 0; i < arr.length; i ++) {
			reconstructedWords[i] = String.valueOf(arr[i]);
			while(reconstructedWords[i].charAt(reconstructedWords[i].length() - 1) == ' ') {
				String k = reconstructedWords[i].substring(0, reconstructedWords[i].length() - 1);
				reconstructedWords[i] = k;
			}
		}
		StringBuilder sb = new StringBuilder("");
		for(int i = 0; i < arr.length; i ++) {
			sb.append(reconstructedWords[i]).append(" ");
		}
		return sb.toString();
	}
	
	public static char[][] to2dCharArray(String str){
		String[] words = str.split(" ");
		int longestWord = 0;
		for(int i = 0; i < words.length; i ++) {
			if(words[i].length() > longestWord) {
				longestWord = words[i].length();
			}
		}
		char[][] letters = new char[words.length][longestWord];
		for(int i = 0; i < words.length; i ++) {
			char[] splitWord = words[i].toCharArray();
			for(int j = 0; j < longestWord; j ++) {
				if(j < splitWord.length) {
					letters[i][j] = splitWord[j];
				} else {
					letters[i][j] = ' ';
				}
			}
		}
		return letters;
	}
	
	public static void test(String str) {
		System.out.println(str.contains(" "));
	}
	
	private static void print(char[][] data) {
		for(int i = 0; i < data.length; i ++) {
			System.out.println("");
			for(int j = 0; j < data[1].length; j ++) {
				System.out.print(data[i][j]);
			}
		}
	}
}
