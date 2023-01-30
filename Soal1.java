/*
 * Author : Revandi Faudiamar Putra Sitepu
 * NIM : 221524056
 * Kelas : 1B D4
 */

package pertemuan2;
import java.util.Scanner;

public class Soal1 {
	public static void main(String[] args) {
		//kamus data
		String kalimat, kata[] ;
		
		//membuat scan keyboard
		Scanner keyboard = new Scanner(System.in);
		
		//algoritma
		kalimat = keyboard.nextLine() ;
		
		//memisahkan token dari kalimat dan menghitung jumlah kata yang dipisahkan
		kata = kalimat.split("[ !,?._'@]");
		System.out.println(kata.length);
		for (String s : kata) {
		    System.out.println(s);
		}
		
		//menutup scanner
		keyboard.close();
	}
}
