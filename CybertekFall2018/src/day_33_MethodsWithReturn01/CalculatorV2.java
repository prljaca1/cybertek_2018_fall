package day_33_MethodsWithReturn01;

public class CalculatorV2 {
	public static double calculate(double n1, double n2, char operator) {
		switch(operator) {
		case '+':
			return add(n1,n2);

		case '-':
			return substract(n1,n2);
			
		case '*':
			return multiply(n1,n2);
			
		case '/': return divide(n1,n2);
		
		default:
			throw new RuntimeException("ERROR: Invalid Operator " + operator);
		}
	}

	public static double add(double num1,double num2) {//you cannot two arguments with the same name
		double result=num1+num2;
		return result;
	}
	public static double substract(double num1,double num2) {
		double result=num1-num2;
		return result;
	}
	public static double multiply(double num1, double num2) {

		double result=num1*num2;
		return result;
	}
	public static double divide(double num1, double num2) {
		if (num2==0) {
			System.out.println("ERROR: Cannot divide by 0");
			return -1;
		}
		double result=num1/num2;
		return result;
	}

}













