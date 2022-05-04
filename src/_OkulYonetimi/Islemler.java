package _OkulYonetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {
    static Scanner scan = new Scanner(System.in);
    static List<Ogrenci> ogrenciList = new ArrayList<>();
    static List<Ogretmen> ogretmenList = new ArrayList<>();
    String kisiTuru;

    public void anaMenu() {

        System.out.println("====================================\n" +
                " ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n" +
                "====================================\n" +
                " 1- ÖĞRENCİ İŞLEMLERİ\n" +
                " 2- ÖĞRETMEN İŞLEMLERİ\n" +
                " Q- ÇIKIŞ");

        String secim = scan.next();
        switch (secim) {
            case "1":
                kisiTuru = "Öğrenci";
                islem();
                break;
            case "2":
                kisiTuru = "Öğretmen";
                islem();
                break;
            case "Q":
                cikis();
                break;
            default:
                System.out.println("Hatalı giriş yaptınız.. Tekrar deneyiniz..");
                anaMenu();
                break;
        }
    }

    private void islem() {

        System.out.println("======== " + kisiTuru.toUpperCase() + " İŞLEMLERİ ========\n" +
                " 1-EKLEME\n" +
                " 2-ARAMA\n" +
                " 3-LİSTELEME\n" +
                " 4-SİLME\n" +
                " 5-ANA MENÜ\n" +
                " Q-ÇIKIŞ");
        String islem = scan.next();

        switch (islem) {
            case "1":
                ekle();
                islem();
                break;
            case "2":
                bul();
                islem();
                break;
            case "3":
                listele();
                islem();
                break;
            case "4":
                sil();
                islem();
                break;
            case "5":
                anaMenu();
                islem();
                break;
            case "Q":
                cikis();
                break;
            default:
                System.out.println("Lütfen geçerli bir giriş yapınız!");
                islem();
                break;
        }
    }

    private void cikis() {
        System.out.println("Yine bekleriz iyi günler..");
    }

    private void sil() {
        System.out.println("Silmek istediğiniz " + kisiTuru + " TC numarasını giriniz : ");
        String bul = scan.next();

        if (kisiTuru.equals("Öğrenci")) {
            for (int i = 0; i < ogrenciList.size(); i++) {
                if (bul.equals(ogrenciList.get(i).getKimlikNo())) {
                    ogrenciList.remove(i);
                    System.out.println(bul + " TC numaralı öğrenci silinmiştir.");
                }else{
                    System.out.println(bul+" kimlik numaralı öğrenci kayıtlı değildir.");
                }
            }
        } else if (kisiTuru.equals("Öğretmen")) {
            for (int i = 0; i < ogretmenList.size(); i++) {
                if (bul.equals(ogretmenList.get(i).getKimlikNo())) {
                    ogretmenList.remove(i);
                    System.out.println(bul + " TC numaralı öğretmen silinmiştir.");
                }else{
                    System.out.println(bul+" kimlik numaralı öğretmen kayıtlı değildir.");
                }
            }
        }
        islem();
    }

    private void bul() {
        System.out.println("Bulmak istediğiniz " + kisiTuru + " TC numarasını giriniz : ");
        String bul = scan.next();
        boolean flag = true;

        if (kisiTuru.equals("Öğrenci")) {
            for (Ogrenci w : ogrenciList) {
                if (w.getKimlikNo().equalsIgnoreCase(bul)) {
                    System.out.println("Ögrenci Adı : " + w.getAd() + " Öğrenci Soyadı : " + w.getSoyad() + " Öğrenci No : " + w.getNumara() + " Sınıfı : " + w.getSinif());
                    flag = false;
                }
            }
            if (flag) {
                System.out.println("Böyle bir öğrenci bulunamadı..");
            }
        } else if (kisiTuru.equals("Öğretmen")) {
            for (Ogretmen w : ogretmenList) {
                if (w.getKimlikNo().equalsIgnoreCase(bul)) {
                    System.out.println("Öğretmen Adı : " + w.getAd() + " Öğretmen Soyadı : " + w.getSoyad() + " Branşı : " + w.getBolum() + "TC No : " + w.getKimlikNo());
                    flag = false;
                }
            }
            if (flag) {
                System.out.println("Böyle bir öğretmen bulunamadı..");
            }
        }
        islem();
    }

    private void listele() {

        if (kisiTuru.equals("Öğrenci")) {
            System.out.println(ogrenciList);
        } else if (kisiTuru.equals("Öğretmen")) {
            System.out.println(ogretmenList);
        }
        islem();
    }

    private void ekle() {
        System.out.print("Adı:");
        String ad = scan.next();

        System.out.print("Soyad:");
        String soyad = scan.next();

        System.out.print("Kimlik No:");
        String kimlikNo = scan.next();

        System.out.print("Yaş:");
        int yas = 0;
        try {
            yas = scan.nextInt();
        } catch (Exception e) {
            System.out.println("Hatalı giriş yaptınız. Tekrar deneyiniz.");
            scan.nextLine();
            ekle();
        }

        if (kisiTuru.equals("Öğrenci")) {
            System.out.print("Sınıf:");
            String ogrenciSinif = scan.next();

            Ogrenci ogrenci = new Ogrenci(ad, soyad, kimlikNo, yas, ogrenciSinif);
            ogrenciList.add(ogrenci);
            System.out.println(kimlikNo+" kimlik numaralı öğrenci kayıt edilmiştir.");

        } else if (kisiTuru.equals("Öğretmen")) {
            System.out.print("Sicil No:");
            int sicil = 0;
            try {
                sicil = scan.nextInt();
            } catch (Exception e) {
                System.out.println("Hatalı giriş yaptınız. Tekrar deneyiniz.");
                scan.nextLine();
                ekle();
            }
            System.out.print("Branşı:");
            String brans = scan.next();

            Ogretmen ogretmen = new Ogretmen(ad, soyad, kimlikNo, yas, sicil, brans);
            ogretmenList.add(ogretmen);
            System.out.println(kimlikNo+" kimlik numaralı öğretmen kayıt edilmiştir.");
        }
        islem();
    }
}
