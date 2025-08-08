package Gün15;

public class _01_JavaNestedLoop {
    public static void main(String[] args) {
        // 2 lerin çarpım tablosunu sormuştuk.
        // 2 x 1 =2
        // 2 x 2 =4
        // ....

        for (int i = 1; i <=10 ; i++) {

            for (int j = 1; j <=10 ; j++) {
                System.out.println(i+" X " + j + " = " + (i*j));
            }

            System.out.println();

        }
    }
}
