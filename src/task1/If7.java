package task1;

import java.util.Scanner;

public class If7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа a,b");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a>b) {
            System.out.println("Наименьший порядковый номер =" + b);
        }else {
            System.out.println("Наименьший порядковый номер =" + a);
        }


    }
}
