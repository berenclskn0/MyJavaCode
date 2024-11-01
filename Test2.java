import java.util.Scanner;

class Calisan {
    public int no;
    public String ismi;
    public String soyisim;
    public double maas;
    public int tecrube;

    public Calisan(int no, String isim, String soyisim, double maas, int tecrube) {
        this.no = no;
        this.ismi = isim;
        this.soyisim = soyisim;
        this.maas = maas;
        this.tecrube = tecrube;
    }

    public void CalisanBilgileriGoster() {
        System.out.println("CALISAN BILGILERI");
        System.out.println("NO: " + no);
        System.out.println("ISMI: " + ismi);
        System.out.println("SOYISM: " + soyisim);
        System.out.println("MAAS: " + maas);
        System.out.println("TECRUBE: " + tecrube);
    }

    public void zamYap(int zamdegeri) {
        maas += zamdegeri;
        System.out.println("Maasiniza " + zamdegeri + " TL zam yapildi.");
        System.out.println("Guncel maasiniz: " + maas);
    }

    public void formatAt(String isletimSistemi, String kim) {
        System.out.println(kim + " suanda " + isletimSistemi + " isletim sistemine format atiyor.");
    }
}

public class Test2 {

    public static void main(String[] args) {

        System.out.println("**********UYGULAMAYA HOSGELDINIZ**********");

        Scanner scanner = new Scanner(System.in);

        System.out.print("NO: ");
        int no = scanner.nextInt();
        scanner.nextLine();

        System.out.print("ISIM: ");
        String isim = scanner.nextLine();

        System.out.print("SOYISIM: ");
        String soyisim = scanner.nextLine();

        System.out.print("MAAS: ");
        double maas = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("TECRUBE: ");
        int tecrube = scanner.nextInt();
        scanner.nextLine();

        Calisan calisan = new Calisan(no, isim, soyisim, maas, tecrube);

        String islemler = "1-Calisan bilgileri\n"
                + "2-Zam yap\n"
                + "3-Format at\n"
                + "0-Cikis";

        while (true) {
            System.out.println("------------------------");
            System.out.println(islemler);
            System.out.println("------------------------");
            System.out.print("Secim yapiniz: ");
            int secim = scanner.nextInt();
            scanner.nextLine();

            if (secim == 1) {
                calisan.CalisanBilgileriGoster();
            } else if (secim == 2) {
                System.out.print("Zam degerini giriniz: ");
                int zamDegeri = scanner.nextInt();
                scanner.nextLine();

                calisan.zamYap(zamDegeri);
            } else if (secim == 3) {
                System.out.print("Formati kim atacak: ");
                String kisi = scanner.nextLine();

                System.out.print("Isletim sistemini giriniz: ");
                String isletimSistemi = scanner.nextLine();

                calisan.formatAt(isletimSistemi, kisi);
            } else if (secim == 0) {
                System.out.println("Programdan cikiliyor...");
                break;
            } else {
                System.out.println("GECERSIZ ISLEM");
            }
        }
    }
}
