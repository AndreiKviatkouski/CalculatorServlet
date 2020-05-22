package by.tms.servlet;

public class Calculator {
    public static int calculator(int a, int b, String operation) {
        int result = 0;
        switch (operation) {
            case ("sum"):
                result = sum(a, b);
                break;
            case ("minus"):
                result = minus(a, b);
                break;
            case ("div"):
                result = div(a, b);
                break;
            case ("multiply"):
                result = multiply(a, b);
                break;
        }
        return result;
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

    private static int multiply(int a, int b) {
        return a * b;
    }
}
