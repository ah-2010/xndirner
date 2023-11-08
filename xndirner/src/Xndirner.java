import java.util.Scanner;

public class Xndirner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
       MekIcHarur();
       DoMekIcHarur();
        zuygTver();
        DoZuygTver();
        factorial(number);
        primeNumber(number);
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
    public static void DoZuygTver(){
        int i = 1;
        do {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }while(i <= 100);

    }
    public static void factorial(int number2){
        int result = 1;
        int i = 1;
       while (i <= number2) {
            result = result * i;
            i++;
        }
        System.out.println(result);
    }
    public static void primeNumber(int i){

        while (i <= 9){
            System.out.println("this number is prime");
        }
        while(i > 9){
            System.out.println("this number is not prime");
        }
    }
    }

