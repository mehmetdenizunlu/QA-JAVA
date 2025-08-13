package Gün25._03_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {
        ArrayList<Ogrenci> snf = new ArrayList<>();
        Scanner scanStr = new Scanner(System.in);
        Scanner scanInt = new Scanner(System.in);

        for (int i = 0; i <3 ; i++) {
            Ogrenci ogr = new Ogrenci();
            System.out.print("Ad: ");
            ogr.name = scanStr.nextLine();
            System.out.print("Soyad: ");
            ogr.surname = scanStr.nextLine();
            System.out.print("no: ");
            ogr.schoolNo = scanInt.nextInt();
            System.out.print("adress : ");
            ogr.address = scanStr.nextLine();

            snf.add(ogr);

        }

        for (Ogrenci ogr : snf) {
            System.out.println("ad : " + ogr.name);
            System.out.println("soyad : " + ogr.surname);
            System.out.println("no :" + ogr.schoolNo);
            System.out.println("addres : " + ogr.address);
        }
    }
}
