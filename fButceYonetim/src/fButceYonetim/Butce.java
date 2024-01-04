package fButceYonetim;

import java.util.Scanner;

public class Butce {
	
	public String parabirimi3;
	public static String parabirimi;
	public static int birimSecimi;

	public Butce(int birimSecimi) {

		this.birimSecimi = birimSecimi;
		switch (birimSecimi) {
		case 1:
			parabirimi = "$";
			parabirimi3 = "$";
			break;
		case 2:
			parabirimi = "€";
			parabirimi3 = "€";
			break;
		case 3:
			parabirimi = "₺";
			parabirimi3 = "₺";
			break;
		case 4:
			parabirimi = "£";
			parabirimi3 = "£";
			break;
		case 5:
			parabirimi = "¥";
			parabirimi3 = "¥";
			break;
		case 6:
			parabirimi = "₽";
			parabirimi3 = "₽";
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + birimSecimi);
		}

	}

	public static double butce = 0;

	public void ButceGoruntuleme() {

		System.out.println("BUTCENIZ = " + butce + " " + parabirimi);

	}

	public void GelirGirme(double gelir) {

		butce = butce + gelir;

	}

	public void GiderGirme(double gider) {
		butce = butce - gider;
	}

	public static double butce2;
	public static String paraBirimi2;

	public static double baskaDovizeCevirme() {
		Scanner reader = new Scanner(System.in);
		System.out.println("CEVIRMEK ISTEDIGINIZ DOVIZI SECINIZ");
		System.out.println("1-USD 2-EUR 3-TL 4-GBP 5-JPY 6-RUB");
		int secim = reader.nextInt();
		if (birimSecimi == 1) {

			switch (secim) {
			case 1:
				butce2 = butce;
				paraBirimi2 = "$";
				break;
			case 2:
				butce2 = butce * 0.90;
				paraBirimi2 = "€";
				break;
			case 3:
				butce2 = butce * 30.07;
				paraBirimi2 = "₺";
				break;
			case 4:
				butce2 = butce * 0.79;
				paraBirimi2 = "£";
				break;
			case 5:
				butce2 = butce * 141.44;
				paraBirimi2 = "¥";
				break;
			case 6:
				butce2 = butce * 88.48;
				paraBirimi2 = "₽";
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + secim);
			}
		} else if (birimSecimi == 2) {
			switch (secim) {
			case 1:
				butce2 = butce * 1.11;
				paraBirimi2 = "$";
				break;
			case 2:
				butce2 = butce;
				paraBirimi2 = "€";
				break;
			case 3:
				butce2 = butce * 33.13;
				paraBirimi2 = "₺";
				break;
			case 4:
				butce2 = butce * 0.87;
				paraBirimi2 = "£";
				break;
			case 5:
				butce2 = butce * 156.62;
				paraBirimi2 = "¥";
				break;
			case 6:
				butce2 = butce * 97.95;
				paraBirimi2 = "₽";
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + secim);
			}
		} else if (birimSecimi == 3) {
			switch (secim) {
			case 1:
				butce2 = butce * 0.034;
				paraBirimi2 = "$";
				break;
			case 2:
				butce2 = butce * 0.031;
				paraBirimi2 = "€";
				break;
			case 3:
				butce2 = butce;
				paraBirimi2 = "₺";
				break;
			case 4:
				butce2 = butce * 0.027;
				paraBirimi2 = "£";
				break;
			case 5:
				butce2 = butce * 4.79;
				paraBirimi2 = "¥";
				break;
			case 6:
				butce2 = butce * 3.00;
				paraBirimi2 = "₽";
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + secim);
			}

		} else if (birimSecimi == 4) {
			switch (secim) {
			case 1:
				butce2 = butce * 1.27;
				paraBirimi2 = "$";
				break;
			case 2:
				butce2 = butce * 1.15;
				paraBirimi2 = "€";
				break;
			case 3:
				butce2 = butce * 37.60;
				paraBirimi2 = "₺";
				break;
			case 4:
				butce2 = butce;
				paraBirimi2 = "£";
				break;
			case 5:
				butce2 = butce * 180.41;
				paraBirimi2 = "¥";
				break;
			case 6:
				butce2 = butce * 112.75;
				paraBirimi2 = "₽";
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + secim);
			}
		} else if (birimSecimi == 5) {
			switch (secim) {
			case 1:
				butce2 = butce * 0.0071;
				paraBirimi2 = "$";
				break;
			case 2:
				butce2 = butce * 0.0064;
				paraBirimi2 = "€";
				break;
			case 3:
				butce2 = butce * 0.0056;
				paraBirimi2 = "₺";
				break;
			case 4:
				butce2 = butce * 0.21;
				paraBirimi2 = "£";
				break;
			case 5:
				butce2 = butce;
				paraBirimi2 = "¥";
				break;
			case 6:
				butce2 = butce * 0.63;
				paraBirimi2 = "₽";
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + secim);
			}
		} else if (birimSecimi == 6) {
			switch (secim) {
			case 1:
				butce2 = butce * 0.011;
				paraBirimi2 = "$";
				break;
			case 2:
				butce2 = butce * 0.010;
				paraBirimi2 = "€";
				break;
			case 3:
				butce2 = butce * 0.33;
				paraBirimi2 = "₺";
				break;
			case 4:
				butce2 = butce * 0.0089;
				paraBirimi2 = "£";
				break;
			case 5:
				butce2 = butce * 1.60;
				paraBirimi2 = "¥";
				break;
			case 6:
				butce2 = butce;
				paraBirimi2 = "₽";
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + secim);
			}
		} else if (birimSecimi == 6) {
			switch (secim) {
			case 1:
				butce2 = butce * 0.011;
				paraBirimi2 = "$";
				break;
			case 2:
				butce2 = butce * 0.010;
				paraBirimi2 = "€";
				break;
			case 3:
				butce2 = butce * 0.0089;
				paraBirimi2 = "₺";
				break;
			case 4:
				butce2 = butce * 0.33;
				paraBirimi2 = "£";
				break;
			case 5:
				butce2 = butce * 1.60;
				paraBirimi2 = "¥";
				break;
			case 6:
				butce2 = butce;
				paraBirimi2 = "₽";
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + secim);
			}
		} else {
			throw new IllegalArgumentException("Unexpected value: " + secim);
		}
		return butce2;
	}

	String dovizKurlari = "DOVIZ KURLARI\n1-DOLAR = 30.07 TL 2-EURO = 33.13 TL 3-POUND"
			+ " = 37.60 TL 4-YEN = 0.0056 TL 5-RUBLE = 0.33 TL";

	public void DovizKuruGosterme() {
		System.out.println(dovizKurlari);
	}

	public void DovizKuruGosterme(String eklenenKur, double karsilik) {
		dovizKurlari += " " + eklenenKur + " = ";
		System.out.print(dovizKurlari + karsilik + " TL");
	}

}
