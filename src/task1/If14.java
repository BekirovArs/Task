package task1;

import java.util.Scanner;

public class If14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if(a>b){
            if(b>c){
                System.out.println("Наименьшее число=" + c);
                System.out.println("Наибольшее число=" + a);

            }
        }
        if(c>b){
            if(b>a){
                System.out.println("Наименьшее число=" + a);
                System.out.println("Наибольшее число=" + c);

            }
        }

        if(b>a){
            if(a>c){
                System.out.println("Наименьшее число=" + c);
                System.out.println("Наибольшее число=" + b);
            }
        }
        if(c>a){
            if(a>b){
                System.out.println("Наименьшее число=" + b);
                System.out.println("Наибольшее число=" + c);
            }
        }
        if(a>c){
            if (c>b){
                System.out.println("Наименьшее число=" + b);
                System.out.println("Наибольшее число=" + a);
            }
        }
        if(b>c){
            if (c>a){
                System.out.println("Наименьшее число=" + a);
                System.out.println("Наибольшее число=" + b);
            }
        }
    }
}
