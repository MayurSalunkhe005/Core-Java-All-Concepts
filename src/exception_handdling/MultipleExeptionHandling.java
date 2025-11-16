package exception_handdling;

public class MultipleExeptionHandling {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int arr[] = {1, 2, 3};

        try {
            int c = a / b;  // ArithmeticException
            System.out.println(arr[5]);  // ArrayIndexOutOfBoundsException
        } 
        catch (ArithmeticException e) {
             System.out.println("Arithmetic Exception: " + e);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds: " + e);
        }
        

        System.out.println("Program continues...");
    }
}

