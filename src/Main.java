import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int ticketPrice = sc.nextInt();
        int oneBonusAmount = 20;

        int miles = ticketPrice / oneBonusAmount;
        System.out.println("Количество бонусных миль - " + miles);
    }
}