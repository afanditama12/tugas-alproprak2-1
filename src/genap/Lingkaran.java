/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package genap;

/**
 *
 * @author lenovo
 */
public class Lingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        viewLingkaran();
    }
    
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

	/**
	 * fungsi luas lingkaran
	 */
	public static void luas() {
		System.out.print("Masukan nilai jari-jari lingkaran : ");
		var input = scanner.nextDouble();

		Double value = Math.PI * input * input;
		Integer luas = value.intValue();
		System.out.println("Luas lingkaran adalah : " + luas);
	}

	/**
	 * testing fungsi luas lingkaran
	 */
	public static void testLuas() {
		luas();
	}

	/**
	 * fungsi keliling lingkaran
	 */
	public static void keliling() {
		System.out.print("Masukan nilai jari-jari lingkaran : ");
		var input2 = scanner.nextDouble();

		Double value2 = 2 * Math.PI * input2;
		Integer keliling = value2.intValue();
		System.out.println("Keliling lingkaran adalah : " + keliling);
	}

	/**
	 * testing fungsi keliling lingkaran
	 */
	public static void testKeliling() {
		keliling();
	}

	/**
	 * fungsi menampilkan hasil lingkaran
	 */
	public static void viewLingkaran() {
		System.out.println("Pilih salah satu : ");
		System.out.println("1. keliling lingkaran");
		System.out.println("2. luas lingkaran");
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
	 * testing fungsi menampilkan hasil lingkaran
	 */
	public static void testViewLingkaran() {
		viewLingkaran();
	}

	/**
	 * fungsi validasi view lingkaran
	 */
	public static void validasi() {
		while (true) {
			System.out.print("ingin melanjutkan (ya/tidak) : ");
			var input3 = scanner.next();

			if (input3.equals("ya")) {
				viewLingkaran();
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
	 * testing fungsi view lingkaran
	 */
	public static void testValidasi() {
		validasi();
	}
}
