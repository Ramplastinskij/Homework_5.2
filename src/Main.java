public class Main {
    public static void main(String[] args) {
        System.out.println("Homework_5.2");

        //Task 1
        System.out.println();
        int[] expenses = {10000, 15000, 20000, 12000, 8000};
        int sum = 0;
        for (int expens : expenses) {
            sum += expens;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

        //Task 2
        System.out.println();
        int[] expensesWeek = {1500, 2000, 1200, 1800, 2500};
        int min = expensesWeek[0];
        int max = expensesWeek[expensesWeek.length - 1];
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей.");
        System.out.println("Максимальная сумма трат за неделю составила " + max + " рублей.");

        //Task 3
        System.out.println();
        int[] weeklyExpenses = {1000, 1500, 1200, 800, 2000};
        int totalExpenses = 0;
        for (int expense : weeklyExpenses) {
            totalExpenses += expense;
        }
        double averageExpenses = (double) totalExpenses / weeklyExpenses.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageExpenses + " рублей");

        //Task 4
        System.out.println();
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = temp;
        }
        String fullName = new String(reverseFullName);
        System.out.println(fullName);
    }
}