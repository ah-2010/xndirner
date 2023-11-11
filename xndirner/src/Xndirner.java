import java.util.Scanner;

public class Xndirner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int number2 = sc.nextInt();

        GCD(number, number2);
    }

    public static void MekIcHarur() {
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }
    }

    public static void DoMekIcHarur() {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        }
        while (i <= 100);
    }

    public static void zuygTver() {
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }

    }

    public static void DoZuygTver() {
        int i = 1;
        do {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= 100);

    }

    public static void factorial(int number2) {
        int result = 1;
        int i = 1;
        while (i <= number2) {
            result = result * i;
            i++;
        }
        System.out.println(result);
    }

    public static void primeNumber(int i) {

        while (i <= 9) {
            System.out.println("this number is prime");
        }
        while (i > 9) {
            System.out.println("this number is not prime");
        }
    }

    public static void GCD(int n1, int n2) {
            int bajanarar = min(n1, n2);
            while (!(n2 % bajanarar == 0 && n1 % bajanarar == 0)) {
                bajanarar--;
            }
            System.out.println(bajanarar);
    }

    public static int min(int a, int b) {
        if (a > b) {
            return b;
        }
        return a;
    }
}


