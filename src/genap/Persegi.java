/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package genap;

/**
 *
 * @author lenovo
 */
public class Persegi {
    public static void main(String[] args) {
        viewPersegi();
    }
    
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

	/**
	 * fungsi luas persegi
	 */
	public static void luas() {
		System.out.print("Masukan nilai sisi persegi : ");
		var input = scanner.nextDouble();

		Double value = input * input;
		Integer luas = value.intValue();
		System.out.println("Luas persegi adalah : " + luas);
	}

	/**
	 * testing fungsi luas persegi
	 */
	public static void testLuas() {
		luas();
	}

	/**
	 * fungsi keliling persegi
	 */
	public static void keliling() {
		System.out.print("Masukan nilai sisi persegi : ");
		var input = scanner.nextDouble();

		Double value = 4 * input;
		Integer keliling = value.intValue();
		System.out.println("Keliling persegi adalah : " + keliling);
	}

	/**
	 * testing fungsi keliling persegi
	 */
	public static void testKeliling() {
		keliling();
	}

	/**
	 * fungsi menampilkan hasil persegi
	 */
	public static void viewPersegi() {
		System.out.println("Pilih salah satu : ");
		System.out.println("1. keliling persegi");
		System.out.println("2. luas persegi");
		System.out.print("Masukan angka yang dipilih : ");
		var tampil = scanner.next();

		if (tampil.equals("1")) {
			keliling();
			validasi();
		} else if (tampil.equals("2")) {
			luas();
			validasi();
		} else {
			System.out.println("pilihan tidak tersedia");
		}
	}

	/**
	 * testing fungsi menampilkan hasil persegi
	 */
	public static void testViewPersegi() {
		viewPersegi();
	}

	/**
	 * fungsi validasi view persegi
	 */
	public static void validasi() {
		while (true) {
			System.out.print("ingin melanjutkan (ya/tidak) : ");
			var input3 = scanner.next();

			if (input3.equals("ya")) {
				viewPersegi();
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
	 * testing fungsi view tabung
	 */
	public static void testValidasi() {
		validasi();
	}
}
