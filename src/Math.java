public class Math {

    public int sum(int a, int b) {
        return a + b;
    }

    public int diff(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int division(int a, int b) {
        if (b == 0) {
            return -1;
        } else {
            return a / b;
        }
    }
}