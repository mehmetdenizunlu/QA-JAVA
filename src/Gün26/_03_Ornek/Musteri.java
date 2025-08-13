package Gün26._03_Ornek;

public class Musteri {
    String name;
    ElektirikHesabi elektirikHesabi;

    int eklenecekTüketim = 0;
    public void tuketimEkle(){

        eklenecekTüketim = eklenecekTüketim+ elektirikHesabi.toplamTüketim;
    }
}
