package task1;

import java.util.Scanner;

public class If6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число а:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a>b) {
            System.out.println("Большее число а = " + a);
        }else {
            System.out.println("Большее число b = " + b);
        }
    }
}
