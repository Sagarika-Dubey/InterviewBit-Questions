import java.util.*;

public class if_else {
    public static void main(String[] args) {
        /*** Don't change the code here ***/

        Scanner inp = new Scanner(System.in);
        int M = inp.nextInt();
        inp.close();
        /*********************************/

        /** Write your code here **/
        if (M % 3 == 0 && M % 5 == 0) {
            System.out.print("Good Number");
        } else if (M % 3 == 0 && M % 5 != 0) {
            System.out.print("Bad Number");
        } else if (M % 3 != 0 && M % 5 == 0) {
            System.out.print("Poor Number");
        } else {
            System.out.print("-1");
        }

    }
}
