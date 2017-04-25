import java.util.Arrays;

public class CalculatorDriver {

	public static void main(String[] args) {
		int[] num = { 3, 3, 5 };
		double[] num2 = { 2.5, 2.5, 2.5 };
		System.out.println("the sum of the interger array is :" + Calculator.Sum(num));
		System.out.println("\nThe sum of the double array is : " + Calculator.Sum(num2));
		System.out.println("\nThe average of the interger array is : " + Calculator.avrg(num));
		System.out.println("\nThe average of the double array is : " + Calculator.avrg(num2));
		System.out.println("\nThe product of the integer array is : " + Calculator.Product(num));
		System.out.println("\nThe product of the double array is : " + Calculator.Product(num2));
		String result = Arrays.toString(num);
		System.out.println("\nfactorial of the array " + result + " is: " + Calculator.factorial(num));
	}
}
