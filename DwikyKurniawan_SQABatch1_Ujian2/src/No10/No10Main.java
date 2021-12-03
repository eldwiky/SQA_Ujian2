package No10;

public class No10Main {

	public static void main(String[] args) {
		Sekolah sekolah = new Sekolah();
		SMA sma = new SMA();
		sma.nama("SMA NEGERI 70 JAKARTA");
		sma.alamat("JL. Selamat");
		sma.jenjang("SMA");
		
		sma.nama();System.out.println(sma.getNama());
		sma.alamat();System.out.println(sma.getAlamat());
		sma.jenjang();System.out.println(sma.getJenjang());
		
		SMK smk = new SMK();
		smk.nama("SMK NEGERI 16 JAKARTA");
		smk.alamat("JL. Berkah");
		smk.jenjang("SMK");
		
		smk.nama();System.out.println(smk.getNama());
		smk.alamat();System.out.println(smk.getAlamat());
		smk.jenjang();System.out.println(smk.getJenjang());
			
		}
}
