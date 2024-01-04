package fButceYonetim;

import java.util.Date;

public class Notes extends Olusturma {

	public Notes(String note) {
		this.note = note;
	}

	@Override
	public void Tarih() {

		Date date = new Date();
		System.out.println("NOTUN YAZILMA TARIHI = " + date);
	}

	@Override
	public void Goster() {
		System.out.print(this.note + "\n");
	}

}
