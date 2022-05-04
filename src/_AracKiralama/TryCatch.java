package _AracKiralama;

import java.util.InputMismatchException;

import static advjava.encapsulation01.Araba.scanner;


public class TryCatch {
    static int giris;
    static String kelime;


        public static int intGirisi() {
            try {
                giris = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("sayi gir");
                scanner.next();
                intGirisi();
            }
            return giris;
        }

        public static String stringGirisi() {
            try {
                kelime = scanner.nextLine().toLowerCase();
                String kontrol = kelime.replaceAll("\\D", "");
                String kontrol2 = kelime.replaceAll("\\w", "");
                if (kontrol.length() != 0 || kontrol2.length() != 0) {
                    throw new InputMismatchException("harf disinda karakter yok");
                }
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                stringGirisi();
            }

            return kelime;
        }






    }

