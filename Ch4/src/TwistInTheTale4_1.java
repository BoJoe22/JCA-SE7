/**
 * Twist in the Tale 4.1 from the OCA Java SE 7 book by Mala Gupta (Manning Publications)
 * Created by Josef on 1/1/14.
 */
public class TwistInTheTale4_1 {
    public static void main(String[] args) {
        String letters = "ABCAB";
//        System.out.println(letters.substring(0,2).startsWith('A'));   //won't compile
        System.out.println(letters.substring(0,2).startsWith("A"));
    }
}
