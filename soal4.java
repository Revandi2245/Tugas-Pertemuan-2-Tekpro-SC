/*
 * Author : Revandi Faudiamar Putra Sitepu
 * NIM : 221524056
 * Kelas : 1B D4
 */
package pertemuan2;
import java.util.Scanner;

public class soal4 {
	public static void main(String[] args) {
		//kamus data
		int item, gajiPokok = 500000;
		double gaji;
		long bulatGaji;
		
		//membuat scanner
		Scanner keyboard = new Scanner(System.in);
		
		//algoritma
		item = keyboard.nextInt();
		
		//menghitung gaji dalam berbagai kondisi item
		gaji = (item > 80) ? item * 0.35 * 50000 + gajiPokok : (item > 40) ? item * 0.25 * 50000 + gajiPokok : (item < 15) ? (-15 + item)* 0.15 * 50000 + gajiPokok : item * 0.1 * 50000 + gajiPokok;
		
		//membulatkan nilai gaji untuk menghilangkan angka dibelakang titik
		bulatGaji = Math.round(gaji);
		System.out.println(bulatGaji);
		
		//menutup scanner
		keyboard.close();
	}
}
