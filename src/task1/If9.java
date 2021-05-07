package task1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class If9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число а:");
        int a = scanner.nextInt();
        System.out.println("введите число b:");
        int b = scanner.nextInt();

        if(a<b) {
            System.out.println("число а=" +a);
            System.out.println("число b=" +b);
        }else{
            int temp = b;
            b = a;
            a = temp;
            System.out.println("число а=" +a);
            System.out.println("число b=" +b);
        }




      }
    }

