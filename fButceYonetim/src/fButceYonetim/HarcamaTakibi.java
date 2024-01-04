package fButceYonetim;

import java.util.Scanner;

public class HarcamaTakibi extends Butce {

	public int harcamaSecimi;
	public double harcamaMiktari;
	public String harcamaTipi;

	public HarcamaTakibi(int birimSecimi) {
		super(birimSecimi);
		Scanner reader = new Scanner(System.in);
		System.out.println("LUTFEN HARCAMA MIKTARINI GIRINIZ");
		harcamaMiktari = reader.nextDouble();
		System.out.println("LUTFEN HARCAMA TIPINI SECINIZ\n1-KIRA 2-FATURALAR 3-YEMEK 4-ALISVERIS 5-EGLENCE 6-DIGER\n");
		harcamaSecimi = reader.nextInt();
	}

	public int harcama;
	public String HarcamaTipi;

	public void ButceGuncelleme() {
		Butce.butce = Butce.butce - harcamaMiktari;
	}

	public void HarcamaGecmisi() {
		switch (harcamaSecimi) {
		case 1:
			harcamaTipi = "KIRA";
			break;
		case 2:
			harcamaTipi = "FATURALAR";
			break;
		case 3:
			harcamaTipi = "YEMEK";
			break;
		case 4:
			harcamaTipi = "ALISVERIS";
			break;
		case 5:
			harcamaTipi = "EGLENCE";
			break;
		case 6:
			harcamaTipi = "DIGER";
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + harcamaSecimi);
		}
		System.out.println(harcamaMiktari + " " + " " + harcamaTipi);

	}
}
