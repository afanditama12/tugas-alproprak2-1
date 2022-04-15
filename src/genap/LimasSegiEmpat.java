/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package genap;

/**
 *
 * @author lenovo
 */
public class LimasSegiEmpat {
    public static void main(String[] args) {
        testValidasi();
    }
    
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

	/**
	 * fungsi volume limas segi empat
	 */
	public static void volume() {
		System.out.print("Masukan nilai sisi empat : ");
		var inputSisi = scanner.nextDouble();

		System.out.print("Masukan nilai tinggi segi empat : ");
		var inputTinggi = scanner.nextDouble();

		Double value = 1 * (inputSisi * inputSisi * (inputTinggi)) / 3;
		Integer volume = value.intValue();
		System.out.println("Volume limas segi empat adalah : " + volume);
	}

	/**
	 * testing fungsi volume limas segi empat
	 */
	public static void testVolume() {
		volume();
	}

	/**
	 * fungsi luas permukaan segi empat
	 */
	public static void luasPermukaan() {
		System.out.print("Masukan nilai sisi tegak : ");
		var inputSisiTegak = scanner.nextDouble();

		System.out.print("Masukan nilai sisi : ");
                var inputSisi = scanner.nextDouble();
                
                Double value = (inputSisi * inputSisi) + (4 * inputSisiTegak);
                Integer luasPermukaan = value.intValue();
                System.out.println("Luas permukaan limas segi empat adalah : " + luasPermukaan);
	}
        
        /**
         * testing fungsi luas permukaan
         */
        public static void testLuasPermukaan() {
            luasPermukaan();
        }
        
        /**
         * fungsi menampilkan hasil limas segi empat
         */
        public static void viewLimasSegiEmpat() {
            System.out.println("Pilih salah satu : ");
		System.out.println("1. luas permukaan limas segi empat");
		System.out.println("2. volume limas segi empat");
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
         * test fungsi view limas segi empat 
         */
        public static void testViewLimasSegiEmpat() {
            viewLimasSegiEmpat();
        }
        
        /**
         * fungsi validasi view limas segi empat
         */
        public static void validasi() {
            while (true) {
			System.out.print("ingin melanjutkan (ya/tidak) : ");
			var input3 = scanner.next();

			if (input3.equals("ya")) {
				viewLimasSegiEmpat();
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
         * test fungsi validasi
         */
        public static void testValidasi() {
            validasi();
        }
}
