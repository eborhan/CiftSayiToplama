import java.util.*;

public class CiftSayiToplama {

    public static void main(String[] args) {

        int n, sum = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        n = scan.nextInt();

        for (int i= 0; i<=n; i++){
            if (i % 2 ==0)
                sum += i;
        }
        System.out.println("Toplam: "+sum);
    }
}
