public class Main {
    public static void main(String[] args) {
        int ticketPrice = 1000;
        int amountRubles = 20;
        int amountBonusMiles = ticketPrice / amountRubles;
        System.out.println("Количество бонусных миль:" + amountBonusMiles);

    }
}