public class Xndirner {
    public static void main(String[] args) {
       MekIcHarur();
       DoMekIcHarur();
        zuygTver();
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
}
