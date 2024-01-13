import java.util.*;

public class method {
    public static void main(String[] args) {

        /* Dont't touch the code in this block */
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        inp.nextLine();
        int b = inp.nextInt();
        inp.nextLine();
        inp.close();
        System.out.println(add(a, b));
        System.out.println(multiply(a, b));
        /*******************************************/
    }

    public static int add(int a, int b) {
        int c = a + b;
        return c;
    }

    public static int multiply(int a, int b) {
        int c = a * b;
        return c;
    }

    // Your code goes here

}
