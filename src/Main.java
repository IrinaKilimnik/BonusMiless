public class Main {
    public static void main(String[] args) {

        int cost = 18438; // стоимость билета
        int mile = 20; // количество рублей для начисления одной бонусной мили
        int bonus = cost / mile;

        System.out.println("Начислено бонусных миль за покупку билета:");
        System.out.println((bonus) + " миль");
    }
}
