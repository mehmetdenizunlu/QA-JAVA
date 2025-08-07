package Gün13;

import java.util.Scanner;

public class _01_Switch {
    public static void main(String[] args) {
        // Girilen bir ay numarasına göre , ayın kaç gün olduğunu sayı ile yazdırınız

        Scanner scan  = new Scanner(System.in);
        System.out.println("Hangi Ayı seçmek istersiniz");
        int ay = scan.nextInt();

        switch (ay) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 Gün");break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 Gün"); break;
            case 2:
                System.out.println("28 Gün");break;
            default:
                System.out.println("Hatalı giriş yaptınız"); break;

        }

    }
}
