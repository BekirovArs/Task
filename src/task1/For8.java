package task1;

import java.util.Scanner;

public class For8 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите число А");
    int a = scanner.nextInt();
    System.out.println("Введите число В");
    int b = scanner.nextInt();
    int c = 1;
    for (int i = a; i <= b; i++) {
        c = c * i;
    }
    System.out.println(c);
  }
}
