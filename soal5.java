/*
 * Author : Revandi Faudiamar Putra Sitepu
 * NIM : 221524056
 * Kelas : 1B D4
 */
package pertemuan2;
import java.util.Scanner;

public class soal5 {
	public static void main (String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
		long plat = keyboard.nextLong();
		keyboard.close();
		
		long platStatus = (plat - 100000)%5 ;
		
		String platJalan = (platStatus == 0) ? "Berhenti" : "Jalan";
		System.out.println(platJalan);
		
	}
}
