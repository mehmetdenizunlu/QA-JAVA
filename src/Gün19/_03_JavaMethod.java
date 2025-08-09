package Gün19;

import java.util.Scanner;

public class _03_JavaMethod {
    public static void main(String[] args) {

        tekMiCiftMi(16);
        tekMiCiftMi(15);
        okuTekmiCiftMi();
        okuTekmiCiftMi();

    }

    public static void tekMiCiftMi(int a){

        if (a%2 == 0) {
            System.out.println(a+" Sayısı Bu sayı çifttir");
        } else {
            System.out.println(a +" Sayısı Bu sayı tektir.");
        }
    }

    public static void okuTekmiCiftMi() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı yazınız");
        int sayi = scan.nextInt();

        if (sayi%2 == 0) {
            System.out.println("Çifttir");
        }else {
            System.out.println("Tektir.");
        }
    }
}
