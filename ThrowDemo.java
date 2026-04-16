public class ThrowDemo {
    public static void main(String[] args) {
        int i = 1;
        int j = 0;

        try {
            j = 18 / i;

            if (j == 18) {
                throw new ArithmeticException("i dont want to print 18");
            }

        } 
        catch (ArithmeticException e) {
            j = 18 / 1;
            System.out.println("cannot divide by zero " + e.getMessage());
        }

        catch (Exception c) {
            System.out.println("Something went wrong");
        }

        System.out.println(j);
        System.out.println("hi");
    }
}