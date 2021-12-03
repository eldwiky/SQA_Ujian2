package No6;

import java.util.Scanner;

public class No6Main {
	class BebasException extends Exception {
		public BebasException(String s) {
		super(s);
		}
		}
		public class UjianBebasException {
		public static void main(String[] args) {
		//Ujian, gunakan inputan
		//jenis kelamin, status
		//pria blm menikah, pajak 10%
		//pria menikah, pajak 5%
		//wanita blm menikah, pajak 7%
		//wanita menikah, pajak 3%
		//validasi: jika diinputkan selain 2 jenis kelamin tersebut gunakan throw
		//validasi: jika diinputkan selain 2 status tersebut gunakan catch
			Scanner sc = new Scanner (System.in);
			System.out.print("Masukkan Jenis Kelamin: ");
			String JenisKelamin = sc.nextLine();
			System.out.print("Masukkan Status:");
			String menikah = sc.nextLine();
				
		
			if(JenisKelamin.equalsIgnoreCase("pria")) {
				if(menikah.equalsIgnoreCase("menikah")) {
					throw new ArithmeticException("Pajak 5%");
				}else {
					throw new ArithmeticException("Pajak 10%");
				}
				}else if (JenisKelamin.equals("wanita")) {
				if (menikah.equalsIgnoreCase("menikah")) {
					throw new ArithmeticException("Pajak 7%");
					}else {
						throw new ArithmeticException("Pajak 3%");
					}
					}else {
						throw new ArithmeticException("Jenis kelamin tidak tepat");
					}
		}
		}
		}
