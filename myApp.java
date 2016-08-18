package stackPractice;

import java.util.Scanner;
import java.util.Stack;

public class myApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan1 = new Scanner(System.in);
		Stack <Integer> stack1 = new Stack <Integer>();
		int result = 0;
		System.out.println("Please enter your equation:");
		String userInput = scan1.nextLine();
	
		
		for (int i = 0; i < userInput.length(); i++){
			Character c = userInput.charAt(i);
			if (c.isDigit(c)) {
				int value = c.getNumericValue(c);
				stack1.push(value);
			}else {
				int x = stack1.pop();
				int y = stack1.pop();
				result = calculateTotal(result, x, y, c);
				System.out.println(result + " will be pushed back by the stack.");
				stack1.push(result);
			}
		}	
		
}

	private static int calculateTotal(int result, int x, int y, Character c) {
		result = 0;
				switch (c) {
				case '*':
					result = x * y;
					break;
				case '/':
					result = x/y;
					break;
				case '+':
					result = x + y;
					break;
				case '-':
					result = x - y;
					break;
				default:
					break;
				}
				return result;

	}
}