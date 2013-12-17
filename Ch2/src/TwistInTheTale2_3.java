/**
 * Twist in the Tale 2.3 from the OCA Java SE 7 book by Mala Gupta (Manning Publications)
 * Created by Josef on 12/17/13.
 */
public class TwistInTheTale2_3 {
    public static void main (String[] args) {
        int a = 10;
        a = ++a + a + --a - --a + a++;
        System.out.println(a);
    }
}
