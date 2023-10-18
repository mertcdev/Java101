import java.util.Scanner;

public class Main {

    static boolean asalMi(int sayi, int bolen) {
        if (bolen <= 1) {
            return true;
        }
        if (sayi % bolen == 0) {
            return false;
        }
        return asalMi(sayi, bolen - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        int sayi = scanner.nextInt();

        if (sayi <= 1) {
            System.out.println(sayi + " sayısı ASAL değildir !");
        } else {
            boolean asal = asalMi(sayi, sayi / 2);
            if (asal) {
                System.out.println(sayi + " sayısı ASALDIR !");
            } else {
                System.out.println(sayi + " sayısı ASAL değildir !");
            }
        }

        scanner.close();
    }
}