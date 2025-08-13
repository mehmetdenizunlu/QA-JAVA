package Gün26._02_Ornek;

public class Ornek {
    public static void main(String[] args) {
        // 1-Adım :Rectangle isminde ayrı bir dosyada olmak üzere sınıf yazınız.
        //         (properties, fields, özellik, eleman, items) : width, length
        // 2-Adım :Çevre bulmak üzere Cevre isminde bir metod yazınız.
        // 3-Adım :Dikdörtgenin alanını bulan Alan isimli bir metod yazınız.
        // 4-Adım :1 tane nesne ye deger vererek metodların sonuçları yazdırınız.

        Rectangle r1 = new Rectangle();
        r1.width=10;
        r1.length=20;

        Rectangle r2 = new Rectangle();
        r2.width=5;
        r2.length=10;

        r1.cevre();
        r2.cevre();
        r1.alan();
        r2.alan();
    }
}
