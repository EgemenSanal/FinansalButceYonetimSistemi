package fButceYonetim;

import java.util.Scanner;

import java.util.Date;

public class user extends Olusturma {

	Scanner reader = new Scanner(System.in);
	public int devam;
	public String name;
	public String surname;
	public String password;

	public user(String name, String surname) {

		this.name = name;
		this.surname = surname;

	}

	public void password(String sifre) {

		password = sifre;

	}

	private int memberNumber;

	public void getMemberNumber() {
		this.memberNumber = (int) (Math.random() * ((2000 - 1000) + 1)) + 1000;

	}

	@Override
	public void Tarih() {
		Date date = new Date();
		System.out.println("HESAP OLUSTURMA SAATI = " + date);
	}
	
	@Override
	public void Goster() {
		System.out.println("KULLANICI ID = " + memberNumber);

	}
	
	public int devam() {
		System.out.println("\nISLEME DEVAM ETMEK ISTER MISINIZ? 1-EVET 2-HAYIR");
		devam = reader.nextInt();
		return devam;
	}
	public void SifreDegis(String yeniSifre) {
		this.password = yeniSifre;
	}

}
