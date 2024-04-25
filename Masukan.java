import java.util.Scanner;

public class Masukan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner masukan = new Scanner(System.in);
		String nama;
		System.out.println("Masukkan nama Anda");
		nama = masukan.nextLine(); // Coba ganti menjadi masukan.next();
		System.out.println("Selamat Datang, " + nama);
	}

}
