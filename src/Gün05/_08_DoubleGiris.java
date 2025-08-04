package Gün05;

import java.util.Scanner;

public class _08_DoubleGiris {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        //oku.useLocale(Locale.ENGLISH);

        System.out.print("Bır DOUBLE deger giriniz=");
        double deger=oku.nextDouble();

        //TR de , UK de .  kullanılıyor.
        System.out.println("deger = " + deger);
    }
}
