/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package genap;

/**
 *
 * @author lenovo
 */
public class Tabung {
    public static void main(String[] args) {
        viewTabung();
    }
    
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

	/**
	 * fungsi volume tabung
	 */
	public static void volume() {
		System.out.print("Masukan nilai jari-jari tabung : ");
		var inputJari = scanner.nextDouble();

		System.out.print("Masukan nilai tinggi tabung : ");
		var inputTinggi = scanner.nextDouble();

		Double value = Math.PI * inputJari * inputJari * inputTinggi;
		Integer volume = value.intValue();
		System.out.println("volume tabung adalah : " + volume);
	}

	/**
	 * testing fungsi volume tabung
	 */
	public static void testVolume() {
		volume();
	}

	public static void luasPermukaan() {
		System.out.print("Masukan nilai jari-jari tabung : ");
		var inputJari = scanner.nextDouble();

		System.out.print("Masukan nilai tinggi tabung : ");
		var inputTinggi = scanner.nextDouble();

		Double value2 = 2 * Math.PI * inputJari * (inputJari + inputTinggi);
		Integer luasPermukaan = value2.intValue();
		System.out.println("luas permukaan tabung adalah : " + luasPermukaan);
	}

	/**
	 * testing fungsi luas permukaan tabung
	 */
	public static void testLuasPermukaan() {
		luasPermukaan();
	}

	/**
	 * fungsi menampilkan hasil tabung
	 */
	public static void viewTabung() {
		System.out.println("Pilih salah satu : ");
		System.out.println("1. luas permukaan tabung");
		System.out.println("2. volume tabung");
		System.out.print("Masukan angka yang dipilih : ");
		var tampil = scanner.next();

		if (tampil.equals("1")) {
			luasPermukaan();
			validasi();
		} else if (tampil.equals("2")) {
			volume();
			validasi();
		} else {
			System.out.println("pilihan tidak tersedia");
		}
	}

	/**
	 * testing fungsi menampilkan hasil tabung
	 */
	public static void testViewTabung() {
		viewTabung();
	}

	/**
	 * fungsi validasi view tabung
	 */
	public static void validasi() {
		while (true) {
			System.out.print("ingin melanjutkan (ya/tidak) : ");
			var input3 = scanner.next();

			if (input3.equals("ya")) {
				viewTabung();
				break;
			} else if (input3.equals("tidak")) {
				System.out.println("Terimakasih sudah berkunjung");
				break;
			} else {
				System.out.println("pilihan tidak tersedia");
			}
		}
	}

	/**
	 * testing fungsi view Tabung
	 */
	public static void testValidasi() {
		validasi();
	}
}
