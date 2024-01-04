package fButceYonetim;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import java.util.Date;
import java.util.Date;

public class finansalButceYonetim {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		ArrayList<FinansalHedef> hedef = new ArrayList<FinansalHedef>();
		ArrayList<HarcamaTakibi> htakibi = new ArrayList<HarcamaTakibi>();
		ArrayList<Notes> notes = new ArrayList<Notes>();
		System.out.println("FINANSAL BUTCE PLANLAMA SISTEMI");
		System.out.println("LUTFEN HESAP ACMAK ICIN ISMINIZI,SOYISMINIZI VE BELIRLEDIGINIZ BIR SIFREYI YAZINIZ");
		String isim = reader.next();
		String soyisim = reader.next();

		user user1 = new user(isim, soyisim);

		String sifre = reader.next();
		user1.password(sifre);
		System.out.println("SISTEME HOSGELDIN " + user1.name);
		System.out.println("LUTFEN PARABIRIMI SECINIZ\n1-USD 2-EUR 3-TL 4-GBP 5-JPY 6-RUB");
		int paraBirimi = reader.nextInt();
		Exception ozeldurum = new Exception("HATALI SECIM: ANA EKRANA DONULDU");
		Exception hataliSifre = new Exception("HATALI SIFRE GIRISI");
		
