//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        // 1 задача
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        // 2 задача
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
        // 3 задача
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }
        // 4 задача
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        // 5 задача
        for (int year = 1904; year <= 2096; year = year + 4) {
            System.out.println(year + " год является высокосным");
        }
        // 6 задача
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.print(i + " ");
        }
        // 7 задача
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.print(i + " ");
        }
        // 8 задача
        int amountOfSavings = 29000;
        int totalOfSavings = 0;
        for (int i = 0; i <= 12; i++) {
            totalOfSavings =  totalOfSavings + amountOfSavings;
            System.out.println("Месяц " + i + " сумма накоплений равна " + totalOfSavings + " рублей");
        }
        // 9 задача

        int amountOfSavings2 = 29000;
        int totalOfSavings2 = 0;
        for (int i = 0; i <= 12; i++) {
            totalOfSavings2 = totalOfSavings2 + totalOfSavings2/100;
            totalOfSavings2 += amountOfSavings2;
            System.out.println("Месяц " + i + " сумма накоплений равна " + totalOfSavings2 + " рублей");
        }
        // 10 задача

        int number = 2;

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + "*" + i + "=" + number * i);
        }
    }
}