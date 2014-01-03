/**
 * Twist in the Tale 4.3 from the OCA Java SE 7 book by Mala Gupta (Manning Publications)
 * Created by Josef on 1/3/14.
 */
public class TwistInTheTale4_3 {
    public static void main(String[] args) {
        String multiStrArr[][] = new String[][] {
                {"A", "B"},
                null,
                {"Jan", "Feb", null}
        };

        System.out.println(multiStrArr[2][2]);
//        System.out.println(multiStrArr[1][1]);

        for (int i = 0; i < multiStrArr.length; i++) {
            if (multiStrArr[i] == null) { System.out.println("length:null\tnull"); continue; }

            System.out.print("length:" + multiStrArr[i].length + "\t");
            for (int j = 0; j < multiStrArr[i].length; j++) {
                System.out.print(multiStrArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
