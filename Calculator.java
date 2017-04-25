import java.util.Arrays;

public class Calculator {

	public static int Sum(int[] num) {
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		return sum;
	}

	public static double Sum(double[] num) {
		double sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		return sum;
	}

	public static double avrg(int num[]) {
		double average = 1.0;
		double sum = Sum(num);
		average = sum / num.length;
		return average;

	}

	public static double avrg(double num[]) {
		double average = 1.0;
		double sum = Sum(num);
		average = sum / num.length;
		return average;

	}

	public static int Product(int num[]) {
		int product = 1;
		for (int i = 0; i < num.length; i++) {
			product *= num[i];
		}
		return product;
	}

	public static double Product(double num[]) {
		double product = 1.0;
		for (int i = 0; i < num.length; i++) {
			product *= num[i];
		}
		return product;
	}

	public static String factorial(int num[]) {
		int sum = 1;
		int temp = 1;
		int[] num2 = new int[num.length];
		for (int i = 0; i < num.length; i++) {
			for (int j = num[i]; j >= 1; j--) {
				sum = sum * j;
			}
			num2[i] = sum;
			sum = temp;
		}
		String array = Arrays.toString(num2);
		return array;
	}

}
