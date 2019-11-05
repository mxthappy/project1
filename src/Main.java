import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(sumAnd(a, b));

    }

    public static int sumAnd(int a, int b) {
        return a + b;
    }
}
