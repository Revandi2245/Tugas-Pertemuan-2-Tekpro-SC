/*
 * Author : Revandi Faudiamar Putra Sitepu
 * NIM : 221524056
 * Kelas : 1B D4
 */
package pertemuan2;
import java.util.Scanner;

public class soal3 {
	public static void main(String[] args) {
		//kamus data
		int a, b;
		String operator;
		
		//membuat scanner
		Scanner keyboard = new Scanner (System.in);
		
		//algoritma
		a = keyboard.nextInt();
		operator = keyboard.next();
		b = keyboard.nextInt();
		
		//case untuk menentukan jenis operator dan operasinya dari input
		switch (operator) {
		case "+":
			System.out.println(a + b);
			break;
		case "-":
			System.out.println(a - b);
			break;
		case "*":
			System.out.println(a * b);
			break;
		case "/":
			System.out.println(a / b);
			break;
		case "%":
			System.out.println(a % b);
			break;
		}
		
		//menutup scanner
		keyboard.close();
	}
}