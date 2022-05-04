package _HastaneOtomasyon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VeriBankasi {

    /*
    protected List<Doktor> doktorList = new ArrayList<Doktor>();
    protected List<Hasta> hastaList = new ArrayList<Hasta>();
    protected List<Durum> durumList = new ArrayList<Durum>();
    */
    protected List<String> doktorAdi = Arrays.asList("Furkan","Ahmet","Uğur","Yavuz","Ayşe","Merve");
    protected List<String> doktorSoyadi = Arrays.asList("Türk","Yıldız","Soyozu","Kartal","Özkiraz","Boluğur");
    protected List<String> doktorUnvan = Arrays.asList("Alerjist","Nörolog","Genel Cerrah","Çocuk Doktoru","Dahiliye","Kardiolog");
    protected List<String> HastaAdiSoyadi = new ArrayList<String>();
    protected List<Integer> HastaId = new ArrayList<Integer>();
    protected List<String> AktuelDurum = Arrays.asList("Alerji","Baş Ağrısı","Diyabet","Çocuk hastalıkları","Migren","Kalp Hastalıkları");

    public VeriBankasi() {
    }
}
