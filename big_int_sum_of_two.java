import java.util.*;
import java.math.BigInteger;

public class big_int_sum_of_two {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner read = new Scanner(System.in);
        BigInteger A = read.nextBigInteger();
        BigInteger B = read.nextBigInteger();
        read.close();
        BigInteger C = A.add(B);
        String z = C.toString();
        System.out.println(z);
    }
}
