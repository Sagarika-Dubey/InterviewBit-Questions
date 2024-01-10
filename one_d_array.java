import java.util.*;

public class one_d_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Declare integer to get input
        int N = in.nextInt();
        // Declare an array with the given length
        int[] arr = new int[N];
        // Get all the input values of an array
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }
        // Print all the values of an array in reverse
        for (int i = N - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
