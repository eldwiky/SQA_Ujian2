package No4;

import java.util.Scanner;

public class No4Main {
	public static void main(String[]args) {
		Scanner in = new Scanner (System.in);
		System.out.print("Masukkan sisa BBM dalam tangki (liter): ");
		double sisa = in.nextDouble();
		System.out.print("Masukkan konsumsi BBM kendaraan (km/liter): ");
		double jarakPerLiter = in.nextDouble();
		System.out.println("Kendaraan anda dapat menempuh jarak " +hitungSisaJarak(sisa, jarakPerLiter)+ " kilometer dengan BBM yang ada di tangki");
		}
		static double hitungSisaJarak(double sisa, double jarakPerLiter) {
		double sisaJarak = sisa * jarakPerLiter;
		return sisaJarak;
		}
}
