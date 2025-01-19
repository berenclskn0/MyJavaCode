import java.util.Scanner;

public class Main {

    public static <E extends Aday> E birinci(E e1, E e2, E e3){

        if (e1.puanHesapla() > e2.puanHesapla() && e1.puanHesapla() > e3.puanHesapla()){
            return e1;
        }

        else if (e2.puanHesapla() > e1.puanHesapla() && e2.puanHesapla() > e3.puanHesapla()){
            return e2;
        }

        else if (e3.puanHesapla() > e1.puanHesapla() && e3.puanHesapla() > e2.puanHesapla()){
            return e3;
        }
        else {
            return e1;
        }
    }
    public static void main(String[] args){
        System.out.println("TYT AYT Birinci Bulma Programi");

        Scanner scanner = new Scanner(System.in);

        String islemler = "Islemler...\n"
                + "1. Esit agirlik ogrencileri birincisi\n"
                + "2. Sayisal ogrencileri birincisi\n"
                + "Cikis : q";

        System.out.println("***********************");
        System.out.println(islemler);
        System.out.println("***********************");

        while (true){
            System.out.print("Islem seciniz: ");
            String islem = scanner.nextLine();

            if(islem.equals("q")){
                System.out.println("Programdan cikiliyor");
                break;
            }

            else if(islem.equals("1")){
                System.out.print("Birinci ogrencinin ismi: ");
                String isim1 = scanner.nextLine();

                System.out.print("Netler(Turkce,Matematik,Edebiyat,Fizik): ");
                int turkce1 = scanner.nextInt();
                int matematik1 = scanner.nextInt();
                int edebiyat1 = scanner.nextInt();
                int fizik1 = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Ikinci ogrencinin ismi: ");
                String isim2 = scanner.nextLine();

                System.out.print("Netler(Turkce,Matematik,Edebiyat,Fizik): ");
                int turkce2 = scanner.nextInt();
                int matematik2 = scanner.nextInt();
                int edebiyat2 = scanner.nextInt();
                int fizik2 = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Ucuncu ogrencinin ismi: ");
                String isim3 = scanner.nextLine();

                System.out.print("Netler(Turkce,Matematik,Edebiyat,Fizik): ");
                int turkce3 = scanner.nextInt();
                int matematik3 = scanner.nextInt();
                int edebiyat3 = scanner.nextInt();
                int fizik3 = scanner.nextInt();
                scanner.nextLine();

                EsitAgirlik ogrenci1 = new EsitAgirlik(turkce1, matematik1, edebiyat1, fizik1, isim1);
                EsitAgirlik ogrenci2 = new EsitAgirlik(turkce2, matematik2, edebiyat2, fizik2, isim2);
                EsitAgirlik ogrenci3 = new EsitAgirlik(turkce3, matematik3, edebiyat3, fizik3, isim3);

                EsitAgirlik birinci = birinci(ogrenci1,ogrenci2,ogrenci3);

                System.out.println("Esit Agirligin birincisi: " + birinci.getIsim());
                System.out.println("Birincinin puani: " + birinci.puanHesapla());
            }

            else if(islem.equals("2")){
                System.out.print("Birinci ogrencinin ismi: ");
                String isim1 = scanner.nextLine();

                System.out.print("Netler(Turkce,Matematik,Edebiyat,Fizik): ");
                int turkce1 = scanner.nextInt();
                int matematik1 = scanner.nextInt();
                int edebiyat1 = scanner.nextInt();
                int fizik1 = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Ikinci ogrencinin ismi: ");
                String isim2 = scanner.nextLine();

                System.out.print("Netler(Turkce,Matematik,Edebiyat,Fizik): ");
                int turkce2 = scanner.nextInt();
                int matematik2 = scanner.nextInt();
                int edebiyat2 = scanner.nextInt();
                int fizik2 = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Ucuncu ogrencinin ismi: ");
                String isim3 = scanner.nextLine();

                System.out.print("Netler(Turkce,Matematik,Edebiyat,Fizik): ");
                int turkce3 = scanner.nextInt();
                int matematik3 = scanner.nextInt();
                int edebiyat3 = scanner.nextInt();
                int fizik3 = scanner.nextInt();
                scanner.nextLine();

                Sayisal ogrenci1 = new Sayisal(turkce1, matematik1, edebiyat1, fizik1, isim1);
                Sayisal ogrenci2 = new Sayisal(turkce2, matematik2, edebiyat2, fizik2, isim2);
                Sayisal ogrenci3 = new Sayisal(turkce3, matematik3, edebiyat3, fizik3, isim3);

                Sayisal birinci = birinci(ogrenci1,ogrenci2,ogrenci3);

                System.out.println("Sayisalin birincisi: " + birinci.getIsim());
                System.out.println("Birincinin puani: " + birinci.puanHesapla());

            }

            else{
                System.out.println("Gecersiz islem");
            }
        }
    }
}
