import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz: ");
        int mesafe = scanner.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        int yas = scanner.nextInt();

        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        int yolculukTipi = scanner.nextInt();

        if (mesafe > 0 && yas > 0 && (yolculukTipi == 1 || yolculukTipi == 2)) {
            double biletFiyati = mesafe * 0.10;

            if (yas < 12) {
                biletFiyati *= 0.5; // %50 indirim
            } else if (yas <= 24) {
                biletFiyati *= 0.9; // %10 indirim
            } else if (yas >= 65) {
                biletFiyati *= 0.7; // %30 indirim
            }

            if (yolculukTipi == 2) {
                biletFiyati = (biletFiyati * 0.8) * 2.0;
            }

            // Toplam bilet fiyatını görüntüle
            System.out.println("Toplam Tutar: " + biletFiyati + " TL");
        } else {
            System.out.println("Hatalı Veri Girdiniz !");
        }

        scanner.close();
    }
}