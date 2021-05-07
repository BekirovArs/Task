package task1;

import java.util.Scanner;

public class If12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int min;
        if(a>b){
            if(b<c) {
                min = b;
                System.out.println("Минимальное число = " + b);
            }
            }
        if(b>a){
            if(c>a){
                min=a;
                System.out.println("Минимальное число = " + a);
            }
        }
        if(a>c){
            if(b>c){
                min=c;
                System.out.println("Минимальное число = " + c);
            }
        }
    }
}
