package Gün04;

public class _07_SayiKelime {
    public static void main(String[] args) {
        String girilenKelime = "65" ; // Değer olarak Ahmet yazmasından farkı yoktur fakat toplama cıkartma çarpma gibi sayılarla yapılan
                                     // işlemler gerçekleştirilemez.
        System.out.println("Girilen Kelime = " + girilenKelime);

        // Kelimenin sayısa çevrilmesi.

       int intDeger = Integer.parseInt(girilenKelime);
       double doubleDeger = Double.parseDouble(girilenKelime);

       System.out.println("Integere Dönüştürülmüş String ifade = " + intDeger);
       System.out.println("Doubleye Dönüştürülmüş String İfade = " + doubleDeger);

        /*Bu gün hava 15 derece.
        görüntü rakam olsa bile toplanamadığı için yazıdır
        burada kelime olarak geçiyor.
        aslında bunu on beş gibi düşünebiliriz.
        Bu -> Kelime
        gün -> kelime
        hava ->kelime
        15 -> kelime   toplama yapamazsın bu yüzden

        int dereceSayi= Integer.parseInt(dereceYazi);*/

        /*    Rakamı yazıya çevirmek diyelim  */
        // Hava sıcaklığını rakam olarak tanımlayınız ve bir cümle şeklinde
        // Bu gun hava 12 derece yazdırınız.
        int sicaklik =12; // toplanabilir
        System.out.println("Bugun hava "+sicaklik+" derece."); // otomatik hali

        String sicaklikKelimeHali=Integer.toString(sicaklik); // toplanamaz
        //int toplam= sicaklikKelimeHali+sicaklikKelimeHali; // toplanamaz

        System.out.println("Bugun hava "+sicaklikKelimeHali+" derece."); // donüştürüldü
    }
}
