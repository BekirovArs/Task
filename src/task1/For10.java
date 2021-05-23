package task1;

import java.util.Scanner;

public class For10 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите число N");
    int n = scanner.nextInt();
    double a = 1;
        for (int i = 1; i <n; i++) {
            a = a+(double)1/n;
        }
        System.out.println(a);

}}

