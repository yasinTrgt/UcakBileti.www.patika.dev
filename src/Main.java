import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int yas,yolculukTipi;
        double toplamUcret,mesafe,normalUcret,indirimli,indirimli2, cocukIndirim = 0.50,
                ortayasIndirim=0.10 , yasliIndirim= 0.30,gidisDonus=0.20;
        Scanner sc = new Scanner(System.in);

        System.out.print("Mesafeyi Giriniz :");
        mesafe = sc.nextDouble();
        System.out.print("Yaşınızı Giriniz : ");
        yas = sc.nextInt();
        System.out.print("Yolculuk Tipini Seçiniz(1.Tek yön >> 2.Gidiş Dönüş) :");
        yolculukTipi = sc.nextInt();
        normalUcret = mesafe * 0.10;

        if(yolculukTipi ==1 && yas>=1 && mesafe>=1){
            if(yas<12){
                indirimli = normalUcret*cocukIndirim;
                toplamUcret = normalUcret - indirimli;
                System.out.print("Ücretiniz : " + toplamUcret + "TL");
            } else if (yas>=12 && yas<=24 ) {
                indirimli = normalUcret*ortayasIndirim;
                toplamUcret = normalUcret - indirimli;
                System.out.print("Üctetiniz : " + toplamUcret + "TL" );
            } else if (yas>65) {
                indirimli = normalUcret*yasliIndirim;
                toplamUcret = normalUcret - indirimli;
                System.out.print("Ücretiniz : " + toplamUcret + "TL");
            }else {
                toplamUcret = normalUcret;
                System.out.print("Üctetiniz : " + toplamUcret + "TL");
            }

        } else if (yolculukTipi==2 && yas>=1 && mesafe>=1) {
            if(yas<12){
                indirimli= normalUcret*cocukIndirim;
                toplamUcret= (normalUcret - indirimli)*2;
                indirimli2= toplamUcret - (toplamUcret * gidisDonus);
                System.out.print("Ücretiniz: " + indirimli2 + "TL");
            } else if (yas>=12 && yas<=24) {
                indirimli = normalUcret*ortayasIndirim;
                toplamUcret= (normalUcret - indirimli)*2;
                indirimli2 = toplamUcret -(toplamUcret * gidisDonus);
                System.out.print("Ücretiniz : " + indirimli2 + "TL");
            } else if (yas>65) {
                indirimli = normalUcret*yasliIndirim;
                toplamUcret= (normalUcret - indirimli)*2;
                indirimli2 = toplamUcret - (toplamUcret * gidisDonus);
                System.out.print("Ücretiniz : " + indirimli2 + "TL");
            }else {
                toplamUcret = normalUcret*2;
                indirimli2 = toplamUcret - (toplamUcret*gidisDonus);
                System.out.print("Ücretiniz : " + indirimli2 + "TL");

            }

        }else {
            System.out.println("Hatalı Giriş Yaptınız, Lütfen Tekrar Deneyiniz. ");
        }


    }
}
