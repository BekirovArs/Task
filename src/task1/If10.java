package task1;

import java.util.Scanner;

public class If10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число а:");
        int a = scanner.nextInt();
        System.out.println("введите число b:");
        int b = scanner.nextInt();
        if(a == b){
            a=0;
            b=0;
            System.out.println("Новое значение переменной a=" + a);
            System.out.println("Новое значение переменной b=" + b);
        }else{
            a =a+b;
            b =a;
            System.out.println("Новое значение переменной a=" + a);
            System.out.println("Новое значение переменной b=" + b);
        }
    }
}
