import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        // Kullanıcıdan boy ve kilo değerlerini alalım.
        Scanner input = new Scanner(System.in);
        System.out.print("Boyunuzu (metre cinsinden) giriniz: ");
        float boy = input.nextFloat();
        System.out.print("Kilonuzu (kilogram cinsinden) giriniz: ");
        float kilo = input.nextFloat();

        // Vücut kitle indeksini hesaplayalım.
        float bmi = kilo / (boy * boy);

        // Sonuçları ekrana yazdıralım.
        System.out.println("Vücut kitle indeksiniz: " + bmi);

    }
}