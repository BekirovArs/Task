package tasks;

public class java13 {
    public static void main(String[] args) {
        double a = 5;// R1
        double b = 4;// R2
        double c = 3.14;// П
        double var = c*(Math.pow(a, 2)); // S1
        double var1 = c*(Math.pow(b, 2)); // S2
        System.out.println(var);
        System.out.println(var1);
        System.out.println(var - var1); // S3

    }
}
