package task1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class For1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число K");
        int k = scanner.nextInt();
        System.out.println("Введите число N");
        int n = Math.abs(scanner.nextInt());
        for (int i = 0; i <n; i++) {
            System.out.println(k);

        };

        }

    }

