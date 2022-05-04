package _BiletAlma;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class YerliMusteri extends Yolcu {

    Scanner scan = new Scanner(System.in);
    List<YerliMusteri> musteriList = new ArrayList<YerliMusteri>();
    private String tcNo;

    public YerliMusteri() {
    }

    public YerliMusteri(String name, String surname, String cinsiyet, String telefon, String tcNo) {
        super(name, surname, cinsiyet, telefon);
        this.tcNo = tcNo;
    }

    public void girisEkranı() {
        System.out.println("HOŞGELDİNİZ");
        System.out.println("Türk vatandaşıysanız 1 Yabancıysanız 0 basınız");
        int vatandaslik = scan.nextInt();
        scan.nextLine();
        if (vatandaslik == 1) {
            yolcuBilgileri();
        } else if (vatandaslik == 0) {
            Turist obj = new Turist();
            obj.yolcuBilgileri();
        }


    }

    public void yolcuBilgileri() {
        System.out.println("Adınızı giriniz : ");
        String name = scan.nextLine();
        System.out.println("Soyadınızı giriniz : ");
        String surname = scan.nextLine();
        System.out.println("Cinsiyetinizi giriniz : ");
        String cinsiyet = scan.nextLine();
        System.out.println("Telefon no giriniz : ");
        String telefon = scan.nextLine();
        System.out.println("TC no giriniz : ");
        String tc = scan.nextLine();

        YerliMusteri musteri = new YerliMusteri(name, surname, cinsiyet, telefon, tc);

        musteriList.add(musteri);

        biletFiyati();

    }

    public void biletFiyati() {
    }


}
