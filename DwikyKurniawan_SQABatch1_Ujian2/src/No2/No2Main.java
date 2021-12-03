package No2;
import java.util.Scanner;
public class No2Main {
	public static void main(String[]args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Masukkan merk kendaraan = ");
		String merk = in.nextLine();
		System.out.println("Masukkan tipe kendaraan = ");
		String tipe = in.nextLine();
		System.out.println("Masukkan tahun pembuatan = ");
		int tahun = in.nextInt();
		int pajak;
		System.out.println("Pajak tahunan untuk "+merk+" "+tipe+" tahun"+tahun+ " adalah Rp. "+hitungPajak(produksi));
		}

	static void hitungPajak(int produksi) {
		if (produksi>2020) {
		produksi = 4000000;
		}else if (produksi>2010) {
			produksi = 2000000;
		}else if(produksi>2000){
			produksi = 1000000;
		}else if(produksi>1990) {
			produksi = 750000;
		}else if(produksi>1980) {
			produksi = 500000;
		}else {
			produksi = 250000;
		}
		}
}
