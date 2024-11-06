package IdmanProgrami;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Idman programina hosgeldiniz.");

        String islemler = "Gecerli hareketler\n"
                +"Burpee\n"
                +"Pushup\n"
                +"Situp\n"
                +"Squat";

        System.out.println(islemler);
        System.out.println("***********************");
        System.out.println("Bir idman olusturun...");

        System.out.print("Burpee sayisi: ");
        int burpee = scanner.nextInt();

        System.out.print("Pushup sayisi: ");
        int pushup = scanner.nextInt();

        System.out.print("Situp sayisi: ");
        int situp = scanner.nextInt();

        System.out.print("Squat sayisi: ");
        int squat = scanner.nextInt();
        scanner.nextLine();

        idman idman1 = new idman(burpee,pushup,situp,squat);

        System.out.println("Idmaniniz basliyor...");

        while(idman1.idmanBittiMi() == false){
            System.out.print("Hareket turu(Burpee,Pushup,Situp,Squat): ");
            String tur = scanner.nextLine();

            System.out.print("Bu haraketten kac tane yapacaksiniz: ");
            int sayi = scanner.nextInt();
            scanner.nextLine();

            idman1.hareketYap(tur,sayi);
        }

        System.out.println("Idmaninizi bitirdiniz tebrikler!!");
    }
}