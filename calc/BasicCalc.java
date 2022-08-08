package calc;

public class BasicCalc {
	
	public static int  addNumbers (int num1, int num2) {
		int addNumbers = num1 + num2;
		System.out.println("Adding these values gives you " + addNumbers);
		return addNumbers;
	}
	public static int  multiplyNumbers (int num1, int num2) {
		int multiplyNumbers = num1 * num2;
		System.out.println("Multiplying these values gives you " + multiplyNumbers);
		return multiplyNumbers;
	}
	public static int  subtractNumbers (int num1, int num2) {
		int subtractNumbers = num1 - num2;
		System.out.println("Subtracting these values gives you " + subtractNumbers);
		return subtractNumbers;
	}
	public static double  divideNumbers (double num1, double num2) {
		double divideNumbers = num1 / num2;
		System.out.println("Dividing these values gives you " + divideNumbers);
		return divideNumbers;
	}
	

public static void main(String[] args) {
    addNumbers(1,1);
    multiplyNumbers(1,1);
    subtractNumbers(1,1);
    divideNumbers(1,1);
  }
}