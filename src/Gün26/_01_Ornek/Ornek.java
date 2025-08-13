package Gün26._01_Ornek;

public class Ornek {
    public static void main(String[] args) {
        // 1- Adım : Person isimli bir class tanımlayınız : name, surname, age
        // 2- Adım : main de 2 tane bu sınıftan nesne oluşturup deger atayınız.
        // 3- Adım : Bu degerlerı yazıdırınız.
        // 4- Adım : getBirthYear isminde Person a ait bir metod yazınız,
        //           çalıştığında kişinin doğum yılını versin.
        // 5- Adım : getInitials isminde kişiniz adının ilk harfi.soyadının ilk harfi
        //           şeklinde (Büyük harf) veren metodu yazınız. örnek ahmet demir : A.D.

        Person p1 =new Person();
        p1.name = "Mehmet Deniz";
        p1.surname= "Ünlü";
        p1.age=30;


        Person p2 = new Person();
        p2.name= "Büşra";
        p2.surname="Ünlü";
        p2.age=30;

        System.out.println("1.Personelin adı : "+p1.name+" soy adı : " +p1.surname+" yaşı : "+p1.age);
        System.out.println("2.Personelin adı : "+p2.name+" soy adı : " +p2.surname+" yaşı : "+p2.age);

        p1.getBirthYear(p1.age,p1.name);
         getInitials(p1);
         getInitials(p2);




    }

    public static void getInitials(Person p1){
        String adBuyukChar="";
        String bosluktanSonrakiHarf="";
        if (p1.name.contains(" ")) {
            int bosluk =  p1.name.indexOf(" ");
            adBuyukChar =  p1.name.substring(0,1).toUpperCase();
            bosluktanSonrakiHarf = p1.name.substring(bosluk+1,bosluk+2).toUpperCase()+".";
        } else {
            bosluktanSonrakiHarf="";
            adBuyukChar =  p1.name.substring(0,1).toUpperCase();
        }

        String soyAdBuyuk = p1.surname.substring(0,1).toUpperCase();

        System.out.println("Adı ve Soy adı kodu : " + adBuyukChar +"."+bosluktanSonrakiHarf+soyAdBuyuk);





    }


}
