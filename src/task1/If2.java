package task1;

import java.util.Scanner;

public class If2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число а:");
        int a = scanner.nextInt();
        if(a < 0) System.out.println(a+1);
        else System.out.println(a-2);
    }

    }

