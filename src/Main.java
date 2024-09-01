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
        int[] expensesWeeks = {3500, 10000, 5200, 2800, 10500};
        int min = expensesWeeks[0];
        int max = expensesWeeks[0];
        for (int expense : expensesWeeks) {
            if (expense < min) {
                min = expense;
            }
            if (expense > max) {
                max = expense;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей." +
                "Максимальная сумма трат за неделю составила " + max + " рублей.");

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
        int left = 0;
        int right = reverseFullName.length - 1;
        while (left < right) {
            char temp = reverseFullName[left];
            reverseFullName[left] = reverseFullName[right];
            reverseFullName[right] = temp;
            left++;
            right--;
        }
        System.out.println(new String(reverseFullName));
    }
}