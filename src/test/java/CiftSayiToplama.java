import java.util.Scanner;

public class CiftSayiToplama {
    public static void main(String[] args) {

        int n, sum = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Bir sayı giriniz: ");
            n = input.nextInt();
            if (n % 2 == 0) { // Ödev içinde 4'ün katı da belirtiliyor fakat mode 2 her zaman mode 4'ü kapsar.
                sum += n;
            }
        } while (n % 2 == 0);
            System.out.println("Hatalı değer. Program sonlandırılıyor...");

        System.out.println("Girilen çift sayıların toplamı: " + sum);
    }
}
