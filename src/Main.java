public class Main {

    public static void main(String[] args) {
        int amount = 10_000; // стоимость билета
        int waste = 20; // сумма для добавления 1 бонуса

        int bonus = amount / waste; // расчет количества добавленных бонусов
        System.out.println("вам начислено: " + bonus + " бонусов");
    }
}