package Gün19;

public class _01_JavaMethod {
    public static void main(String[] args) {
        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba Dünya");

        Math.max(5,4);// daha önce yazılmış biz çağırıp kullanıyoruz
        // aynı bunun gibi bizde böyle metodlar yazabiliriz.
        // mesala ekrana merhaba dünya yazan bir metod yazalım ve onu sürekli çağıralım.

        MerhabaYaz(); // fonksiyonu çağırma şekli
        MerhabaYaz();
        MerhabaYaz();

    }// ANA kısım burada bitiyor DUR

    //ya da buraya

    public static void MerhabaYaz() {
        System.out.println("Merhaba Dünya");  // Metodlar tekrarlayan kodlardan kurtulup bir kere yazıp sonra tekrar çağırmak için
        // ve büyük programı parçalara bölüp kod karışıklığının önüne geçmek için kullanılır.
        // temiz kod için
    }
}
