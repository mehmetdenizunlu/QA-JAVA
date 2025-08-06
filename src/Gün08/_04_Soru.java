package Gün08;

import java.util.Scanner;

public class _04_Soru {
    public static void main(String[] args) {
        // girilen 3 basamaklı bir sayının tersi olan sayıyı bulunuz.
        //  mesala 524  ->  425

        Scanner scan = new Scanner(System.in);
        System.out.println("3 basamaklı bir sayı giriniz : ");
        int sayi = scan.nextInt();

        int birlerBasamagi = sayi%10;
        int onlarBasamagi = (sayi/10) % 10;
        int yüzlerBasamagi = (sayi/100) % 10;

        int tersHali = birlerBasamagi*100+onlarBasamagi*10+yüzlerBasamagi*1;
        System.out.println(tersHali);




    }
}
