package _AracKiralama;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Islemler implements aracYonetimi {
    public static final String W = "\u001B[37m";
    public static final String R = "\u001B[31m";
    public static final String G = "\u001B[32m";
    public static final String Y = "\u001B[33m";
    public static final String B = "\u001B[34m";

    Map<Integer,AracOzellikleri> arac = new HashMap<>();
    Map<String,MusteriBilgileri> musteri= new HashMap<>();
    Map<Integer,KiralamaBilgileri> kiralama = new HashMap<>();



    public void secim() {

        System.out.println(R + "========================== İŞLEMLER =======================\r\n"
                + "   ____________________             ____________________    \n"
                + "   | 1-ARAC LISTELEME  |            | 2-ARAC KIRALAMA |  \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯    \n"
                + "   ____________________             ____________________    \n"
                + "   | 3- MUSTERI KAYDI |            | 4-ARAC IADE    |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯    \n"
                + "   ____________________             ____________________    \n"
                + "   | 5-MUSTERIYE TESLIM    |        | 6-CIKIS           |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯       " + B);

        System.out.print("ISLEM SECİNİZ : ");
        int sec = TryCatch.intGirisi();

        switch (sec) {
            case 1:
                defaultAraclar();
                aracListeleme();
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:

                break;
            default:
                System.out.println("Hatali deger girdiniz");
                secim();

        }


    }















    @Override
    public void defaultAraclar() {

        AracOzellikleri arac1 = new AracOzellikleri("tt","audi","dizel","oto","5",250);
        AracOzellikleri arac2 = new AracOzellikleri("city","cooper","dizel","manuel","5",350);
        AracOzellikleri arac3 = new AracOzellikleri("accord","honda","dizel","oto","5",150);
        AracOzellikleri arac4 = new AracOzellikleri("cls","mercedes","benzin","oto","5",350);
        AracOzellikleri arac5 = new AracOzellikleri("corolla","toyota","benzin","manuel","5",200);

        arac.put(arac1.getId(),arac1);
        arac.put(arac2.getId(),arac2);
        arac.put(arac3.getId(),arac3);
        arac.put(arac4.getId(),arac4);
        arac.put(arac5.getId(),arac5);



    }

    @Override
    public void odeme() {

    }

    @Override
    public void aracListeleme() {

        banner();
        aracYazdirma( arac);

    }

    @Override
    public void aracTalebi() {

    }

    @Override
    public void cikis() {

    }

    @Override
    public void musteriKaydi() {

    }

    @Override
    public void aracIade() {

    }

    @Override
    public void aracTeslim() {

    }

    public void aracYazdirma(Map<Integer,AracOzellikleri> arac) {

        Set<Map.Entry<Integer,AracOzellikleri>> setForm = arac.entrySet();



       for( Map.Entry<Integer,AracOzellikleri> each : setForm){

           System.out.printf("%-8d%-12S%-12S%-12S%-12S%8S%14.2f \n",each.getValue().getId(), each.getValue().getModel(),
                   each.getValue().getMarka() , each.getValue().getYakit() , each.getValue().getVites(),
                   each.getValue().getKoltukSayisi() , each.getValue().getUcret());


       }

    }

    public static void banner() {
        System.out.println("ID\t\tMODEL\t\tMARKA\t\tYAKIT\t\tVITES\t\tKOLTUKSAYISI\tUCRET" +
                "\n------------------------------------------------------------------------------------");

    }


}
