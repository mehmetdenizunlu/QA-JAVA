package Gün26._01_Ornek;

public class Person {
    String name;
    String surname;
    int age;

    public  void getBirthYear(int age , String name) {
        int dogumYili = 2025-age;
        System.out.println(name+ " Personelin doğum yılı : " + dogumYili);
    }

}

