package Gün20;

public class _05_JavaMethod {
    public static void main(String[] args) {
        int s1=4;
        int s2=66;
        int s3=17;
        int s4=45;

       int sonuc1 =  topla(s1,s2);
       int sonuc2 = topla(s1,s2,s3);
       int sonuc3 = topla(s1,s2,s3,s4);// aynı bu şekilde tipleri aynı fakat sayıları farklı ise
        //bu tip durumlar için bir kolaylık  sağlanmış.

        System.out.println(sonuc1);
        System.out.println(sonuc2);
        System.out.println(sonuc3);



    }
    // gelen kaç sayı olursa olsun hepsini al dizi şeklinde metoda al
    public  static int topla (int ... sayılar) {  // kaç sayı gelirse gelsin onları dizi şeklidne alıyor
        int toplam = 0;
        for (int i = 0; i < sayılar.length; i++) {
            toplam = toplam+sayılar[i];
        }
        return toplam ;
    }


}
