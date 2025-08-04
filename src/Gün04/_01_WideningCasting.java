package Gün04;

public class _01_WideningCasting {
    public static void main(String[] args) {
        // byte -> short -> char -> int -> long -> float -> double otamatik dönüşüm yapılır.
        int sayi = 5;
        long toplam = 10000;
        double oran = 3.14 ;

        oran = sayi;  // kayıp yaşanmadı.
        // bu tip dönüşüme genişletilme yönünde olduğundan buna Widening Casting denir.
        // diğer adıyla herhangi bir ek işlem yapılmadığından otomatik dönüşüm denir.

        System.out.println(oran);

        toplam = sayi ;

        System.out.println(toplam);

    }
}
