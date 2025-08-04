package Gün03;

public class _03_DataTypeMinMax {
    public static void main(String[] args) {
        byte byteMin = Byte.MIN_VALUE; // byte değerinini minimum değerini vermektedir
        byte byteMax = Byte.MAX_VALUE; // byte değerinini max değerini vermektedir.

        short shortMin = Short.MIN_VALUE;
        short shortMax= Short.MAX_VALUE;

        System.out.println("byte değerinini minimumu =" +byteMin);
        System.out.println("byte değerinini max =" +byteMax);
        System.out.println("short değerinini minimumu =" +shortMin);
        System.out.println("short değerinini max =" +shortMax);

        System.out.println("ınt'in max değeri = " + Integer.MAX_VALUE);
        System.out.println("ınt'in min değeri = " + Integer.MIN_VALUE);

        System.out.println("double'in max değeri = " + Double.MAX_VALUE);
        System.out.println("double'in min değeri = " + Double.MIN_VALUE);

        System.out.println("Long'in max değeri = " + Long.MAX_VALUE);
        System.out.println("Long'in min değeri = " + Long.MIN_VALUE);

        System.out.println("Float'in max değeri = " + Float.MAX_VALUE);
        System.out.println("Float'in min değeri = " + Float.MIN_VALUE);



    }
}