		Butce b1 = new Butce(paraBirimi);
		do {
			try {
			System.out.println(
					"\nLUTFEN YAPMAK ISTEDIGINIZ ISLEMI SECINIZ\n1-BUTCE ISLEMLERI\n2-FINANSAL HEDEF GIRME\n3-HARCAMA TAKIBI\n4-Rapor\n5-NOT YAZMA\n6-PROFIL");

			int secim1 = reader.nextInt();
			if (secim1 == 1) {
				System.out.println(
						"BUTCE ISLEMLERINE HOS GELDINIZ\nYAPMAK ISTEDIGINIZ ISLEMI SECINIZ\n1-BUTCE GORUNTULEME\n2-GELIR GIRME\n3-GIDER GIRME\n4-BASKA DOVIZ "
								+ "CINSINDEN BUTCE GORUNTULEME\n5-DOVIZ KURLARI");
				int secim2 = reader.nextInt();
				if (secim2 == 1) {
					b1.ButceGoruntuleme();
					user1.devam();
				} else if (secim2 == 2) {
					System.out.println("GIRMEK ISTEDIGINIZ GELIR MIKTARINI GIRINIZ");
					double gelir = reader.nextDouble();
					b1.GelirGirme(gelir);
					user1.devam();
				} else if (secim2 == 3) {
					System.out.println("GIRMEK ISTEDIGINIZ GIDER MIKTARINI GIRINIZ");
					double gider = reader.nextDouble();
					b1.GiderGirme(gider);
					user1.devam();
				} else if (secim2 == 4) {
					System.out.println("BUTCENIZ = " + b1.baskaDovizeCevirme() + " " + b1.paraBirimi2);
					user1.devam();
				} else if (secim2 == 5) {
					double karsilik;
					String eklenenKur;
					b1.DovizKuruGosterme();
					System.out.println("DOVIZ KURU EKLEMEK ISTER MISINIZ 1-EVET 2-HAYIR");
					int kurSecim = reader.nextInt();
					if (kurSecim == 1) {
						System.out.println("EKLEYECEGINIZ KUR ADINI VE TL KARSILIGINI YAZINIZ");
						eklenenKur = reader.next();
						karsilik = reader.nextDouble();
						System.out.println("GUNCELLEDIGINIZ KUR LISTESINI GORUNTULEMEK ISTER MISINIZ? 1-EVET 2-HAYIR");
						int guncelKur = reader.nextInt();
						if (guncelKur == 1) {
							b1.DovizKuruGosterme(eklenenKur, karsilik);
							user1.devam();
						}else if(guncelKur ==2) {
							user1.devam =1;
						}
					}else if(kurSecim == 2) {
						user1.devam =1;
					}

				}

			} else if (secim1 == 2) {
				System.out.println("FINANSAL HEDEF GIRME\nLUTFEN YAPMAK ISTEDIGINIZ ISLEMI SECINIZ\n1-FINANSAL"
						+ " HEDEF OLUSTURMA 2-FINANSAL HEDEF SILME 3-FINANSAL HEDEF(LERI) GORUNTULEME\n");
				int secim3 = reader.nextInt();
				if (secim3 == 1) {
					System.out.println("EKLEMEK ISTEDIGINIZ HEDEFINIZI GIRINIZ");
					double finansalHedefGiris = reader.nextDouble();
					System.out.println("LUTFEN PARABIRIMI SECINIZ\n1-USD 2-EUR 3-TL 4-GBP 5-JPY 6-RUB");
					paraBirimi = reader.nextInt();
					hedef.add(new FinansalHedef(finansalHedefGiris, paraBirimi));
					user1.devam();
				}
				if (secim3 == 2) {
					System.out.println("LUTFEN SILMEK ISTEDIGINIZ HEDEFI SECINIZ");
					int i = 1;
					for (FinansalHedef hedefler : hedef) {
						System.out.print(i);
						i++;
						hedefler.FinansalHedefGoster();

					}
					int j = reader.nextInt();

					hedef.remove(j - 1);
					user1.devam();
				} else if (secim3 == 3) {
					int i = 1;
					for (FinansalHedef hedefler : hedef) {
						System.out.print(i);
						i++;
						hedefler.FinansalHedefGoster();
						System.out.println();
					}
					user1.devam();
				}

			} else if (secim1 == 3) {
				System.out.println(
						"HARCAMA TAKIBI\nLUTFEN YAPMAK ISTEDIGINIZ ISLEMI SECINIZ\n1-HARCAMA GIRME 2-HARCAMA GECMISI 3-TOPLAM HARCAMA");
				int harcamatakipSecim = reader.nextInt();
				if (harcamatakipSecim == 1) {
					htakibi.add(new HarcamaTakibi(paraBirimi));
					for (HarcamaTakibi h4 : htakibi) {
						h4.ButceGuncelleme();
					}
					user1.devam();
				} else if (harcamatakipSecim == 2) {
					int i = 1;
					for (HarcamaTakibi h1 : htakibi) {
						System.out.print((i) + ". ");
						i++;
						h1.HarcamaGecmisi();
					}
					user1.devam();
				} else if (harcamatakipSecim == 3) {
					double total = 0;
					for (HarcamaTakibi h2 : htakibi) {
						total += h2.harcamaMiktari;
					}
					System.out.println("TOPLAM HARCAMA MIKTARI = " + total + " " + b1.parabirimi3);
					user1.devam();
				}

			} else if (secim1 == 4) {
				Rapor r1 = new Rapor(paraBirimi);
				Rapor.Olustur olustur = new Rapor.Olustur();
				int raporTuru = reader.nextInt();
				reader.nextLine();
				if (raporTuru == 1) {
					System.out.println("RAPORUN OLUSTURULMA NEDENINI GIRINIZ");
					String duzenlenmeNedeni = reader.nextLine();
					olustur.RaporOlustur(duzenlenmeNedeni);
					olustur.getRaporID();
					System.out.println("RAPOR ID = " + olustur.printRaporID());
					System.out.println("HEDEFLER = ");
					int i = 1;
					for(FinansalHedef hedefler :hedef) {
						
						System.out.print(i);
						i++;
						hedefler.FinansalHedefGoster();
					}
				} else if (raporTuru == 2) {
					olustur.RaporOlustur();
					olustur.getRaporID();
					System.out.println("RAPOR ID = " + olustur.printRaporID());
				}

				user1.devam();
			} else if (secim1 == 5) {

				System.out.println(
						"NOT OLUSTURMA SISTEMI\nISLEM SECINIZ\n1-NOT OLUSTURMA 2-NOT SILME 3-NOTLARI GORUNTULEME"
								+ " 4-NOTA METIN EKLEME");
				int notSecim = reader.nextInt();
				reader.nextLine();
				if (notSecim == 1) {
					System.out.println("GIRMEK ISTEDIGINIZ NOTU YAZINIZ");
					String not = reader.nextLine();
					notes.add(new Notes(not));

					user1.devam();
				} else if (notSecim == 2) {
					System.out.println("SILMEK ISTEDIGINIZ NOTU SECINIZ\n");
					int i = 1;
					for (Notes n2 : notes) {
						
						System.out.print("\n" + i + ". NOT = ");
						i++;
						n2.Goster();
						n2.Tarih();
					}
					int k = reader.nextInt();
					notes.remove(k - 1);
					user1.devam();
				} else if (notSecim == 3) {
					int i = 1;
					for (Notes n3 : notes) {
						System.out.print("\n" + i + ". NOT = ");
						i++;
						n3.Goster();
						n3.Tarih();
					}
					user1.devam();
				} else if (notSecim == 4) {
					System.out.println("METIN EKLEMEK ISTEDIGINIZ NOTU SECINIZ\n");
					int i = 1;
					for (Notes n3 : notes) {
						System.out.print("\n" + i + ". NOT = ");
						i++;
						n3.Goster();
						n3.Tarih();
					}
					int l = reader.nextInt();
					reader.nextLine();
					Notes notindex = notes.get(l - 1);
					System.out.println("EKLEMEK ISTEDIGINIZ METNI GIRINIZ");
					String ekCumle = reader.nextLine();
					notindex.NotEkle(ekCumle);
				}

			} else if (secim1 == 6) {
				System.out.println("LUTFEN SIFRENIZI GIRINIZ");
				String sifreKontrol = reader.next();
				if (user1.password.equals(sifreKontrol)) {
					System.out.println("SIFRE DOGRU");
					Profil p1 = new Profil(isim, soyisim);
					System.out.println(
							"NORMAL PROFIL ICIN 1 BASIT PROFIL ICIN 2 GIRINIZ.SIFRE DEGISTIRMEK ICIN 3 GIRINIZ");
					int profilSecim = reader.nextInt();
					if (profilSecim == 1) {
						System.out.println("YASINIZI VE MESLEGINIZI YAZINIZ");
						int yas = reader.nextInt();
						String meslek = reader.nextLine();
						p1.Bilgiler(yas, meslek);
						b1.ButceGoruntuleme();
						user1.getMemberNumber();
						user1.Goster();
						user1.Tarih();
					} else if (profilSecim == 2) {
						p1.Bilgiler();
						b1.ButceGoruntuleme();
					}else if(profilSecim ==3) {
						System.out.println("YENI SIFREYI GIRINIZ");
						String yeniSifre = reader.next();
						user1.SifreDegis(yeniSifre);
					}
				} else {

					try {
						System.out.println("HATALI SIFRE GIRISI.TEKRAR GIRINIZ");
						if (!user1.password.equals(sifreKontrol)) {
							System.out.println("YANLIS SIFRE");
						} else {
							throw hataliSifre;
						}
					} catch (Exception e) {
						System.out.println(e.getMessage());
						System.exit(1);

					}
				}
				user1.devam();
			} else if (secim1 > 6 || secim1 < 1) {
				throw ozeldurum;
			}
			}catch (Exception e) {
				System.out.println("HATALI GIRIS YAPTINIZ");
				System.exit(1);
			}
		} while (user1.devam == 1);
	}
}
