/*
 * Author : Revandi Faudiamar Putra Sitepu
 * NIM : 221524056
 * Kelas : 1B D4
 */
package pertemuan2;
import java.math.BigInteger;
import java.util.Scanner;

public class soal6 {
	public static void main (String [] args) {
		//kamus data
		BigInteger a, b, tambah, kali;
		
		//membuat scanner
		Scanner keyboard = new Scanner(System.in);
		
		//algoritma
		a = keyboard.nextBigInteger();
		b = keyboard.nextBigInteger();
		
		//pertambahan
		tambah = a.add(b) ;
		System.out.println(tambah);
		
		//kali
		kali = a.multiply(b);
		System.out.println(kali);
		
		//menutup scanner
		keyboard.close();
	}
}
