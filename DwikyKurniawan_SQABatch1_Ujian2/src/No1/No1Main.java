package No1;

import java.util.Scanner;

public class No1Main {
	public static void main(String[]args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Masukkan nilai maksimal deret = ");
		int batas = in.nextInt();
		cetakFibonacci(batas);
		}
		static void cetakFibonacci(int batas) {
			int a = 0;
	        int b = 1;
	        int c = 1;
	        for (int i =1; i <= batas; i++){
	            System.out.print(b + " ");
	            c = a + b;
	            a = b;
	            b = c;
				
			
			}
		}

}
