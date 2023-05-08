public class Main {
    public static void main(String[] args) {

        // Объявляем переменные для начальной суммы счета и суммы пополнения
        double initialBalance = 100;
        double rechargeAmount = 1100;

        // Рассчитываем количество бонусных рублей
        double bonusAmount = 0;
        if (rechargeAmount > 1000) {
            bonusAmount = (rechargeAmount / 100);
        }

        // Рассчитываем итоговый счет
        double finalBalance = initialBalance + rechargeAmount + bonusAmount;

        // Выводим результат на экран
        System.out.println("Итоговый счет: " + finalBalance + " руб.");
        System.out.println("Количество бонусных рублей: " + bonusAmount + " руб.");
    }
}
