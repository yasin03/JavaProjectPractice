package _HastaneOtomasyon;

import java.util.Scanner;

public class HastaneRunner extends Hastane {
    static Hastane hastane = new Hastane();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("\n========== TechPro Hospital Hoşgeldiniz ==========");

        hastaKayit();
        sikayetListele();
        sikayetSecim();


    }



    private static void hastaKayit() {
        System.out.println("Lütfen isminizi soyisminiz giriniz : ");
        String isimsoyisim = scan.nextLine();

        Hasta hasta = new Hasta(isimsoyisim);
        hastane.setHasta(hasta);

    }

    private static void sikayetListele() {

        for (int i = 0; i < hastane.AktuelDurum.size(); i++) {
            System.out.println((i + 1) + " - " + hastane.AktuelDurum.get(i));
        }
    }

    private static void sikayetSecim() {
        System.out.println("Lütfen şikayetinizi seçiniz : ");

        int secim = scan.nextInt();
        Durum durum = new Durum(hastane.AktuelDurum.get(secim-1),false);
        doktorBul(secim);
    }

    private static void doktorBul(int secim) {

        System.out.println("Doktorunuz : "+hastane.doktorUnvan.get(secim - 1)+" "+ hastane.doktorAdi.get(secim - 1)+" "+hastane.doktorSoyadi.get(secim - 1));

        System.out.println("Hasta Kayıt No : "+hastane.getHasta().getHastaId() +"\nHasta Adı Soyadı : "+ hastane.getHasta().getHastaAdiSoyadi());

        System.out.println("Hastanın Şikayeti : "+ hastane.AktuelDurum.get(secim - 1));

        System.out.println("Aciliyet Durumu : Acil değildir.");
    }
}
