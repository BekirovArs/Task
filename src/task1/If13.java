package task1;

import java.util.Scanner;

public class If13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if(a>b){
            if(b>c){
                System.out.println("Среднее число =" + b);
            }
        }
        if(c>b){
            if(b>a){
                System.out.println("Среднее число =" + b);
            }
        }

        if(b>a){
            if(a>c){
                System.out.println("Среднее число =" + a);
            }
        }
        if(c>a){
            if(a>b){
                System.out.println("Среднее число =" + a);
            }
        }
        if(a>c){
            if (c>b){
                System.out.println("Среднее число =" + c);
            }
        }
        if(b>c){
            if (c>a){
                System.out.println("Среднее число =" + c);
            }
        }

    }
}
