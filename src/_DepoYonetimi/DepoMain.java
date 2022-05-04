package _DepoYonetimi;

import java.util.*;

public class DepoMain {
    static Scanner scan = new Scanner(System.in);
    // static Map<Integer, String> urunMap = new HashMap<Integer, String>();
    static List<Urun> urunList = new ArrayList<>();

    public static void main(String[] args) {


        System.out.println("-----DEPO YÖNETİM PROGRAMI-----");
        secim();
    }

    private static void secim() {

        System.out.println("1- Ürün Tanımlama \n2- Ürün Ekleme\n3- Ürün Çıkış Yapma\n4- Ürünü Rafa Yerleştir\n5- Ürün Listeleme\n6- Programdan Çıkış Yap\nLütfen yapmak istediğiniz işlemi seçiniz : ");
        int sec = 0;
        try {
            sec = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Hatalı seçim yaptınız.. Tekrar deneyiniz..");
            scan.nextLine();
            secim();
        }
        switch (sec) {
            case 1:
                urunTanimla();
                break;
            case 2:
                urunEkle();
                break;
            case 3:
                urunCikis();
                break;
            case 4:
                urunRaf();
                break;
            case 5:
                UrunListele();
                break;
            case 6:
                exit();
                break;
            default:
                System.out.println("Hatalı seçim yaptınız.. Tekrar deneyiniz..");
                secim();
        }
    }

    private static void urunTanimla() {
        System.out.println("Ürünün ismini giriniz : ");
        String urunAd = scan.next();

        System.out.println("Ürünün üreticisini giriniz : ");
        String urunUretici = scan.next();

        System.out.println("Ürünün birimini giriniz : ");
        String urunBirim = scan.next();


        Urun urun1 = new Urun(urunAd, urunUretici, urunBirim);
        urunList.add(urun1);
        secim();

    }

    private static void urunEkle() {
        System.out.println("Eklemek istediğiniz ürünün id'sini Giriniz :");
        boolean bl = true;
        try {
            String idSec = scan.next();
            for (Urun w : urunList) {
                if (w.getId() == Integer.parseInt(idSec)) {
                    System.out.println("Ürünün miktarını giriniz : ");
                    int urunMiktar = scan.nextInt();
                    w.setMiktar(urunMiktar);
                    System.out.println("Yapılan İşlem ===> " + "Ürün ID : " + w.getId() + "  Ürün Ekleme : " + urunMiktar);
                    System.out.println("ID\t\tÜRÜN ADI\tÜRETİCİ\t\tMİKTARI\t\tBİRİMİ\t\tRAF\n-------------------------------------------------------------");
                    System.out.printf("%-8d%-12S%-12S%-12d%-12S%-10S", w.getId(), w.getUrunIsmi(), w.getUretici(), w.getMiktar(), w.getBirim(), w.getRaf());
                    System.out.println("\n");
                    bl = false;
                    secim();
                }
            }
            if (bl) throw new IllegalArgumentException();

        } catch (IllegalArgumentException e) {
            System.out.println("Hatalı ürün id'si girdiniz. Menü için 1'e Ürün ekleme için 2'ye basınız:");
            int secimYeni = scan.nextInt();
            switch (secimYeni) {
                case 1:
                    secim();
                    break;
                case 2:
                    urunEkle();
                    break;
                default:
                    System.out.println("Hatalı seçim yaptınız.. Tekrar deneyiniz..");
                    secim();
            }
        }catch (InputMismatchException e) {
            System.out.println("Hatalı giriş yaptınız.. Tekrar deneyiniz..");
            scan.nextLine();
            urunEkle();
        }
    }

    private static void urunCikis() {
        System.out.println("Çıkış yapmak istediğiniz ürünün id'sini Giriniz :");
        boolean bl = true;
        try {
            String idSec = scan.next();
            for (Urun w : urunList) {
                if (w.getId() == Integer.parseInt(idSec)) {
                    System.out.println("Ne kadar ürün çıkışı yapmak istiyorsunuz : ");
                    int urunMiktar = scan.nextInt();
                    w.setMiktar(w.getMiktar() - urunMiktar);
                    // urunGirisi		==> id:1000  urun girisi :5
                    System.out.println("Yapılan İşlem ===> " + "Ürün ID : " + w.getId() + "  Ürün Çıkışı : " + urunMiktar);
                    System.out.println("ID\t\tÜRÜN ADI\tÜRETİCİ\t\tMİKTARI\t\tBİRİMİ\t\tRAF\n-------------------------------------------------------------");
                    System.out.printf("%-8d%-12S%-12S%-12d%-12S%-10S", w.getId(), w.getUrunIsmi(), w.getUretici(), w.getMiktar(), w.getBirim(), w.getRaf());
                    System.out.println("\n");
                    bl = false;
                    secim();
                }
            }
            if (bl) throw new IllegalArgumentException();

        } catch (IllegalArgumentException e) {
            System.out.println("Hatalı ürün id'si girdiniz. Menü için 1'e Ürün çıkışı yapmak için 2'ye basınız:");
            int secimYeni = scan.nextInt();
            switch (secimYeni) {
                case 1:
                    secim();
                    break;
                case 2:
                    urunCikis();
                    break;
                default:
                    System.out.println("Hatalı seçim yaptınız.. Tekrar deneyiniz..");
                    secim();
            }
        }catch (InputMismatchException e) {
            System.out.println("Hatalı giriş yaptınız.. Tekrar deneyiniz..");
            scan.nextLine();
            urunCikis();
        }
    }

    private static void urunRaf() {
        System.out.println("Rafa eklemek istediğiniz ürünün id'sini Giriniz :");
        boolean bl = true;
        try {
            String idSec = scan.next();
            for (Urun w : urunList) {
                if (w.getId() == Integer.parseInt(idSec)) {
                    System.out.println("Ürünü hangi rafa koymak istiyorsunuz : ");
                    String urunRaf = scan.next();
                    w.setRaf(urunRaf);
                    System.out.println("Yapılan İşlem ===> " + "Ürün ID : " + w.getId() + "  Ürün Rafa Ekleme : " + urunRaf);
                    System.out.println("ID\t\tÜRÜN ADI\tÜRETİCİ\t\tMİKTARI\t\tBİRİMİ\t\tRAF\n-------------------------------------------------------------");
                    System.out.printf("%-8d%-12S%-12S%-12d%-12S%-10S", w.getId(), w.getUrunIsmi(), w.getUretici(), w.getMiktar(), w.getBirim(), w.getRaf());
                    System.out.println("\n");
                    bl = false;
                    secim();
                }
            }
            if (bl) throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            System.out.println("Hatalı ürün id'si girdiniz. Menü için 1'e Ürün rafa ekleme için 2'ye basınız:");
            int secimYeni = scan.nextInt();
            switch (secimYeni) {
                case 1:
                    secim();
                    break;
                case 2:
                    urunRaf();
                    break;
                default:
                    System.out.println("Hatalı seçim yaptınız.. Tekrar deneyiniz..");
                    secim();
            }
        }
    }

    private static void UrunListele() {
        System.out.println("ID\t\tÜRÜN ADI\tÜRETİCİ\t\tMİKTARI\t\tBİRİMİ\t\tRAF\n-------------------------------------------------------------");
        for (Urun w : urunList) {
            System.out.printf("%-8d%-12S%-12S%-12d%-12S%-10S", w.getId(), w.getUrunIsmi(), w.getUretici(), w.getMiktar(), w.getBirim(), w.getRaf());
            System.out.println();
        }
        System.out.println("\n");
        secim();
    }

    private static void exit() {
        System.out.println("iyi günler..");
    }


}
