import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Geçerli bir sayı girmelisiniz.");
            return;
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            int num = scanner.nextInt();

            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }
        }

        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);

        scanner.close();
    }
}