package fButceYonetim;

public class Rapor extends Butce {
	public Rapor(int birimSecimi) {
		super(birimSecimi);
	}
	
	public static String parabirimi3 = "₺";
	private static int RaporID;

	public static class Olustur {
		public Olustur() {
			System.out.println("FINANSAL YONETIM SISTEMI RAPORU");
			System.out.println("GELISMIS RAPOR ICIN 1 NORMAL RAPOR ICIN 2 GIRINIZ");
		}

		public void RaporOlustur(String duzenlenmeNedeni) {
			System.out.println("BUTCENIZ = " + butce + " " + parabirimi);

			System.out.println("BUTCENIZIN PARA BIRIMI = " + parabirimi);
			System.out.println("DOVIZ KURLARI = 1-DOLAR = 30.07 TL 2-EURO = 33.13 TL 3-POUND"
					+ " = 37.60 TL 4-YEN = 0.0056 TL 5-RUBLE = 0.33 TL");
			System.out.println("DUZENLENME NEDENI = " + duzenlenmeNedeni);
			
			
		}

		public void RaporOlustur() {
			System.out.println("BUTCENIZ = " + butce + " " + parabirimi);

			System.out.println("DOVIZ KURLARI = 1-DOLAR = 30.07 TL 2-EURO = 33.13 TL 3-POUND"
					+ " = 37.60 TL 4-YEN = 0.0056 TL 5-RUBLE = 0.33 TL");
			
		}

		public static void getRaporID() {
			RaporID = (int) (Math.random() * ((2000 - 1000) + 1)) + 1000;
		}

		public static int printRaporID() {
			return RaporID;
		}

	}

}
