package No9;

import java.util.Scanner;

public class No9Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	   
    System.out.print("Masukan Jumlah angka : ");
    int nilai=sc.nextInt();
	}
	public int jumlahArray(int[] nilai) {
		 int sum = 0;
		 for (int i = 0; i<nilai.length; i++) {
		  sum += nilai[i];
		 }
		 return sum;
		}
		public boolean cariNilai(int[] arr, int nilai) {
		 for (int x = 0; x<arr.length; x++) {
		  if (arr[x] == nilai)
		   return true;
		 }
		 return false;
		}
	}

