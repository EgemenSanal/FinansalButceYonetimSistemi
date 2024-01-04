package fButceYonetim;

import java.util.Date;

public class FinansalHedef extends Butce {

	Date date = new Date();
	private static int birimSecimi;
	private double hedef;

	public FinansalHedef(double hedef, int birimsecimi) {
		super(birimsecimi);
		this.hedef = hedef;
	}

	public void FinansalHedefGoster() {
		System.out.println(".HEDEF = " + hedef + " " + parabirimi3 + " OLUSTURMA TARIHI = " + date);
	}

}
