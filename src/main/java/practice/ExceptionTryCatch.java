package practice;

public class ExceptionTryCatch {

    public static void main(String[] args) {
        divideSafely(10,0);
    }


    public static double divideSafely(double dividend, double divisor) {

        System.out.println("--- Starting division operation ---");

        try {
            if (divisor == 0) {
                // Бросаем исключение с английским сообщением
                throw new ArithmeticException("Error: Divisor cannot be zero.");
            }

            double result = dividend / divisor;
            return result;

        } catch (ArithmeticException e) {

            System.err.println("\n[ERROR HANDLING]: An exception occurred.");
            System.err.println("Message: " + e.getMessage());

            return 0.0;

        } finally {

            System.out.println("--- Operation finished (Cleanup, logging, etc.) ---");
        }
    }
}