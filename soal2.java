/*
 * Author : Revandi Faudiamar Putra Sitepu
 * NIM : 221524056
 * Kelas : 1B D4
 */
package pertemuan2;
import java.util.Scanner;

public class soal2 {
	public static void main(String[] args) {
		//kamus data
		String kata1, kata2, kata3;
		int nom1, nom2, nom3;
		
		//MembuatScanner
		Scanner keyboard = new Scanner(System.in); 
		
		//Algoritma 
		kata1 = keyboard.next();
		nom1 = keyboard.nextInt();
		kata2 = keyboard.next(); 
		nom2 = keyboard.nextInt(); 
		kata3 = keyboard.next(); 
		nom3 = keyboard.nextInt();
		
		//Membuat kondisi untuk tiap kata dan nomor
		System.out.println("================================"); 
	
		//Kata dan nomor pertama
		System.out.print(kata1+"\t\t");
		if(nom1 < 10){ 
			System.out.println("0"+"0"+ nom1); 
			}
		if(nom1 >= 10 && nom1 < 100){ 
			System.out.println("0"+ nom1); 
			}
		if (nom1 >= 100) { 
			System.out.println(nom1);
		}
		
		//Kata dan nomor kedua
		System.out.print(kata2+"\t\t"); 
		if (nom2 < 10){ 
			System.out.println("0"+"0"+ nom2);
		}
		if(nom2 >= 10 && nom2 < 100){ 
			System.out.println("0"+ nom2); 
		}
		if (nom2 >= 100) {
			System.out.println( nom2);
		}
		
		//Kata dan nomor ketiga
		System.out.print(kata3+"\t\t"); 
		if (nom3 < 10){ 
		 	System.out.println("0"+"0"+ nom3); 
			}
		if(nom3 >= 10 && nom3 < 100){ 
			System.out.println("0"+nom3); 
			}
		if (nom3 >= 100) {
			System.out.println(nom3); 
		}
		System.out.println("================================"); 
		
		//menutup scanner
		keyboard.close();
	}
}