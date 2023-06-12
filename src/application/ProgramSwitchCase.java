package application;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import utils.Calculator;

public class ProgramSwitchCase {

	public static void main(String[] args) {

		float value1, value2, result = 0;
		String op = "";
		List<String> operadores = Arrays.asList("+", "-", "*", "/");

		Scanner scan = new Scanner(System.in);

		while (true) {
			try {
			System.out.print("Digite + para somar, - para subtrair, * para multiplicar e / para dividir: ");
			op = scan.next();
			
			if(op.equals("+") || op.equals("-")|| op.equals("*") || op.equals("/")) {
					
			System.out.print("Digite o valor 1: ");
			value1 = scan.nextFloat();
			System.out.print("Digite o valor 2: ");
			value2 = scan.nextFloat();
			
			} else {
				throw new InputMismatchException();
			}

			switch (op) {
			case "+":
				result = Calculator.addition(value1, value2);
				break;
			case "-":
				result = Calculator.subtraction(value1, value2);
				break;
			case "*":
				result = Calculator.multiplication(value1, value2);
				break;
			case "/":
				result = Calculator.division(value1, value2);
				break;
			default:
				break;
			}
			System.out.println("O resultado é: " + result);
			System.out.println();
			} catch (InputMismatchException e) {
				System.out.println("Digite um caracter válido -> + - * /");
				System.out.println();
			}
		}
	}
}
