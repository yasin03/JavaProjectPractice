package _UcusProjesi;

public class UcusProjesi {
    public static void main(String[] args) {
         /*
    A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.

    Bilet tarifesi:
    km birim fiyati : 0.10$
    yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
    12 ve 24 yas arasindaysa 10% indirim,
    65 yasindan buyukse 30% indirim,
    bilet gidis donus alinirrsa 20% indirim uygulayan bi app create ediniz

 */
        char sehir = 'B';
        int yas = 10;
        boolean gidisDonus = false;
        double km;


        switch (sehir) {

            case 'B':
                km = 500;
                System.out.println(yasUcret(yas, km, gidisDonus));
                break;
            case 'C':
                km = 700;
                System.out.println(yasUcret(yas, km, gidisDonus));
                break;
            case 'D':
                km = 900;
                System.out.println(yasUcret(yas, km, gidisDonus));
                break;
            default:
                System.out.println("Hatalı giriş yaptınız tekrar deneyiniz:");
        }
    }


    private static double yasUcret(int yas, double km, boolean gidisDonus) {
        double biletFiyat = 0;

        if (yas > 0 && yas <= 12) {
            biletFiyat = ((km * 0.10));
            biletFiyat = biletFiyat - (biletFiyat * 0.5);
        } else if (yas > 12 && yas <= 24) {
            biletFiyat = ((km * 0.10));
            biletFiyat = biletFiyat - (biletFiyat * 0.1);
        } else if (yas > 24 && yas <= 65) {
            biletFiyat = (km * 0.10);
        } else if (yas > 65) {
            biletFiyat = ((km * 0.10));
            biletFiyat = biletFiyat - (biletFiyat * 0.3);
        }

        if (gidisDonus) {
            biletFiyat = (biletFiyat - (biletFiyat * 0.2))*2;
        }
        return biletFiyat;
    }
}
