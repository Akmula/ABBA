import java.util.Scanner;

public class abba {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число!");
        if (in.hasNextInt()) {
            int a = in.nextInt();
            int x = a % 5;
            int y = a % 7;
            if (a <= 0 || a > 101) {
                System.out.println(a);
            } else if (x == 0 && y == 0) {
                System.out.println("ABBA");
            } else if (x == 0) {
                System.out.println("A");
            } else if (y == 0) {
                System.out.println("B");
            } else {
                System.out.println(a);
            }
        } else {
            System.out.println("Ошибка. Вы ввели не целое число!");
        }
        System.out.println("До свидания!");
    }
}