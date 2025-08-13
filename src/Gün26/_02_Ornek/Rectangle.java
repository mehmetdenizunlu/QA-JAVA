package Gün26._02_Ornek;

public class Rectangle {
    int width;
    int length;


    public void cevre(){
        int cevre = (width+length)*2;
        System.out.println("Cevresi : " + cevre);
    }

    public void alan() {
        int alan = width*length;
        System.out.println("Alanı : " + alan);
    }
}
