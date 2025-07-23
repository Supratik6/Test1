public class Main1 {
    public static void main(String[] args) {
        int a = 5;  // <-- missing semicolon fixed here
        int b = 0;
        try {
            System.out.println("Output: " + (a / b));
        }
        catch (ArithmeticException e) {
            System.out.println("There is an arithmetic exception: " + e.getMessage());
            System.out.println("There is an arithmetic exception: " + e.getStackTrace());
        }
        catch (Exception e) {
            System.out.println("There is an exception: " + e.getMessage());
        }
        finally {
            System.out.println("This block always executes.");
        }
    }
}
