public class Main {
    public static void main(String[] args) {

        int ticketPrice = 10000;
        int oneBonusAmount = 20;

        int miles = ticketPrice / oneBonusAmount;
        System.out.println("Количество бонусных миль - " + miles);
    }
}