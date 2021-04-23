package task1;

import java.util.Scanner;

public class If8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа a,b");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if(a<b) {
            System.out.println("Наибольшее число = " + b);
            System.out.println("Наименьшее число = " + a);
        }else {
            System.out.println("Наибольшее число = " + a);
            System.out.println("Наименьшее число = " + b);
        }
    }

}
