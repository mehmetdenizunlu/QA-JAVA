package Gün27._03_Soru;

import java.util.ArrayList;

public class Student {
    String name;
    ArrayList <Lesson> dersleri = new ArrayList<>();
    int maxCredit;

    public void dersEkle(Lesson ders) {
       int toplamKredi = 0;

       for (Lesson l : dersleri) {

           toplamKredi+=l.credit;
           System.out.println("Toplam kredi : " + toplamKredi);
       }

       if (toplamKredi+ders.credit<= maxCredit) {
           dersleri.add(ders);
           System.out.println("Eklendi : " + ders.name);
       }else
           System.out.println("Alınabilinecek kredi miktarı aşıldı="+ders.name);
    }
}
