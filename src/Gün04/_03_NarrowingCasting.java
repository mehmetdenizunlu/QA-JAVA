package Gün04;

public class _03_NarrowingCasting {
    public static void main(String[] args) {
        double oran = 3.2;
        int sayi = 19;

        sayi = (int) oran;  // double tipindeki 3.2 degeri int tipine atıldı.
        // bu tip dönüşüme daraltma yönünde olduğundan Narrowing Casting denir.
        // diğer adıyla extra işlem yapıldığından manuel dönüşüm de denir.

    }
}
