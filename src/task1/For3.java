package task1;

import java.util.Scanner;

public class For3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число А");
        int a = scanner.nextInt();
        System.out.println("Введите число В");
        int b = scanner.nextInt();
        for (int i = b-1; i >a ; i--) {
            System.out.println(i);


        }int count= b-a-1;
        System.out.println("Кол-во чисел ="+count);

    }
}
