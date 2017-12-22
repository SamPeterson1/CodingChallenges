package Factorials;

import java.util.Scanner;

public class Main {
	
	public static String MaximalSquare(String arr) {
		String[] firstDimension = arr.split(",");
		String[][] str = new String[firstDimension.length][firstDimension.length];
		for(int i = 0; i < firstDimension.length; i ++) {
			str[i] = firstDimension[i].split(" ");
		}
		return new Integer(getSquares(str, str[0].length)).toString();
	}
	
	public static int getSquares(String[][] matrix, int size) {
		int[] retVal = new int[size + 1];
		for(int m = 0; m < size + 1; m ++) {
			for(int i = 0; i < size; i ++) {
				for(int j = 0; j < size; j ++) {
					int matches = 0;
					for(int k = i; k < i + m; k ++) {
						for(int l = j; l < j + m; l ++) {
							if(k < size & l < size) {
								if(matrix[k][l].equals("1")) {
									matches ++;
								}
							}
						}
					}
					if(matches == m * m) {
						retVal[m] = m * m;
					}
				}
			}
		}
		int finalRet = 0;
		for(int i = 0; i < retVal.length; i ++) {
			if(retVal[i] > finalRet) {
				finalRet = retVal[i];
			}
		}
		return finalRet;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println(StringFun.capitalize(s.nextLine()));
		s.close();
	}

}
