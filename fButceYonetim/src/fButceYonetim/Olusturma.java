package fButceYonetim;

public abstract class Olusturma {
	public String note;
	public String note2;

	public void NotEkle(String note2) {
		this.note2 = note2;
		this.note = this.note + " " + this.note2;
	}

	public abstract void Tarih();

	public abstract void Goster();

}
