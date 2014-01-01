/**
 * Twist in the Tale 4.2 from the OCA Java SE 7 book by Mala Gupta (Manning Publications)
 * Created by Josef on 1/1/14.
 */
public class TwistInTheTale4_2 {
    public static void main (String[] args) {
        // What would create StringBuilder with a default capacity of 16 characters?
//        StringBuilder name = StringBuilder.getInstance();
//        StringBuilder name = StringBuilder.createInstance();
//        StringBuilder name = StringBuilder.buildInstance();
        StringBuilder name = new StringBuilder();

        System.out.println(name.capacity());
    }
}
