package by.tms.servlet;

public class Calculator {
    public static int calculator(int a, int b, String operation) {
        int res = 0;
        switch (operation) {
            case ("sum"):
                res = sum(a, b);
                break;
            case ("minus"):
                res = minus(a, b);
                break;
            case ("div"):
                res = div(a, b);
                break;
            case ("mult"):
                res = mult(a, b);
                break;
        }
        return res;
    }

    private static int sum(int a, int b) {
        return a + b;
    }

    private static int minus(int a, int b) {
        return a - b;
    }

    private static int div(int a, int b) {
        return a / b;
    }

    private static int mult(int a, int b) {
        return a * b;
    }
}
