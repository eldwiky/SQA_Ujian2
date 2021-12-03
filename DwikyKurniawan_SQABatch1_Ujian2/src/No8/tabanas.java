package No8;

public class tabanas extends Tabungan{
	private String nama;
	 private int norek;
	 private int saldo;
	 
	 public void nama(String x) {
			nama = x;
		}

		public void norek(int x) {
			norek = x;
		}

		public void saldo(int x) {
			saldo = x;
		}

		public String getNama() {
			return nama;
		}

		public int getNorek() {
			return norek;
		}

		public int getSaldo() {
			return saldo;
		}
}
