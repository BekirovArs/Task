package task1;

import java.util.Scanner;

public class For4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите стоимость 1-ого кг конфет");
        int a = scanner.nextInt();
        for (int i = 1; i < 11;i++) {
            int c =i*a;
            System.out.println(c);
     }
    }
}

