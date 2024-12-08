import java.util.Scanner;

public class Yolcu implements YurtDisiKurallari{

    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;

    public Yolcu(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Harc: ");
        this.harc = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Siyasi yasaginiz var mi?: ");
        String cevap = scanner.nextLine();

        if(cevap.equals("evet")){
            this.siyasiYasak = true;
        }

        else {
            this.siyasiYasak = false;
        }

        System.out.print("Vizeniz var mi?: ");
        String cevap2 = scanner.nextLine();

        if(cevap2.equals("evet")){
            this.vizeDurumu = true;
        }

        else {
            this.vizeDurumu = false;
        }
    }

    @Override
    public boolean yurtDisiHarciKontrol() {

        if(this.harc < 500) {
            System.out.println("Lutfen yurtdisi cikis harcini tam yatirin");
            return false;
        }

        else{
            System.out.println("Yurt disi harci isleminiz tamamlandi");
            return true;
        }
    }

    @Override
    public boolean siyasiYasakKontrol() {

        if(this.siyasiYasak){
            System.out.println("Siyasi yasaginizdan dolayi disari cikamazsiniz");
            return false;
        }

        else {
            System.out.println("Siyasi yasaginiz bulunmuyor");
            return true;
        }
    }

    @Override
    public boolean vizeDurumuKontrol() {

        if(this.vizeDurumu){
            System.out.println("Vize islemleriniz tamamlanmistir");
            return true;
        }

        else{
            System.out.println("Vizeniz bulunmamaktadir.");
            return false;
        }
    }
}