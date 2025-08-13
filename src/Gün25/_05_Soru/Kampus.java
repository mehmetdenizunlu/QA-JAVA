package Gün25._05_Soru;

public class Kampus {
    public static void main(String[] args) {
        // Bir kampus programı için asagıdaki özellikte bilgilerin
        // kaydedileceği clasları yazınız.
        // Okul :  adı, mudurAdi, ucreti(double)
        // Ogrenci : okulNo, tamAd, okulu

        // bu şekilde 1 öğrenci tanımlayıp bütün bilgileri kendiniz atayıp
        // yazdırınız.

        Ogrenci ogr = new Ogrenci();

        ogr.fullName="Mehmet Deniz Ünlü";
        ogr.schoolNo = 123;

        Okul okl = new Okul();
        okl.name="Hava org ibrahim fırtına";
        okl.mudurName="Burhaneddin";
        okl.price = 14.3;

        ogr.school = okl;

        System.out.println(ogr.school.name);
    }
}
