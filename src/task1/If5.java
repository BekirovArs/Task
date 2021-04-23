package task1;

import java.util.Scanner;

public class If5 {
    public static void main(String[] args) {
        int count = 0;
        int count1 = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите числа а,b,c:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a>0){count++;
        }else{count1++;}
        if (b>0){count++;
        }else{count1++;}
        if (c>0){count++;
        }else{count1++;}
        System.out.println(count);
        System.out.println(count1);
    }
}
