public class Main {
    public static void main(String[] args) {

        int balance = 100; // начальный баланс
        int addBalance = 1100; // сумма пополнения баланса

        int bonus = 0; // бонус
        if (addBalance > 0) { // проверка, чтобы сумма пополнения была положительной
            if (addBalance > 1000) { // в задание было "более чем на 1000 рублей", поэтому знак >, а не >=
                bonus = addBalance / 100;
            }
            balance = balance + bonus + addBalance;
            System.out.println("Ваш баланс: " + balance + " рублей. " + "Ваш бонус: " + bonus + " рублей.");
        } else {
            System.out.println("Сумма пополнения не может быть отрицательной или равна нулю!");
        }
    }
}

