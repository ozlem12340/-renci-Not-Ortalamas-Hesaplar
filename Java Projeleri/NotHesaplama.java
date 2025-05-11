
import java.util.Scanner;

public class NotHesaplama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Öğrenci sayısı: ");
        int sayi = sc.nextInt();

        for (int i = 1; i <= sayi; i++) {
            System.out.println("\n" + i + ". Öğrenci:");

            System.out.print("Vize: ");
            double vize = sc.nextDouble();

            System.out.print("Final: ");
            double fin = sc.nextDouble();

            double ort = vize * 0.4 + fin * 0.6;

            System.out.println("Ortalama: " + ort);
            System.out.println("Durum: " + (ort >= 60 ? "İyi" : "Kötü"));
        }

        sc.close();
    }
}
