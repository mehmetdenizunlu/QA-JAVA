package Gün25._02_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {
        // Bir okulda kayıt programı için Ogrenci bilgilerini alan modül
        // yazılacaktır. Ogrenci ye ait bilgiler (adi, soyadi, sinifi ve adres) vardır.
        // bu yapıyı oluşturunuz.
        // Daha sonra 3 tane öğrenci bilgilerini kullanıcıdan alarak doldurunuz.

        ArrayList<Ogrenci> snf = new ArrayList<>();
        Scanner scanInt = new Scanner(System.in);
        Scanner scanStr = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            Ogrenci ogr = new Ogrenci();
            System.out.print("Adını giriniz : ");
            ogr.name = scanStr.nextLine();
            System.out.print("Soy adını giriniz : ");
            ogr.surname = scanStr.nextLine();
            System.out.print("Sınıf Nosunu giriniz : " );
            ogr.schoolClass = scanInt.nextInt();
            System.out.print("Adresini giriniz : ");
            ogr.address = scanStr.nextLine();

            snf.add(ogr);

        }

        for(Ogrenci ogr : snf) {
            System.out.println("öğrencinin adı :" + ogr.name);
            System.out.println("öürencinin soyadı : " + ogr.surname);
            System.out.println("öğrencinin nosu : " + ogr.schoolClass);
            System.out.println("öğrencinin adresi : " + ogr.address);
        }

    }
}

class Ogrenci {
    String name ;
    String surname ;
    int schoolClass;
    String address;
}
