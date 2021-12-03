package No3;

import java.util.Scanner;

public class No3Main {
	public static void main(String[]args) {
		Scanner in = new Scanner (System.in);
		System.out.print("Masukkan Jarak (kilometer): ");
		double kilometer = in.nextDouble();
		System.out.print("Masukkan Waktu (jam): ");
		double jam = in.nextDouble();
		System.out.println("Kecepatan rata-rata anda adalah " +hitungKecepatan(kilometer, jam)+ " km/Jam");
		}
		static double hitungKecepatan(double kilometer, double jam) {
			return kilometer/jam;
		}
}
