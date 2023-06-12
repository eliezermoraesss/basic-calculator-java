package application;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import utils.Calculator;

public class ProgramMap {

	public static void main(String[] args) {
		
		float value1 = 0;
		float value2 = 0;
		float result = 0;
		String op = "";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite + para somar, - para subtrair, * para multiplicar e / para dividir: ");
		op = scan.next();
		
		System.out.print("Digite o valor 1: ");
		value1 = scan.nextFloat();
		System.out.print("Digite o valor 2: ");
		value2 = scan.nextFloat();
		
		String[] array1 = { "+", "-", "*", "/" };
		Float[] array2 = { 
				Calculator.addition(value1, value2), 
				Calculator.subtraction(value1, value2), 
				Calculator.multiplication(value1, value2), 
				Calculator.division(value1, value2) };

		Map<String, Float> map = new HashMap<>();

		for (byte i = 0; i < array1.length; i++) {
			map.put(array1[i], array2[i]);
		}
		result = map.get(op);
		System.out.print("O resultado é: " + result);

	}
}
