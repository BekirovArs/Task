package task1;

import java.util.Scanner;

public class If15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if(a>b){
            if(c>b){
                System.out.println(a+c);

            }
        }
        if(a>c){
            if(b>c){
                System.out.println(a+b);

            }
        }
        if(b>a){
            if(c>a){
                System.out.println(b+c);
            }
        }
    }
}
