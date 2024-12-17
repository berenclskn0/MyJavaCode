import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String ismlemler = "ISLEMLER...\n"
                + "1. Kare Alan Hesapla\n"
                + "2. Ucgen Alan Hesapla\n"
                + "3. Daire Alan Hesapla\n"
                + "Cikis icin 'q' basiniz";

        while (true){
            System.out.println("********************");
            System.out.println(ismlemler);
            System.out.println("********************");

            System.out.print("Islem seciniz: ");
            String islem = scanner.nextLine();

            Sekil sekil = null;

            if(islem.equals("q")){
                System.out.println("Programdan cikis yapiliyor...");
                break;
            }

            else if(islem.equals("1")){
                System.out.print("Kenar: ");
                int kenar = scanner.nextInt();
                scanner.nextLine();

                sekil = new Kare("Kare1",kenar);

                sekil.alanHesapla();
            }

            else if(islem.equals("2")){
                System.out.print("Kenar 1: ");
                int kenar1 = scanner.nextInt();
                System.out.print("Kenar 2: ");
                int kenar2 = scanner.nextInt();
                System.out.print("Kenar 3: ");
                int kenar3 = scanner.nextInt();
                scanner.nextLine();

                sekil = new Ucgen("Ucgen1", kenar1, kenar2,kenar3);

                sekil.alanHesapla();
            }

            else if(islem.equals("3")){
                System.out.print("Yaricap: ");
                int yaricap = scanner.nextInt();
                scanner.nextLine();

                sekil = new Daire("Daire1", yaricap);

                sekil.alanHesapla();
            }

            else{
                System.out.println("Gecersiz islem yaptiniz...");
            }
        }
    }
}
