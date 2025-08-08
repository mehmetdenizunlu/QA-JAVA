package Gün16;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {
        int sayi = 5; // daha önce değişkeni böyle tanımlıyorduk 1 tane yer açtı.
        int dizi [] = new int[5]; // 0,1,2,3,4  indexli 5 adet sayılık yer açtı hafızada

        System.out.println("Arrayin boyutu : " + dizi.length);

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < dizi.length; i++) {
            System.out.println("Sayi giriniz : ");
            dizi[i] = scan.nextInt();

        }

        System.out.println("4. indexteki değeri : " + dizi[4] );
    }
}
