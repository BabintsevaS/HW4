import org.w3c.dom.ls.LSOutput;

public class HW4 {

    public static void main(String[] args) {

        int a = 1;
        int b = 0;

        Math math = new Math();

        System.out.println("Сумма: " + math.sum(a, b));
        System.out.println("Разница: " + math.diff(a, b));
        System.out.println("Умножение: " + math.multiply(a, b));
        if (b != 0) {
            System.out.println("Деление: " + math.division(a, b));
        } else {
            System.out.println("Делить на ноль нельзя!");
        }

//        hw41();
//
//        hw42();
//
//        hw43();

    }

    public static void hw41() {
        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("\n");
    }

    public static void hw42() {
        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < 9 - i; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("\n");

    }

    private static void hw43() {
        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < 9 - i; j++) {
                System.out.print("  ");
            }

            for (int j = i; j >= 0; j--) {
                System.out.print(j + " ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();

        }
        System.out.println("\n");
    }
}
