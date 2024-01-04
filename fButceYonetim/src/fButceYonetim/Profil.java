package fButceYonetim;

public class Profil extends user {
	private int yas;
	private String meslek;

	public Profil(String name, String surname) {
		super(name, surname);
	}

	public void printNameSurname() {
		System.out.println(name + " " + surname);
	}

	public void Bilgiler(int yas, String meslek) {
		this.yas = yas;
		this.meslek = meslek;
		System.out.println("-KULLANICI BILGILERI-\nADI SOYADI = " + this.name + " " + surname + "\n" + "YAS = " + yas
				+ "\nMESLEK = " + meslek);
	}

	public void Bilgiler() {
		System.out.println("-KULLANICI BILGILERI-\nADI SOYADI = " + this.name + " " + surname);
	}
	
}
