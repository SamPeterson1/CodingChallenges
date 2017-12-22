package Factorials;

public class Math {
	public static int Factorial(int i) {
		int retVal = i;
		for(int j = i - 1; j > 0; j --) {
			retVal = retVal * j;
		}
		return retVal;
	}
}
