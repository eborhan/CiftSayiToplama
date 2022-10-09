import java.util.Scanner;

public class CiftSayiToplama {
    public static void main(String[] args) {

        int n, sum = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Bir sayi giriniz: ");
            n = input.nextInt();
            if (n % 2 == 0) { // Ödev için de 4'ün katı da belirtiliyor fakat mode 2 her zaman mode 4'ü de kapsar.
                sum += n;
            }
        } while (n % 2 == 0);
            System.out.println("Hatalı değer. Program sonlandırılıyor...");

        System.out.println("Toplam: " + sum);
    }
}
