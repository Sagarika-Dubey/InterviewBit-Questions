import java.lang.*;
import java.util.*;

public class substring {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String A = s.next();
        int L = s.nextInt();
        int R = s.nextInt();
        System.out.println(A.substring(L,R+1));
        s.close();
    }
}